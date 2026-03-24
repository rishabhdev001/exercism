public class LogLevels {
    
    public static String message(String logLine) {
        String[] arr = logLine.split(":");
        return arr[1].trim();
    }

    public static String logLevel(String logLine) {
        String level = logLine.split(":",2)[0].replace("[","").replace("]","").toLowerCase();
        return level;
        
    }
    public static String reformat(String logLine) {
        String msg = message(logLine);
        String level = logLevel(logLine);
        return  msg + " (" + level + ")";
    }
}
