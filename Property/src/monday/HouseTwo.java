package monday;

import wednesday.HouseWed;

/**
 * Created by dannyolu on 17/11/2016.
 */

public class HouseTwo {


    public String paintColour = "Red";


    public void paintingTheRoom() {
        System.out.println(paintColour);
    }

    public void Decorating() {
        paintingTheRoom();
        HouseWed houseWed = new HouseWed();
        double price = houseWed.getHousePrice();
        System.out.println(price);



//         if (houseNo == 60){
//             System.out.println("hey");
//         }else {
//             System.out.println("Hello");
//         }
//
        houseWed.sethouseNo(60);
        houseWed.gethouseNo();


    }

}
