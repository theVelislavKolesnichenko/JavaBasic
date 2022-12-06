package bg.tu_varna.sit;

public class Teacher extends Person implements Comparable<Teacher> {
    private AcademicPosition academicPosition;

    public Teacher(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setAcademicPosition(AcademicPosition academicPosition) {
        this.academicPosition = academicPosition;
    }

    @Override
    public String toString() {
        return academicPosition +
                " " + firstname + ' ' +
                lastname;
    }

    @Override
    public int compareTo(Teacher o) {
        return lastname.compareTo(o.lastname);
    }
}