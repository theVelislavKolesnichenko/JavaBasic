package bg.tu_varna.sit;

public class University {
    private Student[] students;

    public  University() {
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < students.length; i++) {
            output += "Студент "
                    + i
                    + ": "
                    + students[i].toString()
                    + "\n";
        }

        return output;
    }

    public String studentToString() {
        StringBuffer output = new StringBuffer();
        for (int i = 0; i < students.length; i++) {
            output.append("Студент ")
                    .append(i)
                    .append(": ")
                    .append(students[i])
                    .append('\n');
        }

        return output.toString();
    }
}
