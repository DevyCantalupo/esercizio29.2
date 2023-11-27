import java.util.*;
public class esercizio29di2 {
    public static void main(String[] args) {

        Map<Integer,String> student = new HashMap<>();
        student.put(0,"ewe");
        student.put(4, "con");
        student.put(43, "uwu");
        student.put(456, "de");
        student.put(2343, "awa");
        System.out.println(student);

        System.out.println('\n');

        Map<Integer,String> sortStudents = new TreeMap<>(student);
        System.out.println(sortStudents);


    }
}