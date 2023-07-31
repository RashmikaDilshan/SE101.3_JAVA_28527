package Lab3;

public class Main {
    public static void main(String[] args) {
        Employee mrBogdan = new Employee();
        mrBogdan.setEmpID(1);
        mrBogdan.setEmpName("Mr. Bogdan");
        mrBogdan.setEmpDesignation("Manager");

        Employee msBird = new Employee();
        msBird.setEmpID(2);
        msBird.setEmpName("Ms. Bird");
        msBird.setEmpDesignation("Engineer");

        
        System.out.println("Employee 1: "+ mrBogdan.getEmpID() + ", Name: " + mrBogdan.getEmpName() + ", Designation:"+ mrBogdan.getEmpDesignation());

        System.out.println("Employee 2: "+ msBird.getEmpID() + ", Name:" + msBird.getEmpName() + ", Designation:"+ msBird.getEmpDesignation());
    }
}

