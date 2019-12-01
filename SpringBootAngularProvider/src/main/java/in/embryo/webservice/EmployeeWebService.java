package in.embryo.webservice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.CrossOrigin;

import in.embryo.entity.Employee;


@Path(value="/employees")

public interface EmployeeWebService {

	@GET
	@Path(value="/{eno}")
	@Produces(value= {"application/xml", "application/json"})
	@Consumes(value= {"application/xml", "application/json"})
	public Response getEmployeeByEno(@PathParam("eno") Integer eno);
	
	@GET
	@Produces(value= {"application/xml", "application/json"})
	public List<Employee> getAllEmployee();
	
	@POST
	@Consumes(value= {"application/xml", "application/json"})
	@Produces(value= {"application/xml", "application/json"})
	public Response  saveEmployee(Employee employee);
	
	@PUT
	@Consumes(value= {"application/xml", "application/json"})
	@Produces(value= {"application/xml", "application/json"})
	public Response updateEmployee(Employee employee);
}
