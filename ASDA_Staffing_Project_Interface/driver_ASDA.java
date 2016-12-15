package ASDA_Staffing_Project_Interface;

/**
 * Created by ASUS on 15/12/2016.
 */
public class driver_ASDA implements staffing {
    @Override
    public String staffNames() {
        System.out.println("NAme  .....");
        return null;
    }

    @Override
    public int staffAge() {
        if (staffAge()<25){
            System.out.println("Sorry, minimum age to work for our logistic department is 25");}
            else if (staffAge()>=25);
                {
            System.out.println( staffAge() +"  Great!! ");
        }
        return 0;

    }

    @Override
    public void ninumber() {

    }

    @Override
    public long bankaccount() {
        return 0;
    }

    @Override
    public boolean doyouhavedriverlicence() {
        return false;
    }

    @Override
    public boolean criminalrecords() {
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
