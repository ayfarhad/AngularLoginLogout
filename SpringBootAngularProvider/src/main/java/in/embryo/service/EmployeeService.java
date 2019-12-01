package in.embryo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import in.embryo.entity.Employee;
import in.embryo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		Employee saveEmployee = employeeRepository.save(employee);
		System.out.println("Employee data saved....");
		return saveEmployee;
	}
	
	public Iterable<Employee> getAllEmployee() {
		Iterable<Employee> findAll = employeeRepository.findAll();
		return findAll;
	}
	
	public Employee findEmployeeByEno(Integer eno) {
		Employee employee = employeeRepository.findByEno(eno);
		return employee;
	}
	
	
}
