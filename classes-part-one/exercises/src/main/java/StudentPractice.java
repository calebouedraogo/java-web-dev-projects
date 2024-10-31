public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student myself = new Student("Caleb", 1234, 1, 4.0);

        System.out.println("Student Name: " + myself.getName());
        System.out.println("Student ID: " + myself.getStudentId());
        System.out.println("Credits: " + myself.getNumberOfCredits());
        System.out.println("GPA: " + myself.getGpa());
    }
}
