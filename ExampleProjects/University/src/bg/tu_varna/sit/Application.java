package bg.tu_varna.sit;

public class Application {
    public static void main(String[] args) throws StudentException {
        Student[] students = new Student[10];
        Teacher[] teachers = new Teacher[10];
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < students.length; i++) {
            try {
                students[i] = new Student("FistName " + i, "Lastname " + i);
                teachers[i] = new Teacher("Teacher " + i, "Teacher " + i);
                numbers[i] = i*i;
            } catch (StudentException ex) {
                ex.printStackTrace();
            } finally {
                //students[i] = new Student(null, "finally " + i);
            }


            students[i].setCourse(Course.getRandom());
        }

        University<Student> studentUniversity = new University<>();
        studentUniversity.setItems(students);
        System.out.println(studentUniversity.itemsToString());

        University<Teacher> teacherUniversity = new University<>();
        teacherUniversity.setItems(teachers);
        System.out.println(teacherUniversity.itemsToString());

        University.print(numbers[0]);
        University.print(students[0]);
        University.print(teachers[0]);

//        university.setItems(numbers);
//        System.out.println(university.studentsToString());

        //System.out.println(university.toString());
    }
}
