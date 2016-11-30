package error.handling;

/**
 * Created by dotcom on 29/11/16.
 */
public class FastFood {


//    public void addTwoNumbers(int x, int y){
//       try{
//           double result = x /y;
//           System.out.println(result);
//
//       }catch (Throwable throwable){
//           double result = y /x;
//           System.out.println(result);
//
//       }
//    }


    public void addTwoNumbers(int x, int y) throws ArithmeticException {
        try {
            double result = x / y;
            System.out.println(result);
        } catch (ArithmeticException ae) {
            throw new ArithmeticException("Please go and learning");
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            throw new ArrayIndexOutOfBoundsException("Please go and ensure that you are not using more memory than declare");
        } finally {
            throw new ArithmeticException("Please go and learning");
        }
    }

        public void add() throws InterruptedException {
         Thread.sleep(34444);

        }
}
