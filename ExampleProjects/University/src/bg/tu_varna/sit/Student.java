package bg.tu_varna.sit;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Student extends Person implements Comparable<Student> {

    private int number;

    private Course course;

    private Map<String, Integer> semestrialKontrol;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(number, student.number);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.number);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.number, o.number);
    }

    public Student(String firstname, String lastname, Integer number) throws StudentException {
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.number = number;
        this.semestrialKontrol = new TreeMap<>();
    }

    public Course getCourse() {
        return course;
    }

    public int getNumber() {
        return number;
    }

    public void addSemestrilaKontrol(String name, Integer points) {
        semestrialKontrol.put(name, points);
    }

    public Map<String, Integer> getSemestrialKontrol() {
        return semestrialKontrol;
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
        StringBuffer buffer = new StringBuffer();
        buffer.append('\n' + number + " " + firstname + ' ' + lastname + ' ' + course + '\n');

        for (String key : this.getSemestrialKontrol().keySet()) {
            buffer.append(key + " -> " + this.getSemestrialKontrol().get(key) + " ");
        }

        return  buffer.toString();
    }
}
