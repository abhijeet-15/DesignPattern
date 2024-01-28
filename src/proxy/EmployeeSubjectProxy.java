package proxy;

public class EmployeeSubjectProxy implements EmployeeSubject{

    EmployeeSubjectImpl subject;

    EmployeeSubjectProxy() {
       subject = new EmployeeSubjectImpl();
    }

    @Override
    public void createEmployee(String client, Employee employee) throws Exception {

        if(client.equalsIgnoreCase("ADMIN")) {
            subject.createEmployee(client,employee);
            return;
        }
        throw new Exception("Access denied");
    }

    @Override
    public void deleteEmployee(String client, long empId) throws Exception {

        if(client.equalsIgnoreCase("ADMIN")) {
            subject.deleteEmployee(client,empId);
        }

        throw new Exception("Access denied");
    }

    @Override
    public void fetchEmployee(String client, long empId) throws Exception {
        if(client.equalsIgnoreCase("ADMIN") ||client.equalsIgnoreCase("user")) {
            subject.fetchEmployee(client,empId);
        }

        throw new Exception("Access Denied");
    }
}
