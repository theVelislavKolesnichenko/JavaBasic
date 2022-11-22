package bg.tu_varna.sit;

import java.util.Objects;

public class Student extends Person  {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    private Course course;

    public Student(String firstname, String lastname) throws StudentException {
        this.setFirstname(firstname);
        this.setLastname(lastname);
    }

    public void setFirstname(String firstname) throws StudentException {
        if (firstname == null) {
            throw new StudentException("firstname");
        }
        this.firstname = firstname;
    }

    public void setLastname(String lastname) throws StudentException {
        if (lastname == null) {
            throw new StudentException("lastname");

        }
        this.lastname = lastname;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return firstname + ' ' + lastname + ' ' + course;
    }


    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
