public class App {
    public static void main(String[] args) throws Exception {
        String text = "Hello!";

        StringProcessor processor = 
            StringUtils::toUpperCase;

        System.out.println(processor.process(text));
    }
}