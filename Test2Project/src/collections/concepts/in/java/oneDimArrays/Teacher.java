package collections.concepts.in.java.oneDimArrays;

/**
 * Created by dotcom on 19/11/16.
 */
public class Teacher {


    private int[] students;

    public void setStudents(int[] students) {
        this.students = students;
    }

    public String findStudent(int studentAge) {

        for(int age : students){
            if(age == studentAge) {
                return "Yes";
            }
        }
        return "No";
    }
}
