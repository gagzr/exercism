public class LogLevels {
    
    public static String message(String logLine) {
        int index = logLine.indexOf(":");
        if(index!=-1){
            return logLine.substring(index+1).trim();
        }
        return "";
    }

    public static String logLevel(String logLine) {
      int start = logLine.indexOf("[");
      int end = logLine.indexOf("]");
        if(start!=-1 && end!=-1){
            return logLine.substring(start+1,end).toLowerCase();
        }
        return " ";
    }

    public static String reformat(String logLine) {
        String newLogLine = message(logLine) + " ("+logLevel(logLine)+")";
        return newLogLine;
    }
}
