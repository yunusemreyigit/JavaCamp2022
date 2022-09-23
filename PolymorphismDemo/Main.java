package PolymorphismDemo;

public class Main {

    public static void main(String[] args) {
        // DatabaseLogger databaseLogger = new DatabaseLogger();
        // EmailLogger emailLogger = new EmailLogger();
        // FileLogger fileLogger = new FileLogger();

        // databaseLogger.log();
        // emailLogger.log();
        // fileLogger.log();

        // BaseLogger[] loggers = new BaseLogger[] {
        // new DatabaseLogger(),
        // new EmailLogger(),
        // new FileLogger()
        // };

        // for (BaseLogger logger : loggers) {
        // logger.log();
        // }

        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.add();
    }
}