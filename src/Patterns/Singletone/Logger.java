package Patterns.Singletone;

public class Logger {
    private static Logger instance;
    private static String log = "Init string ..... \n\n";
    private Logger() {

    }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public static void createLog(String info ){
        log += info + "\n";
    }
    public static void showLog(){
        System.out.println(log);
    }


}
