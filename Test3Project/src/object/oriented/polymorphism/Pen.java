package object.oriented.polymorphism;

/**
 * Created by dotcom on 03/12/16.
 */
public class Pen {

    protected long penSeriaNumber;

    public Pen(long penSeriaNumber){
        this.penSeriaNumber = penSeriaNumber;
    }

    public void writeLetter(){
        System.out.println("Hello I am from the parent");
        System.out.println("I can write letter with a pen with serial number of : "+ penSeriaNumber);
    }

    public void writeLetter(String testName){
        System.out.println("Hello I am from the parent"+testName);
        System.out.println("I can write letter with a pen with serial number of : "+ penSeriaNumber);
    }

}
