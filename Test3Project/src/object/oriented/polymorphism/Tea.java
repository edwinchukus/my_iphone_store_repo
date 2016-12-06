package object.oriented.polymorphism;

/**
 * Created by dotcom on 03/12/16.
 */
public class Tea {


    private String teaName;
    private int teaNumber;
    private double teaPrice;


    public Tea(){
        this.teaName = "Lipton";
        this.teaNumber = 5;
        this.teaPrice = 50;
    }

    public Tea(String teaName){
        this.teaName = teaName;
        this.teaNumber = 5;
        this.teaPrice = 50;
    }


    public Tea(String teaName, int teaNumber){
        this.teaName = teaName;
        this.teaNumber = teaNumber;
        this.teaPrice = 50;
    }

    public Tea(String teaName, int teaNumber, double teaPrice){
        this.teaName = teaName;
        this.teaNumber = teaNumber;
        this.teaPrice = teaPrice;
    }


    public void drinkTea(){
        System.out.println("This is parameterless method that took no argument");
    }

    public void drinkTea(String teaName){
        System.out.println("This method takes one string arg "+teaName);
    }


    public void drinkTea(SalesGirl salesGirlName){
        System.out.println("This method takes one string arg "+salesGirlName);
    }


    public void drinkTea(int teaName){
        System.out.println("This method takes one string arg "+teaName);
    }

    public void drinkTea(int teaName, String shopName){
        System.out.println("This method takes one string arg "+teaName);
    }

    public void drinkTea(String shopName, int teaName){
        System.out.println("This method takes one string arg "+teaName);
    }


    public void drinkTea(double shopName, int teaName){
        System.out.println("This method takes one string arg "+teaName);
    }


    public void drinkTea(int teaName, int shopName){
        System.out.println("This method takes one string arg "+teaName);
    }


    public void drinkTea(String teaName, String shopName){
        System.out.println("This method takes one string arg "+teaName);
    }

    public void drinkTea(String teanName, String shopName, String teaOnwer){
        System.out.println("This method takes one string arg "+teanName);
    }



}
