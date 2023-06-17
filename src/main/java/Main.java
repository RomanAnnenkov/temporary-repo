
import model.logger.FileLogger;
import model.logger.LogCanCalculateFactory;
import model.logger.Logger;
import views.ConsoleView;

public class Main {
    public static void main(String[] args) {
        Logger logger = new FileLogger();
        LogCanCalculateFactory logCanCalculateFactory = new LogCanCalculateFactory(logger);
        ConsoleView consoleView = new ConsoleView(logCanCalculateFactory);
        consoleView.run();
    }
}
