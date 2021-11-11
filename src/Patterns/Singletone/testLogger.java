package Patterns.Singletone;

public class testLogger {
    public static void main(String[] args) {
        System.out.println(Logger.getInstance().toString());
        System.out.println(Logger.getInstance().toString());
        System.out.println(Logger.getInstance().toString());
        System.out.println(Logger.getInstance().toString());
        System.out.println(Logger.getInstance().toString());
        System.out.println(Logger.getInstance().toString());
        System.out.println(Logger.getInstance().toString());
        Logger.createLog("123");
        Logger.createLog("456");
        Logger.createLog("789");
        Logger.showLog();

    }
}
