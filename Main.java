class Student{
    String studentname;
    String studentcode;
    int age;
    public void display(){
        System.out.println("Student Name : " + studentname + " Student Code : " + studentcode + " Age : " + age);
    }

    public static void main(String[] args){
        Student s1 = new Student();
        s1.studentname = "Ali Waqar";
        s1.studentcode  = "FA25-BMD-219";
        s1.age = 19;
        s1.display();

        Student s2 = new Student();
        s2.studentname = "Basim Zaheer";
        s2.studentcode = "FA25-BMD-033";
        s2.age = 100;
        s2.display();
    }
//
//class CourseResult{
//        public String studentname;
//        public String coursename;
//        public String grade;
//
//        public void display(){
//            System.out.println("Student Name is:" + studentname + " Student Coursename is" + coursename + "Student Grade is" + grade );
//        }
//    }
//public class CourseResultRun{
//        public static void main(String[] args){
//            CourseResult c1 = new CourseResult();
//            c1.studentname = "Ali Waqar";
//            c1.coursename = "OOP";
//            c1.grade = "A";
//            c1.display();
//        }
//    }




















}