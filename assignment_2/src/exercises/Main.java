package exercises;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Define some random names and such
        String[] firstNames = {"Nane", "Alwina", "Dennis", "Urban", "Fenno", "Ingeborg", "Sander", "Valmir", "Alois", "Wido"};
        String[] lastNames = {"Winkel", "Hirsch", "Sankt", "Wolf", "Schwab", "Gruenewald", "Wurfel", "Rothschild", "Fruehauf", "Zimmer"};
        double[] weights = {56d, 87d, 28d, 73d, 52d, 67d, 49d, 92d, 54d, 85d};
        // instantiate a student list
        StudentList studentList = new StudentList();
        // populate the student list
        for (int i = 0; i < 10; i++) {
            Student student = new Student(firstNames[i], lastNames[i], i, weights[i], new Date(0));
            studentList.add(student);
        }
        // test adding existing student
        StudentList studentListCopy = new StudentList(studentList);

        // ######## TESTS ########
        boolean addedExistingStudent = studentList.add(studentList.get(0)); // try to add the first student
        assert addedExistingStudent == false;

        // test removing first student
        Student removedStudent = studentList.remove(0);
        assert removedStudent != null;
        Student removedFalseIndex = studentList.remove(100);
        assert removedFalseIndex == null;
        // add the student back to the list and remove it with the other method call
        boolean addedRemovedStudent = studentList.add(removedStudent);
        assert addedRemovedStudent == true;
        boolean removed = studentList.remove(removedStudent);
        assert removed == true;

        // Test getter for student index
        Student getterStudent = studentList.get(0);
        assert getterStudent != null;
        getterStudent = studentList.get(100);
        assert getterStudent == null;

        // Test findLastname
        ArrayList<Integer> positions = studentList.findLastname("Hirsch");
        assert positions.size() > 0;
        positions = studentList.findLastname("Not Existing");
        assert positions.size() == 0;

        // Test findFirstName
        positions = studentList.findLastname("Nane");
        assert positions.size() > 0;
        positions = studentList.findLastname("Not Existing");
        assert positions.size() == 0;

        // Test findStudentId
        int studentId = studentList.findStudentId(3);
        assert studentId != -1;
        studentId = studentList.findStudentId(100);
        assert studentId == -1;


        studentList.sort(Student.SortKey.FIRSTNAME);
        studentList.sort(Student.SortKey.LASTNAME);
        studentList.sort(Student.SortKey.STUDENT_ID);
        studentList.sort(Student.SortKey.WEIGHT);
        studentList.sort(Student.SortKey.BIRTHDAY);



    }

}

