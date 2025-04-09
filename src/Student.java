public class Student {
    String name;
    int id;
    double grade;

    //default constructor
    public Student(){
        name = "Unknown";
        id = 1234;
        grade = 23.4;
    }
//parameterized constructor
    public Student(String name, int id, double grade){
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    public void display(){
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student Grade: " + grade);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.display();


        System.out.println();
        System.out.println();
        Student student2 = new Student("Falmata",3456,87.9);
        student2.display();
    }
}
