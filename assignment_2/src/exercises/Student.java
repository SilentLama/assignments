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
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getStudentId() {
        return this.studentId;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.studentId + " " + this.weight + " " + this.birthday;
    }

}
