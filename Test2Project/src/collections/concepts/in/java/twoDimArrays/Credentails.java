package collections.concepts.in.java.twoDimArrays;

/**
 * Created by dotcom on 19/11/16.
 */
public class Credentails {

    private String[][] userCredentials;


    public Credentails(){
        userCredentials = new String[7][7]; // row = 2; column = 3
        userCredentials[0][0] = "e.jonhson";
        userCredentials[0][1] = "e.kate";
        userCredentials[0][2] = "b.smith";
        userCredentials[1][0] = "p@123";
        userCredentials[1][1] = "password";
        userCredentials[1][2] = "p0233";
    }


    public String[][] getUserCredentials(){
        return userCredentials;
    }

    public int getTotalDetails(){
        return userCredentials.length;
    }

    public String getStudent(){
        return userCredentials[5][6];
    }

    public String[] creatAraysWith(String sen) {
        String[] brokenWords = sen.split("a");
        return brokenWords;
    }
}
