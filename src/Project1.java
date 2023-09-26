
    public class Project1 {
        /*
        Write a program to swap 2 String without a temporary variable?
         */
        public static void main(String[] args) {


            String a = "Ayesha";
            String b="Saif";

            System.out.println("Before swapping: ");
            System.out.println("a = "+a);
            System.out.println("b = "+b);

            a=a+b;
            b=a.substring(0,a.length()-b.length());
            a=a.substring(b.length());

            System.out.println("After swapping: ");
            System.out.println("a = " +a);
            System.out.println("b = " +b);

            System.out.println("*************************");



        }
    }

