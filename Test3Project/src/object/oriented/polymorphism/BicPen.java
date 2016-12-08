package object.oriented.polymorphism;

/**
 * Created by dotcom on 03/12/16.
 */
public class BicPen extends Pen {



    public BicPen(long penSeriaNumber){
        super(penSeriaNumber);
    }

    public void writeLetter(){
        super.writeLetter();
        System.out.println("Hello I am from the child");
        System.out.println("I can write letter from Child's with a pen with serial number of : "+ penSeriaNumber);
    }

    public void writeLetter(String testName){
        super.writeLetter(testName);
        System.out.println("Hello I am from the child");
        System.out.println("I can write letter from Child's with a pen with serial number of : "+ penSeriaNumber);
    }
}
