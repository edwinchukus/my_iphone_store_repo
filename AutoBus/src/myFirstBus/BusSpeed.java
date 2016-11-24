package myFirstBus;

import java.util.Scanner;

/**
 * Created by Nick on 17/11/2016.
 */
public class BusSpeed {


    /**
     * Created by Nick on 11/11/2016.
     */


        public static void main(String[] args) {

            System.out.println("Please enter your bus speed in mph");

            Scanner scanner = new Scanner(System.in);

            double busSpeed = scanner.nextDouble();


            while (busSpeed <= 40 || busSpeed >= 65) {

                if (busSpeed <= 40) {

                    System.out.println("Your speed is low and I'm going to increase it mate" +  busSpeed);
                    busSpeed++;


                } else if (busSpeed >= 65) {

                    System.out.println("Your speed is high and above the limit & I'm going to reduce it mate" +  busSpeed);

                    busSpeed--;

                }
            }
        }
    }






