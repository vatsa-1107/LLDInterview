public class Main {
    public static void main(String[] args) {
        LogProcessor processor = new InfoLogProcessor(new DebugProcessor(new ErrorLogProcessor(null)));
        processor.log(LogProcessor.ERROR, "this is error");
        processor.log(LogProcessor.DEBUG, "this is debug");
        processor.log(LogProcessor.INFO, "this is info");
    }
}