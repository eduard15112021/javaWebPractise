package conter;

public class User {
    private int id;
    private String name;
    private String surname;
    private String country;
    private String login;
    private String pass;

    public User(int id, String name, String surname, String country, String login, String pass) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.login = login;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public String getName() {return name;}

    public String getSurname() {return surname;}

    public String getCountry() {return country;}

    public String getLogin() {return login;}

    public String getPass() {return pass;}
}
