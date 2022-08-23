import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Source {
    public static void main(String[] args) {
    String str = "I like eating";
        System.out.println(reverseWords(str).equals("eating like I"));
    }
    public static String reverseWords(String str){
        List<String> list = Arrays.asList(str.split(" "));
        Collections.reverse(list);
        return String.join(" ", list);
    }
}
