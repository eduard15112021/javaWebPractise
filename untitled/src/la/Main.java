package la;

public class Main {
    public static void main(String[] args) {
        Person person =Person.setPerson(102,"ali");
        System.out.println(person.getName()+"  -  "+person.getAge());
        Person person1=Person.setPerson(103,"asdfgh");
        System.out.println(person1.getName()+"  -  "+person1.getAge());
    }
}
