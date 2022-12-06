package bg.tu_varna.sit;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.firstname.compareTo(o2.firstname);
    }
}
