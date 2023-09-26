import java.util.ArrayList;


public class Project7 {
    /*
    You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case"
     */
    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>();
        words.add("Ayesha");
        words.add("Abi");
        words.add("Deepali");
        words.add("Guilia");
        words.add("Jamel");
        words.add("Ehab");


        for (String str : words) {
            if (str.startsWith("a")||str.startsWith("A")) {
                System.out.println(str.toLowerCase());
            }
        }
    }
}