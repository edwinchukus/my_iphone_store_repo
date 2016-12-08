import error.handling.FastFood;

public class Main {

    public static void main(String[] args) {

        FastFood driver = new FastFood();
        try{
            driver.addTwoNumbers(5, 0);
        }catch (ArithmeticException a){
            System.out.println("Int");
        }
        try {
            driver.add();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
