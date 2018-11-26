package staff.management;

import staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String employeeName,String employeeNI,int employeeSalary,String deptName){
        super(employeeName,employeeNI,employeeSalary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }
}
