import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mo9t1x3 on 5/11/2016.
 */
public class ReverseString {
    public static void main(String[] args) {
        String in = "Sun rises in East";
        System.out.println(reverseString(in));

    }


    public static String reverseString(String in)
    {
        String[] words = in.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i] + " ");
        }
        return sb.deleteCharAt(sb.length()-1).toString();

    }
}
