package objects.oreinted.programming;

/**
 * Created by dotcom on 15/11/16.
 */
public class ElectricCar {

    private String carName = "Passat";
    private double carPrice = 56000.00;
    private int carAge = 3;
    private boolean hasRegisterationPaper = true;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public boolean isHasRegisterationPaper() {
        return hasRegisterationPaper;
    }

    public void setHasRegisterationPaper(boolean hasRegisterationPaper) {
        this.hasRegisterationPaper = hasRegisterationPaper;
    }
}
