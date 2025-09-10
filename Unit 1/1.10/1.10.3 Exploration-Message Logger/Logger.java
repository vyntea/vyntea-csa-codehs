public class LogRunner
{
    public static void main(String[] args)
    {
        // Initiate log for computer system
        String log = "Computer System R48 Log:\n";

        // Add messages to log
        log = Logger.logInfo(log, "Application started successfully.");
        log = Logger.logWarning(log, "Low memory detected.");
        log = Logger.logError(log, "An unexpected error occurred.");
        log = Logger.logInfo(log, "Application restarted successfully.");

        // Print out log
        System.out.println(log);

        // Use helper method to reset log, then print
        log = resetLog(log, "R52");
        System.out.println();
        System.out.println(log);
    }

    public static String resetLog(String oldLog, String systemNum)
    {
        oldLog = "Computer System " + systemNum + " Log:\n";
        return oldLog;
    }
}
