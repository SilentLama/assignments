package exercises;
import java.util.ArrayList;

public class StudentList {

    ArrayList<Student> studentList;

    StudentList() {
        this.studentList = new ArrayList<>();
    }
    StudentList(StudentList studentList) {
        this(); // call the other constructor to initialize the studentList
        for (int i = 0; i < studentList.size(); i++) {
            this.studentList.add(studentList.get(i));
        }
    }

    private boolean containsId(final long studentId) {
        /**
         * Check whether a there is already a student with the same ID
         * @param studentId the ID of the student to be checked
         * @return true if the student is already in the list, false if it is not in the list
         */
        for (int i = 0; i < this.studentList.size(); i++) {
            if (studentId == this.studentList.get(i).getStudentId()) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Student student) {
        /**
         * Checks if the student (studentId) is already in the list and adds it if the student is not yet in the list
         * @param student the student that shall be added to the Studentlist
         * @return true if the student was added, false if the student is already in the list
         */
        if (this.containsId(student.getStudentId())) {
            return false;
        }
        this.studentList.add(student);
        return true;
    }

    public boolean remove(Student student) {
        /**
         * Removes a student with the matching studentId from the list
         * @return returns true if a student was deleted and false if nothing was removed from the list (the student was not in the list)
         */
        for (int i = 0; i < this.studentList.size(); i++) {
            if (student.getStudentId() == this.studentList.get(i).getStudentId()) {
                this.studentList.remove(i);
                return true;
            }
        }
        return false;
    }

    public Student remove(int pos) {
        /**
         * Deletes the student at the given index in the list if the index is valid.
         * @return Returns the student at the given position. If the position is invalid null is returned
         */
        if (pos < 0 || pos >= this.studentList.size()) {
            return null;
        }
        Student student = this.studentList.get(pos);
        this.studentList.remove(pos);
        return student;
    }

    public Student get(int pos) {
        /**
         * Returns the student at a given index in the list.
         * If the index is invalid (i.e less than zero or bigger than the list size) null is returned.
         * @param pos the position of the student to be returned in the array
         * @return Returns the student at the given position. If the position is invalid null is returned
         */
        if (pos < 0 || pos >= this.studentList.size()) {
            return null;
        }
        return this.studentList.get(pos);
    }

    public ArrayList<Integer> findLastname(String lastname) {
        /**
         * @return An ArrayList with all the positions of students matching that lastname
         */
        ArrayList<Integer> positions = new ArrayList<Integer>();
        for (int i = 0; i < this.studentList.size(); i++) {
            if (this.studentList.get(i).getLastName().equals(lastname)) {
                positions.add(i);
            }
        }
        return positions;
    }

    public ArrayList<Integer> findFirstName(String firstname) {
        /**
         * @return An ArrayList with all the positions of students matching that firstname
         */
        ArrayList<Integer> positions = new ArrayList<Integer>();
        for (int i = 0; i < this.studentList.size(); i++) {
            if (this.studentList.get(i).getFirstName().equals(firstname)) {
                positions.add(i);
            }
        }
        return positions;
    }

    public int findStudentId(long studentId) {
        /**
         * Iterate through all students and return the first match of the ID since we don't
         * allow duplicate IDs in the list
         * @return the position of the student in the student list
         */
        for (int i = 0; i < this.studentList.size(); i++) {
            if (this.studentList.get(i).getStudentId() == studentId) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        /**
         * @return Return the amount of Students in the list
         */
        return this.studentList.size();
    }

    public ArrayList getStudents() {
        /**
         * @return returns the ArrayList holding the student objects
         */
        return this.studentList;
    }

    @Override
    public String toString() {
        String result = new String();
        for (Student student: this.studentList) {
            String studentString = student.getFirstName() + " " + student.getLastName() + " " + student.getStudentId() + " " + student.getWeight() + " " + student.getBirthday() + " ";
            result += studentString;
        }
        return result;
    }

    private boolean swap(Student.SortKey key, Student s1, Student s2) {
        /**
         * Helper method to decide whether two students in the list should be swapped (bubblesort)
         * @param key the enum to pick the correct attribute (field) of the student for comparison
         * @param s1 the first student (the one with the lower index in the list)
         * @param s2 the second student (the one with the higher index in the list)
         */
        boolean swap = false;
        switch (key) {
            case FIRSTNAME: {
                swap =  s1.getFirstName().trim().compareToIgnoreCase(s2.getFirstName().trim()) > 0;
                break;
            }
            case LASTNAME: {
                swap =  s1.getLastName().trim().compareToIgnoreCase(s2.getLastName().trim()) > 0;
                break;
            }
            case STUDENT_ID: {
                swap =  s1.getStudentId() > s2.getStudentId();
                break;
            }
            case WEIGHT: {
                swap =  s1.getWeight() > s2.getWeight();
                break;
            }
            case BIRTHDAY: {
                swap =  s1.getBirthday().after(s2.getBirthday());
                break;
            }
            default: {
                break;
            }
        }
        return swap;
    }

    public void sort(Student.SortKey key) {
        /**
         * Sorts for the given key of the ENUM which corresponds to a Attribute (Field) of the Student.
         * Bubble sort is used for simplicity
         * @param key the enum provided to set the search parameter
         */
        for (var i = 0; i < this.studentList.size(); i++) {
            for (int j = 0; j < this.studentList.size() - i - 1; j++) {
                Student student_1 = this.studentList.get(j);
                Student student_2 = this.studentList.get(j + 1);
                if (this.swap(key, student_1, student_2)) {
                    this.studentList.set(j, student_2);
                    this.studentList.set(j + 1, student_1);
                }
            }
        }
    }
}
