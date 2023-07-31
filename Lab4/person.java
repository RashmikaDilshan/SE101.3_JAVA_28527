package Lab4;

public class person {
    private String programme;
    private String Name;
    private String Course;
    private int ID;

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID= ID;
    }

    public String getName() {
        return Name;
    }
    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getProgramme() {
        return programme;
    }
}
