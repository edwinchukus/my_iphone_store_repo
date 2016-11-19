package collections.concepts.in.java.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dotcom on 19/11/16.
 */
public class ShoppingCart {

    private List<String> myBlackFridayShopping;

    public ShoppingCart(){
        myBlackFridayShopping = new ArrayList<String>();
        myBlackFridayShopping.add("Camera");
        myBlackFridayShopping.add("MacBook");
        myBlackFridayShopping.add("Windows 10");
        myBlackFridayShopping.add("Samsung");
    }


    public String getItem(int itemNumber){
        return myBlackFridayShopping.get(itemNumber);
    }

    public void showAllItems(){
        for (int i = 0; i<myBlackFridayShopping.size(); i++){
            System.out.println(myBlackFridayShopping.get(i));
        }
    }

    public void displayAllItems(){
        for(String list : myBlackFridayShopping){
            System.out.println(list);
        }
    }
}
