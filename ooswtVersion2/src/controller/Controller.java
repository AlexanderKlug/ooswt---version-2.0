package controller;

import basic.Constants;
import facade.Facade;
import symbol.SymbolException;
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
			this.currentView.getStatusTextField().setText("");									// clears status TextField
			String input = this.currentView.getEnterExpressionTextField().getText();
			Integer result = this.currentFacade.evaluate(input);
			this.currentView.getResultTextField().setText(result.toString());
		}catch(SymbolException f) {
			this.currentView.getResultTextField().setText("");										// clears result TextField
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
			this.currentFacade.checkSyntax(input);
			//Expression result = this.currentFacade.checkSyntax(input);
			this.currentView.getStatusTextField().setText(Constants.SYNTAXCORRECTLY);
		} catch(SymbolException f) {
			this.currentView.getStatusTextField().setText(f.getMessage());
		}
	}
}
