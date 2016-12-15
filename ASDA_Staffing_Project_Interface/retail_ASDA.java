package ASDA_Staffing_Project_Interface;


import java.util.Scanner;

/**
 * Created by ASUS on 15/12/2016.
 *
 *
 */
public class retail_ASDA implements staffing {


    @Override
    public String staffNames() {
        System.out.println("My Name is ....");
        return null;
    }

    @Override
    public int staffAge() {

        if (staffAge() <18){
        System.out.println("Sorry the legal age to work with out company is 18 ");}
        else if (staffAge()>= 18);{
            System.out.println( staffAge() + "! We can proceed with this application");
                    return 0;    }}

    @Override
    public void ninumber() {
        System.out.println("National Insurance NUmber");

    }

    @Override
    public long bankaccount() {
        return 0;
    }

    @Override
    public boolean doyouhavedriverlicence() {

        if (true) System.out.println("offer higher position that involve moving from one store to another ");
        return false;
    }

    @Override
    public boolean criminalrecords() {
        if (true) System.out.println("Verify with police to know what the offence is,in other to know what post to offer");

        else System.out.println("Proceed with the application");
        return false;
    }

    @Override
    public double salary() {
                return 0;
    }

    @Override
    public int yeasofExpirince() {
        return 0;
    }
}
