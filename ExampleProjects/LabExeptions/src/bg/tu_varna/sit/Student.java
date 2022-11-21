package bg.tu_varna.sit;

public class Student {
    private String firstname;
    private String lastname;
    private Course course;

    public Student(String firstname, String lastname) throws StudentException {
        this.setFirstname(firstname);
        this.setLastname(lastname);
    }

    private void setFirstname(String firstname) throws StudentException {
        if (firstname == null || firstname.isEmpty()) {
            throw new StudentException("firstname");
        }
        this.firstname = firstname;
    }

    private void setLastname(String lastname) throws StudentException {
        if (lastname == null || lastname.isEmpty()) {
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
}
