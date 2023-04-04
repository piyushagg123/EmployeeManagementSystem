package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Employee employee = new Employee();
//		employee.setFirstName("Ramesh");
//		employee.setLastName("Kumar");
//		employee.setEmailId("ramesh@gmail.com");
//		employeeRepository.save(employee);
//		
//		Employee employee2 = new Employee();
//		employee2.setFirstName("John");
//		employee2.setLastName("Singh");
//		employee2.setEmailId("john@gmail.com");
//		employeeRepository.save(employee2);
	}

}
