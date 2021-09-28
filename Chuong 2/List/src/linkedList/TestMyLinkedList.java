package linkedList;
import arrayList.Student;

public class TestMyLinkedList {
    public static void main(String[] args) {
        Student student_1 = new Student(1, "DUY");
        Student student_2 = new Student(2, "Nam");
        Student student_3 = new Student(3, "Việt");
        Student student_4 = new Student(4, "VŨ");
        MyLinkedList<Student> myLinkedListStudent = new MyLinkedList<Student>();
        myLinkedListStudent.addFirst(student_2);
        myLinkedListStudent.addLast(student_1);
        myLinkedListStudent.addFirst(student_3);
        myLinkedListStudent.add(1, student_4);
        //myLinkedListStudent.remove(0);
        MyLinkedList<Student> newStudent = myLinkedListStudent.clone();
        myLinkedListStudent.clear();
        System.out.println(myLinkedListStudent.getFirst());

        for (int i = 0; i < myLinkedListStudent.size(); i++) {
            Student student = (Student) myLinkedListStudent.get(i);
            System.out.println(student.getName());
        }
        for (int i = 0; i < newStudent.size(); i++) {
            Student student = (Student) newStudent.get(i);
            System.out.println(student.getId()+" | "+ student.getName());
        }
    }
}