package file.input;

import java.io.IOException;

/**
 * Created by dotcom on 24/11/16.
 */
public class Runner {


    public static void main(String args []) throws IOException {
        ElectricityBills bill = new ElectricityBills();

        bill.createMyFile();
       // bill.writeIntoMyFile();
        String[] text = {"John", "Kelly", "Robert", "Mugabe", "Donald", "Trump"};

        bill.writeIntoOurCustomFileWithNewLine(text);

        bill.ReadContentOfFile();
    }
}
