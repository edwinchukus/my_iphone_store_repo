package footballers;

/**
 * Created by Nick on 26/11/2016.
 */
public class FootballLeague {

    public static  void main (String []arg) {

        FootballerBonus footballerBonus = new FootballerBonus();

        footballerBonus.setSalaryAmount(4500);

        footballerBonus.giveBonus();
    }
}
