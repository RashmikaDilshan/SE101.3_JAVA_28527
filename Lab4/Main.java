package Lab4;

public class Main {
    public static void main(String[] args) {
       student student = new student();
        student.setName("John Doe");
        student.setID(1001);
        student.setCourse("Computer Science");

        lecturer lecturer = new lecturer();
        lecturer.setName("Dr. Smith");
        lecturer.setID(2001);
        lecturer.setProgramme("Data Science");

        
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getID());
        System.out.println("Student Course: " + student.getCourse());

        
        System.out.println("Lecturer Name: " + lecturer.getName());
        System.out.println("Lecturer ID: " + lecturer.getID());
        System.out.println("Lecturer Programme: " + lecturer.getProgramme());
    }
}