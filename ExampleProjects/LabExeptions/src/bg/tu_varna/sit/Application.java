package bg.tu_varna.sit;

public class Application {

    public static void main(String[] args) throws StudentException {
        System.out.println(Integer.MAX_VALUE);
        Student[] students = new Student[100000];
        for (int i = 0; i < students.length; i++) {
            try {
                students[i] = new Student(
                        "Firstname " + i,
                        "Lastname " + i);
            } catch (StudentException e) {
               e.printStackTrace();
            } finally {
                students[i] = new Student(
                        "finally " + i,
                        "finally " + i);
            }

            students[i].setCourse(Course.getRandom());
        }

        University university = new University();
        university.setStudents(students);
        //System.out.println(university);
        System.out.println(university.studentToString());
    }
}
