public class loader{
    public static void main(String[] args){
        String ch1 = "h";
        String ch2 = "i";
        String ch3 = "b";
        System.out.println(decode(ch1)+decode(ch2)+decode(ch3));
    }
    public static String decode(String ch){
        return switch(ch) {
            case "h" -> System.out.println("Hello!");
            case "i" -> System.out.println("I can decode!");
            case "b" -> System.out.println("Bye!");
            default -> System.out.println("I don't know these symbols");
        };
    }
}