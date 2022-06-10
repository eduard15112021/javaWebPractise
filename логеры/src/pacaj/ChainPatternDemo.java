package pacaj;

public class ChainPatternDemo {
    private static AbstaraktLoger getChainOfLoggers(){
        AbstaraktLoger errorLoger = new ErrorLoger(AbstaraktLoger.ERROR);
        AbstaraktLoger fileLoger = new FileLogger(AbstaraktLoger.DEBUG);
        AbstaraktLoger consoleLoger = new ConsoleLogger(AbstaraktLoger.INFO);

        errorLoger.setNextLoger(fileLoger);
        fileLoger.setNextLoger(consoleLoger);

        return errorLoger;
    }

    public static void main(String[] args) {
        AbstaraktLoger logerChain = getChainOfLoggers();

        logerChain.logMassage(AbstaraktLoger.INFO, "This is information");

        logerChain.logMassage(AbstaraktLoger.DEBUG, "This is an debug level information");

        logerChain.logMassage(AbstaraktLoger.DEBUG, "This is an debug level information");
    }

}
