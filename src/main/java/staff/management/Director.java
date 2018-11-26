package staff.management;

public class Director extends Manager{
    private int budget;

    public Director(String employeeName,String employeeNI,int employeeSalary,String deptName,int budget){
        super(employeeName,employeeNI,employeeSalary,deptName);
        this.budget = budget;
    }

    public int getBudget(){
        return this.budget;
    }
}
