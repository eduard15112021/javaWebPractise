package MVC;

public class Main {
    public static void main(String[] args) {
        DAO dao = new DAO();
        Student student = dao.getStudent();
        StudentView studentView = new StudentView();
        StudentControler studentControler = new StudentControler(student,studentView);

        //studentControler.updateView;
    }
}
