
import model.CanCalculateFactory;
import views.ConsoleView;

public class Main {
    public static void main(String[] args) {
        ConsoleView consoleView = new ConsoleView(new CanCalculateFactory());
        consoleView.run();
    }
}
