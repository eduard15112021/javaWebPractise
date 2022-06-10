package MVC;

public class DAO {
    private Student student;

    public Student getStudent(){
        Student student = new Student("qwerty",52);
        return student;
    }

    public void changeStudent(Student student, String newName, int newAge){
        student.setName(newName);
        student.setAge(newAge);
    }
}
