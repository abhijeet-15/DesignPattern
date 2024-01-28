package proxy;

public interface EmployeeSubject {

    public void createEmployee(String client, Employee employee) throws Exception;
    public void deleteEmployee(String client, long empId) throws Exception;
    public void fetchEmployee(String client, long empId) throws Exception;
}
