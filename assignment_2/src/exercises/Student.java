package exercises;
import java.util.Date;

public class Student {
    String firstName;
    String lastName;
    long studentId;
    double weight;
    Date birthday;

    public enum SortKey {FIRSTNAME, LASTNAME, STUDENT_ID, WEIGHT, BIRTHDAY}

    Student() {
        this(null, null, 0, 0, new Date(0)); // TODO: Fix studentId Task 2.4
    }

    Student(String firstName, String lastName, long studentId, double weight, Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.weight = weight;
        this.birthday = birthday;
    }

    public String getFirstName() {
        /**
         * @return the first name of the student
         */
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        /**
         * Sets The first name of the student to the provided first name
         * @param firstName the new first name of the student
         */
        this.firstName = firstName;
    }

    public String getLastName() {
        /**
         * @return the last name of the student
         */
        return this.lastName;
    }

    public void setLastName(String lastName) {
        /**
         * Sets the last name of the student to the provided last name
         * @param lastName the new last name of the student
         */
        this.lastName = lastName;
    }

    public long getStudentId() {
        /**
         * @return the student ID of the student
         */
        return this.studentId;
    }

    public double getWeight() {
        /**
         * @return the weight of the student
         */
        return this.weight;
    }

    public void setWeight(double weight) {
        /**
         * Sets the weight of the student to the provided weight. Ideally this should be a positive double....
         * @param weight the new weight of the student.
         */
        this.weight = weight;
    }

    public Date getBirthday() {
        /**
         * @return the birthday of the student
         */
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        /**
         * Sets the birthday of the student to the provided birthday
         * @param birthday the new birthday of the student
         */
        this.birthday = birthday;
    }

    public String getName() {
        /**
         * Returns the full name of the student.
         * @return the concatenated name of the student, separated by whitespace
         */
        return this.firstName + " " + this.lastName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.studentId + " " + this.weight + " " + this.birthday;
    }

}
