package collections.concepts.in.java.oneDimArrays;

/**
 * Created by dotcom on 17/11/16.
 */
public class Students {
    private int studentAges[];

    public Students(){
        studentAges = new int[5];
        studentAges[0] = 23;
        studentAges[1] = 25;
        studentAges[2] = 30;
        studentAges[3] = 20;
        studentAges[4] = 25;
    }

    public void getArrayIndex(){
        for (int student : studentAges) {
             System.out.println(student);
        }
    }

    public int getTotalStudents(){
        return studentAges.length;
    }

    public int[] getAllStudents(){
        int [] classB = studentAges.clone();
        return classB;
    }

    public String findStudent(int studentAge) {
        int[] j = studentAges.clone();

        for(int age : studentAges){
           if(age == studentAge) {
               return "Yes";
           }
        }
        return "No";
    }


    public void showMyStudentAges(){
        for (int studentAge: studentAges) {
            System.out.println(studentAge);
        }
    }

    public void showStudentAges(){
        for (int x = 0; x < studentAges.length; x++){
            System.out.println(studentAges[x]);
        }
    }

    // Five different student in this class
//    private int studentOneAge = 23;
//    private int studentTwoAge = 25;
//    private int studentThreeAge = 30;
//    private int studentFourAge = 20;
//    private int studentFiveAge = 25;


    //index = 0, 1, 2, etc

   public void checkBasicArrayConcepts(){
//       int studentAges[] = new int[5];
//       studentAges[0] = 23;
//       studentAges[1] = 25;
//       studentAges[2] = 30;
//       studentAges[3] = 20;
//       studentAges[4] = 25;

//       String[] studentNames = new String[10];
//       studentNames[2] = "Ruth Klose";

//       double[] schoolFees = new double[]{2500.00, 2450.00};
//       double[] schFees = {7820, 7800, 45120, 56214};


       boolean[] studentAttendanceStatus = {true, false, true, true, false};

       System.out.println(studentAttendanceStatus[0]);
   }


}
