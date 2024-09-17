public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student studentOne = new Student("Brayden", 12345, 1 ,4.0);
        System.out.println(studentOne.getName());
        System.out.println(studentOne.getStudentId());
        System.out.println(studentOne.getNumberOfCredits());
        System.out.println(studentOne.getGpa());
    }
}
