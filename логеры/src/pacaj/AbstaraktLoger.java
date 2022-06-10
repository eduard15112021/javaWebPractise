package pacaj;

public class AbstaraktLoger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected  AbstaraktLoger nextLoger;

    public void setNextLoger(AbstaraktLoger nextLoger){
        this.nextLoger=nextLoger;
    }

    public logMassage(int level, String massage){
        if(this.level<=level){
            Write(massage);
        }
        if (nextLoger != null){
            nextLoger.logMassage(level,massage);
        }
    }

    abstract protected void Write(String massage);
}
