package in.embryo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.embryo.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	public Employee findByEno(Integer eno);
	public List<Employee> findByName(String name);
	
}
