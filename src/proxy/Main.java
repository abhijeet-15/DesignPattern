package proxy;

public class Main{

    public static void main(String[] args) {
        try {
            EmployeeSubject emp = new EmployeeSubjectProxy();
            emp.createEmployee("ADMIN", new Employee());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
