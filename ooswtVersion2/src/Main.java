import controller.Controller;
import facade.Facade;
import view.View;

/*
 * starts application
 */
public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        View view = new View();
        view.setVisible(true);
        Controller controller = new Controller(view, facade);
    }
}
