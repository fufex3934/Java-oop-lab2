public class StudentInfo {
    String name;
    static String schoolName = "Haramaya University";

    public StudentInfo(String name){
        this.name = name;
    }

  public void displayStudentInfo(){
        int year = 2025;
      System.out.print("Name: "+name);

      System.out.print("School: "+schoolName);

      System.out.print("Graduation Year: "+year);
  }

  public static void printSchoolName(){
      System.out.println("School Name: "+schoolName);

  }

    public static void main(String[] args) {
        StudentInfo studentInfo1 = new StudentInfo("Ali");
        StudentInfo studentInfo2 = new StudentInfo("John");

        studentInfo1.displayStudentInfo();

        System.out.println();
        System.out.println();

        studentInfo2.displayStudentInfo();
        StudentInfo.printSchoolName();
    }
}
