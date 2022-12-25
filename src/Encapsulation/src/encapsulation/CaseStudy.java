package encapsulation;

public class CaseStudy
{
    public static void main(String[] args) {
        EmployeeDetails obj= new EmployeeDetails();
        obj.setEmployeeSerialNo(21312);
        System.out.println(obj.getEmployeeSerialNo());
        obj.setEmployeeAge(23);
        System.out.println(obj.getEmployeeAge());
        obj.setEmployeeName("Vijay");
        System.out.println(obj.getEmployeeName());
    }
}


class EmployeeDetails
{
    private int employeeSerialNo, employeeAge;
    private String employeeName;

    public int getEmployeeSerialNo()
    {
      return employeeSerialNo;
    }
    public void setEmployeeSerialNo(int employeeSerialNo)
    {
        this.employeeSerialNo= employeeSerialNo;
    }
    int getEmployeeAge()
    {
        return employeeAge;
    }
    void setEmployeeAge(int employeeAge)
    {
        this.employeeAge=employeeAge;
    }
    String getEmployeeName()
    {
        return employeeName;
    }
    void setEmployeeName(String employeeName)
    {
        this.employeeName= employeeName;
    }
}