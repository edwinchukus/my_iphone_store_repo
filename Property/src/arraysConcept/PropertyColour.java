package arraysConcept;

/**
 * Created by dannyolu on 18/11/2016.
 */
public class PropertyColour {


    private double[] propertyPrices = {1,2,3,4,5};

    public void showBuildingColour() {

        String propertyColour[] = new String[3];
        propertyColour[0] = "blue";
        propertyColour[1] = "white";
        propertyColour[2] = "Red";

        double[] propertyPrices = new double[]{500.00, 600.00,700.00,800.00};
        double[] propertyPrice = {250.00, 300.00,150.00,100.00};
        double propertyPri [] = {260.00, 200.00};
        System.out.println(propertyPri[1]);
    }


    public void displayPropertyPrice(){
        for (double propertyPrice: propertyPrices ) {
            System.out.println(propertyPrices);
        }

    }

    public void displayPropertyPrice1(){
        for ( double p = 0;p < propertyPrices.length;p++) {
            System.out.println(p);
        }

    }



}
