package proyect;


public class Student extends Person{
    
    private int studentNumber;
    private int registerNumber;
    private double generalNote;

    public Student(String firstName, String lastName, String ci,int studentNumber, int registerNumber, double generalNote) {
        super(firstName, lastName, ci);
        this.studentNumber = studentNumber;
        this.registerNumber = registerNumber;
        this.generalNote = generalNote;
    }

    public Student() {
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public double getGeneralNote() {
        return generalNote;
    }

    public void setGeneralNote(double generalNote) {
        this.generalNote = generalNote;
    }

    @Override
    public String toString() {
        return "{" + "Numero de Estudiante=" + studentNumber + ", Numero de Matricula=" + registerNumber + 
                ", Nota General=" + generalNote + '}';
    }

}
