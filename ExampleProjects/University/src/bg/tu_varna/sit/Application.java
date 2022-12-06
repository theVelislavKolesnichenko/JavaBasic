package bg.tu_varna.sit;

import java.util.*;

public class Application {
    public static void main(String[] args) throws StudentException {

        List<Teacher> teachers = new ArrayList<>(10);
        HashSet<Student> students = new HashSet<>();
        University<Integer, Student> university = new University<>();
        int[] numbers = new int[10];
        Map<Integer, String> integerStringMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            //21621000 + new Random().nextInt(999)
            Student student = new Student("FistName " + i, "Lastname " + i, 21621000 + new Random().nextInt(999));
            try {
                teachers.add(new Teacher("Teacher " + i, "Teacher " + i));

                students.add(student);

                university.add(student.getNumber(), student);

                numbers[i] = new Random().nextInt(200);
            } finally {
                //students[i] = new Student(null, "finally " + i);
            }

            teachers.get(i).setAcademicPosition(AcademicPosition.ASSISTANT);
            student.setCourse(Course.getRandom());

            student.addSemestrilaKontrol("ООП-1ч", 50);
            student.addSemestrilaKontrol("ОК", 40);
            student.addSemestrilaKontrol("ДС", 50);

        }

//        integerStringMap.put(1119, Integer.toString(1119));
//        integerStringMap.put(1118, Integer.toString(1118));
//        integerStringMap.put(1117, Integer.toString(1117));
//        for (Map.Entry<Integer, String>  entry : integerStringMap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

        Collections.sort(teachers, new TeacherComparator());
        Collections.sort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return (o1.firstname + o1.lastname).compareTo(o2.firstname + o2.lastname);
            }
        });

        Collections.sort(teachers, Comparator.comparing(o -> (o.firstname + o.lastname)));

        for (Student student : students) {
            System.out.println(student);
        }

        for (Student student : students) {
            student.addSemestrilaKontrol("ООП-1ч", 90);
            System.out.println(student);
        }

        System.out.println(university);

        Map<Course, List<Student>> courseMap = getStudentsByCourse(university.getItems().values());

        for (Map.Entry<Course, List<Student>> entry : courseMap.entrySet()) {
            System.out.println(entry.getKey());
            for (Student student : entry.getValue()) {
                System.out.println(student);
            }
        }

    }

    public static Map<Course, List<Student>> getStudentsByCourse(Collection<Student> students) {
        Map<Course, List<Student>> courseMap = new HashMap<>();

        for (Student entry : students) {

            List<Student> newStudents = new ArrayList<>();

            if(courseMap.containsKey(entry.getCourse())) {
                newStudents = courseMap.get(entry.getCourse());
            }

            newStudents.add(entry);
            courseMap.put(entry.getCourse(), newStudents);
        }

        return courseMap;
    }
}
