package bg.tu_varna.sit;

public class Teacher extends Person {
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
}