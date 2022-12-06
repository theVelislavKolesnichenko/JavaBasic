package bg.tu_varna.sit;

import java.util.Random;

public enum Course {
    FIRST(1),
    SECOND(2),
    THIRD(3),
    FOURTH(4);

    private final int number;

    Course(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static Course getRandom() {
        Course[] courses = values();
        return courses[new Random().nextInt(courses.length)];
    }

    @Override
    public String toString() {
        return "Курс " + number;
    }
}
