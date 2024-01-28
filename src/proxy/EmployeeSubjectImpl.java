package proxy;

public class EmployeeSubjectImpl implements EmployeeSubject{

    @Override
    public void createEmployee(String client, Employee employee) throws Exception {
        //logic
        System.out.println("successfully created the employee");
    }

    @Override
    public void deleteEmployee(String client, long empId) throws Exception {
        //logic
        System.out.println("successfully deleted the employee with employeeId : " + empId);
    }

    @Override
    public void fetchEmployee(String client, long empId) throws Exception {
        //logic
        System.out.println("Fetching details for employee  " + empId);
    }
}
