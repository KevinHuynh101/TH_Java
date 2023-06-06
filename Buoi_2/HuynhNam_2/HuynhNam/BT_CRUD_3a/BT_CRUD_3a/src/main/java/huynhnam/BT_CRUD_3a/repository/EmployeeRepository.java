package huynhnam.BT_CRUD_3a.repository;

import huynhnam.BT_CRUD_3a.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}