public class App {
    public static void main(String[] args) throws Exception {
        String text = "Hello!";

        StringProcessor processor = 
            str -> StringUtils.toUpperCase(str);

        System.out.println(processor.process(text));
    }
}
