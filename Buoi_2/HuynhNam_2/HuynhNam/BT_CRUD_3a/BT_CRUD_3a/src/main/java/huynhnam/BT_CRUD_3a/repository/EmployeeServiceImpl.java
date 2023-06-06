package huynhnam.BT_CRUD_3a.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import huynhnam.BT_CRUD_3a.service.EmployeeService;
import huynhnam.BT_CRUD_3a.model.Employee;
import huynhnam.BT_CRUD_3a.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements  EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee>getAllEmployees(){
        return employeeRepository.findAll();

    }
    @Override
    public void saveEmployee(Employee employee)
    {
        this.employeeRepository.save(employee);
    }
    @Override
    public Employee getEmployeeById(long id)
    {
        Optional<Employee> optional=employeeRepository.findById(id);
        Employee employee=null;
        if(optional.isPresent())
        {
            employee=optional.get();
        } else
        {
            throw new RuntimeException("Employee not found for id::"+id);
        }
        return employee;
    }
    @Override
    public void deleteEmployeeById(long id)
    {
        this.employeeRepository.deleteById(id);
    }

}