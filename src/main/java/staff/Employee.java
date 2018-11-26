package staff;

public abstract class Employee {
    private String employeeName;
    private String employeeNI;
    private int employeeSalary;

    public Employee(String employeeName,String employeeNI,int employeeSalary){
        this.employeeName = employeeName;
        this.employeeNI = employeeNI;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }

    public String getEmployeeNI(){
        return this.employeeNI;
    }

    public int getEmployeeSalary(){
        return this.employeeSalary;
    }

    public void raiseSalary(double raise){
        this.employeeSalary += raise;
    }

    public int payBonus(){
        return this.employeeSalary/100;
    }
}
