package MVC;

public class StudentView {
    private  Student student;

    public void viewStudent(Student student){
        System.out.println("Name: "+student.getName()+", Age: "+student.getAge());
    }
}
