package proyect;

public class Person {
    private String firstName;
    private String lastName;
    private String ci;
    // testing
   
    public Person(String name, String lastName, String ci) {
        this.firstName = name;
        this.lastName = lastName;
        this.ci = ci;
    }

    public Person() {
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
    
    public String getData() {
        return "{" + "Nombre=" + firstName + ", Apellidos=" + lastName + ", Carnet de Identidad=" + ci + '}';
    }
    
}
