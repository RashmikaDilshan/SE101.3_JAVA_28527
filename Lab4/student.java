package Lab4;

public class student {
    private String programme;
    private String Name;
    private String Course;
    private int ID;

    public int getID() {
        return ID;
    }
    public void setID(int ID) 
        this.ID= ID;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }
}
