public class project4 {

        /*
        Count the Number of Words in a String: Write a function to count the
    number of words in a given string. Words are separated by spaces or
    punctuation. For example, the input "Hello, world!" should return 2.
         */
        public static void main(String[] args) {


            String word = "This is Java HomeWork Project";
            String[] words = word.split(" ");
            System.out.println(words.length);

        }

        }
