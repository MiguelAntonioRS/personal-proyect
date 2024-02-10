package proyect;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

public class Main1 {
        static University university=new University();
        static Scanner sc = new Scanner(System.in);
        Person person = new Person();
       
    public static void main(String[] args) {
        // TODO code application logic here
         
       LimpiarPantalla();
                    
        System.out.println("Bienvenido a la Universidad de Holguin");
        System.out.println("Presione un numero para la accion que desea");
        System.out.println("Presione 1 para agregar un estudiante\nPresione 2 para agregar un profesor\nPresione 3 para listar los estudiantes\nPresione 4 para listar a los profesores\nPresione 5 para buscar una persona\nPresione cualquier letra para salir del sistema");
        System.out.println("***************************************");
        System.out.print("Presione una letra para finalizar: ");
 
         String op = sc.next();

        switch (op) {
            case "1":  {
                addStudent();
                main(args);
                break;
            }
            case "2": {
                addTeacher();
                main(args);
                break;
            }
            case "3": {
                listStudents();
                main(args);
                break;
            }
            case "4": {
                listTeachers();
                main(args);
                break;
            }
             case "5":{
                searchPerson();
                main(args);
                break;
            }
            default: {
                System.out.println("El programa finalizo, tenga un buen día");
                System.exit(0);
            }
    }
    
}
    public static void addStudent() {
        System.out.println("Agregar un Estudiante:");
        System.out.print("Nombre: ");
        String firstName = sc.next();
        System.out.print("Apellido: ");
        String lastName = sc.next();
        System.out.print("Carnet de Identidad: ");
        String ci =sc.next();
        System.out.print("Numero de estudiante: ");
        int studentNumber = sc.nextInt();
        System.out.print("Numero de matricula: ");
        int registerNumber = sc.nextInt();
        System.out.print("Nota General: ");
        int generalNote = sc.nextInt();
        
        university.addStudent(firstName, lastName, ci, studentNumber, registerNumber, generalNote);
        System.out.println("Estudiante añadido");
        System.out.println("----------------------------------");
}
    public static void addTeacher() {
        System.out.println("Agregar un Profesor:");
        System.out.print("Nombre: ");
        String firstName = sc.next();
        System.out.print("Apellido: ");
        String lastName = sc.next();
        System.out.print("Carnet de Identidad: ");
        String ci = sc.next();
        System.out.print("Asignatura que imparte: ");
        String subject = sc.next();
        System.out.print("Lugar de trabajo: ");
        String localWork = sc.next();

        university.addTeacher(firstName, lastName, ci, subject, localWork);
        System.out.println("Profesor añadido");
        System.out.println("-----------------------------------");
}
    public static void listStudents() {
        System.out.println("Listado de Estudiantes:");
        ArrayList<Student> students = university.getStudent();
        for (Student s : students) {
        System.out.println(s.getData()+" "+s.toString());
        System.out.println("----------------------------------");
        }
}
    public static void listTeachers() {
        System.out.println("Listado de Profesores:");
        ArrayList<Teacher> Teachers = university.getTeachers();
        for (Teacher t : Teachers) {
        System.out.println(t.getData()+" "+t.toString());
        System.out.println("----------------------------------");    
    }
}
    public static void searchPerson() { //Este no esta hecho bien aun.... 
        System.out.print("Ingrese el CI a buscar: ");
        String ci =sc.next();
          
        Person person = university.searchPerson(ci);
       
        //  if(person.equals(ci)){  Esto es lo que no funciona
        if (Objects.isNull(person)){  
            System.out.println("La Persona no se encontro.");  
        }else{    
            System.out.println("La Persona se encontro"+" "+person.getData()+" "+person.toString());
            System.out.println("----------------------------------");
        }  
                
    }
     public static void LimpiarPantalla() {
   
    }
}    

