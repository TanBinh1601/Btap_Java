package arrayList;

public class TestMyList {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Nam");
        Student s2 = new Student(2, "Duy");
        Student s3 = new Student(3, "Binh");
        Student s4 = new Student(4, "Tra My");
        Student s5 = new Student(5, "Hien");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(s1);
        studentMyList.add(s2);
        studentMyList.add(s3);
        studentMyList.add(s4);
        studentMyList.add(s5, 3);

        for (int i = 0; i<studentMyList.size(); i++){
            Student student = (Student) studentMyList.elements[i];
            System.out.printf(student.getId() +" | " + student.getName() +"\n");
        }
        System.out.println("Size: " + studentMyList.size());
        System.out.println("------------------");

        MyList myList = new MyList();
        myList.add("Nam");
        myList.add("Minh");
        myList.add("Binh");
        myList.add("Duy");
        myList.add("Nam");

        for (int j = 0; j<myList.size(); j++){
            System.out.println(myList.elements[j]);
        }

        System.out.println("Name in 2nd place: " + myList.get(2));
    }
}
