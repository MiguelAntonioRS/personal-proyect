package proyect;

import java.util.ArrayList;

public class University {

    private ArrayList<Person> persons;

    public University() {
        this.persons = new ArrayList();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public void addTeacher(String firstName, String lastName, String ci, String subject, String localWork) {
        Teacher t = new Teacher(firstName, lastName, ci, subject, localWork);
        persons.add(t);

    }

    public void addStudent(String firstName, String lastName, String ci, int studentNumber, int registerNumber, double generalNote) {
        Student s = new Student(firstName, lastName, ci, studentNumber, registerNumber, generalNote);
        persons.add(s);
    }

    public ArrayList<Student> getStudent() {
        ArrayList<Student> students = new ArrayList();
        for (Person p : persons) {
            if (p instanceof Student) {
                students.add((Student) p);
            }

        }
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        ArrayList<Teacher> teachers = new ArrayList<>();
        for (Person p : persons) {
            if (p instanceof Teacher) {
                teachers.add((Teacher) p);
            }
        }
        return teachers;
    }

    public Person searchPerson(String ci) {
        Person personFound = null;
        for (Person person : persons) {
            if (person.getCi().equalsIgnoreCase(ci)) {
                personFound = person;
                break;
            }/*else {System.out.println("La Persona no se encontro."); 
                }*/
        }
        return personFound;
    }

}
