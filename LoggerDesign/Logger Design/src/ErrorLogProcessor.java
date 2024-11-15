public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }
    public void log(int LogLevel, String message){
        if(LogLevel == ERROR){
            System.out.println("ERROR: " + message);
        }else{
            super.log(LogLevel, message);
        }
    }
}
