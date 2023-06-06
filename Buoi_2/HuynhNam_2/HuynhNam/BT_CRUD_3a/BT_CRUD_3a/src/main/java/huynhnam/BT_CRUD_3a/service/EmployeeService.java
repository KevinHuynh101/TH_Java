package huynhnam.BT_CRUD_3a.service;

import java.util.List;
import huynhnam.BT_CRUD_3a.model.Employee;
public interface EmployeeService {
    List <Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}