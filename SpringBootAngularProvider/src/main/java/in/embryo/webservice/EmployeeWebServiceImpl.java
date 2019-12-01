package in.embryo.webservice;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import in.embryo.entity.Employee;
import in.embryo.service.EmployeeService;


@Configuration
public class EmployeeWebServiceImpl implements EmployeeWebService{

	@Autowired
	private EmployeeService employeeService;
	
	@Override
	public Response getEmployeeByEno(Integer eno) {
		Employee employee = employeeService.findEmployeeByEno(eno);
		return Response.ok(employee).build();
	}

	@Override
	public List<Employee> getAllEmployee() {
		System.out.println("all empluyeee");
		Iterable<Employee> allEmployee = employeeService.getAllEmployee();
		return (List<Employee>) allEmployee;
	}

	@Override
	public Response saveEmployee(Employee employee) {
		System.out.println("******save employee*****");
		Employee saveEmployee = employeeService.saveEmployee(employee);
		System.out.println(saveEmployee.getEno());
		System.out.println(saveEmployee.getName());
		System.out.println(saveEmployee.getSalary());
		return Response.ok(saveEmployee).build();
	}

	@Override
	public Response updateEmployee(Employee employee) {
		Employee updateEmployee = employeeService.saveEmployee(employee);
		return Response.ok(updateEmployee).build();
	}

	

}
