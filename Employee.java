public class Employee extends Person implements EmployeeInterface {
    public Employee(EmployeeInfo employeeInfo){
        super(employeeInfo.employeeName(), employeeInfo.employeeAge(), employeeInfo.salary(), employeeInfo.jobDescription());
    }
    @Override
    public void employeeInfo(){
        System.out.println("Employee Name: "+ employeeName);
        System.out.println("Age: "+ employeeAge);
        System.out.println("Salary: $"+ salary);
        System.out.println("Job Description: "+ jobDescription);
    }
    @Override
    public double calculateAnnualSalary(){
        return salary * 12;
    }
    @Override
    public void applyRaise(double raisePercentage){//applyRaise
        salary += (salary * raisePercentage / 100);
    }

    private static record EmployeeInfo(String employeeName, int employeeAge, double salary, String jobDescription) {
    }
}
