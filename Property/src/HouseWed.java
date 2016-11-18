package wednesday;

/**
 * Created by dannyolu on 17/11/2016.
 */
public class HouseWed {


    private String houseType = "Flat";
    private int houseNo = 50;
    private double housePrice = 50000.00;
    protected char houseGrade;
    boolean threeBedRoom = true;


    public void RentingHouse() {
        System.out.println(houseType);
    }


    public void sellingMyHouse() {
        if (housePrice >= 50000.00) {
            System.out.println("I should sell");
        } else {
            System.out.println("Don't sell, wait after the BritExit");

        }
    }


    public void GradingHouse() {
        double houseGrade = 50000.00;
    }


   public void sethouseNo(int houseNo) {
       if(houseNo < 10){
           System.out.println("I am not going to set it");
       }else{
           this.houseNo = houseNo;
       }
   }

    public String getHouseType() {
        return houseType;
    }

    public double getHousePrice() {
        return housePrice;
    }
    public int gethouseNo() {
        return houseNo;
    }

}
