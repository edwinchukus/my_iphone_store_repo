package string.operators;

/**
 * Created by dotcom on 22/11/16.
 */
public class TestStrings {

    public static void main(String args[]){
        String name = " JOHNSTON Kelly ";

        String result = name.trim();

        boolean ans = result.equals("JOHNSTON Kelly");


        System.out.println(ans);
    }
}
