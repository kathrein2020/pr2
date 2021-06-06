public class Main {
    public static void main(String[] args) {
        int x = 3, y = 4;
        int value = add();
        int result = add(value, y = 10);
        System.out.println(result);
    }
}

    class add {

   int x, y;
   int res = x+y;
   }