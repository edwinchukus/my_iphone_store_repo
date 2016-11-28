package file.input;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by dannyolu on 25/11/2016.
 */
public class HouseBill {


    private File myFile;

    public HouseBill() {

        String rootDir = System.getProperty("user.dir");

        String fileName = rootDir.concat("\\test_data\\bills.txt");

        myFile = new File(fileName);
    }


    public void CreateMyFile() {
        try {
            myFile.createNewFile();
            for (int x = 0; x > 5; x++) {
                if (myFile.exists() != true) {
                    myFile.createNewFile();
                } else {
                    break;
                }
            }
            System.err.println("We might care properly");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeIntoMyFile() throws IOException {
        FileWriter fileWriter = new FileWriter(myFile);
        fileWriter.write("Hey !!! we are cracking on !!!!");
        fileWriter.flush();
        fileWriter.close();
    }

    public void writeIntoMyFileOne(String[] texts) throws IOException {
        FileWriter fileWriter = new FileWriter(myFile);

        for (String text : texts) {
            fileWriter.write(text);

        }
//        fileWriter.write("Hey !!! we are cracking on !!!!");
        fileWriter.flush();
        fileWriter.close();
    }

    public void readContentOfFile() throws IOException {
        FileReader fileReader = new FileReader(myFile);
        char[] fileContent = new char[30];
        fileReader.read(fileContent);

        for(char content : fileContent){
            System.out.println(content);

        }

        fileReader.close();
    }
}

