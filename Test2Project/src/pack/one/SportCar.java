package pack.one;

/**
 * Created by dotcom on 15/11/16.
 */
public class SportCar extends Car {

    int carAGe;
    double carPrice = 56000.00;
    boolean isRegistered = true;



    public void speedTest(){
        double carTax = 45;
        System.out.println(carPrice + carTax);
    }

    public void lightTest(){
        System.out.println(carPrice);
    }
}


