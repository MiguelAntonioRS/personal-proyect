package proyect;


public class Teacher extends Person{
    private String subject;
    private String localWork;

    public Teacher(String firstName, String lastName, String ci, String subject, String localWork) {
        super(firstName, lastName, ci);
        this.subject = subject;
        this.localWork = localWork;
    }

    public Teacher() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLocalWork() {
        return localWork;
    }

    public void setLocalWork(String localWork) {
        this.localWork = localWork;
    }

    @Override
    public String toString() {
        return "{" + "Asignatura que imparte=" + subject + ", Lugar de trabajo=" + localWork + '}';
    }
    
}
