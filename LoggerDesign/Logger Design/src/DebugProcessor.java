public class DebugProcessor extends LogProcessor{
    public DebugProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == DEBUG){
            System.out.println("DEBUG: " + message);
        }else{
            super.log(logLevel, message);
        }
    }
}
