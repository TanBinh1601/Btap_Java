package StaticMethod;

public class TestStaticMethod {
    public static void main(String args[]) {
        student.change(); //calling change method

        //creating objects
        student s1 = new student(111, "Hoang");
        student s2 = new student(222, "Khanh");
        student s3 = new student(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }

}
