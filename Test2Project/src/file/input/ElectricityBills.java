package file.input;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dotcom on 24/11/16.
 */
public class ElectricityBills {


    private File myFile;


    public ElectricityBills(){
        String rootDir = System.getProperty("user.dir");

        System.out.println(rootDir);
//        String fileName = rootDir.concat("\\test_data\\bills.txt"); This format is for windows machine

        String fileName = rootDir.concat("/test_data/bills.txt");

        myFile = new File(fileName);


    }



    public void createMyFile(){
        try {
            myFile.createNewFile();
            for (int x = 0; x > 5; x++){
                if(myFile.exists() != true){
                    myFile.createNewFile();
                }else{
                    break;
                }
            }
            //System.err.println("Something went wrong with file creation process");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeIntoMyFile() throws IOException {
        FileWriter fileWriter = new FileWriter(myFile);
        fileWriter.write("Danny this your machine is still making noise");
        fileWriter.flush();
        fileWriter.close();
    }

    public void writeIntoOurCustomFileWithNewLineFirst(String text) throws IOException {
        FileWriter fileWriter = new FileWriter(myFile);
        fileWriter.write(text);
        fileWriter.flush();
        fileWriter.close();
    }

    public void writeIntoOurCustomFileWithNewLine(String[] texts) throws IOException {
        FileWriter fileWriter = new FileWriter(myFile);

        for(String text : texts){
            String processedText = text + "\n" + "\n";
            fileWriter.write(processedText);
        }

        fileWriter.flush();
        fileWriter.close();
    }


    public void ReadContentOfFile() throws IOException {
        FileReader fileReader = new FileReader(myFile);
        //char[] fileContent = new char[100];
        List<Character> fileContent = new ArrayList<Character>(){};
        fileReader.read();


        for(char content : fileContent){
            System.out.print(content);
        }

        fileReader.close();

    }
}
