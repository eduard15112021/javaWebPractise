package la;
//singleton
public class Person {
    private String name;
    private int age;
    private static Person person;


    public String getName() { return name;}
    public int getAge() { return age;}


    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     *
     * @param age dfghiokj
     * @param name werythjmtyfw
     * @return person qaesgh
     */
    public static Person setPerson(int age,String name) {
        if (person==null) {
            person = new Person(name, age);
        }
        return person;
    }
}
