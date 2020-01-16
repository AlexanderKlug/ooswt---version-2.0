package controller;

import basic.Constants;
import exceptions.DivisionException;
import exceptions.SymbolException;
import facade.Facade;
import parser.Expression;
import view.View;

/*
 * Application controller based on model-view-controller design
 * connecting entity between application logic and user interface
 */
public class Controller {
	private View currentView;																	// current application view
	private Facade currentFacade;																// cuirrent application facade
	
	/*
	 * constructor
	 */
	public Controller(View view, Facade facade) {
		this.currentView = view;
		this.currentFacade = facade;
		this.currentView.getEvaluateButton().addActionListener((l) -> {
			this.onEvaluateButtonPressed();
		});
		this.currentView.getCheckSyntaxButton().addActionListener((l) -> {
			this.onCheckSyntaxButtonPressed();
		});
	}
	
	/*
	 * evaluates user entered expression from "enterExpressionTextField" 
	 * shows the expression's value in the view's "resultTextField"
	 */
	public void onEvaluateButtonPressed() {
		try {
			this.currentView.getStatusTextField().setText("");										// clear status TextField
			this.currentView.clearTreeContent();													// clear Tree Content
			String input = this.currentView.getEnterExpressionTextField().getText();
			Integer result = this.currentFacade.evaluate(input);
			this.currentView.getResultTextField().setText(result.toString());
		}catch(SymbolException | DivisionException f) {
			this.currentView.getResultTextField().setText("");										// clear result TextField
			this.currentView.clearTreeContent();													// clear Tree Content
			this.currentView.getStatusTextField().setText(f.getMessage());							// show error message at status TextField
		}
	}
	

	/*
	 * checks syntax of user entered expression from "enterExpressionTextField" 
	 * shows result at statusTextField
	 */
	public void onCheckSyntaxButtonPressed() {
		try {
			String input = this.currentView.getEnterExpressionTextField().getText();
			Expression result = this.currentFacade.checkSyntax(input);
			this.currentView.getStatusTextField().setText(Constants.SYNTAXCORRECTLY);
			this.currentView.setTree(result);
		} catch(SymbolException f) {
			this.currentView.clearTreeContent();													// clear Tree Content
			this.currentView.getStatusTextField().setText(f.getMessage());							// set Error Message
		}
	}
}
