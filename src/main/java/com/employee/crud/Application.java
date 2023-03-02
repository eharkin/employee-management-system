package com.employee.crud;

import com.employee.crud.model.Employee;
import com.employee.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		UUID uuid = UUID.randomUUID();
		Employee employee1 = new Employee(uuid.getLeastSignificantBits(), "Emmett Harkin", "Software Engineer", "1 BeechWood Ave", "3938438282");
		Employee employee2 = new Employee(uuid.getLeastSignificantBits(), "Emmet Harkin", "Software Engineer 2", "2 BeechWood Ave", "44545433");
		Employee employee3 = new Employee(uuid.getLeastSignificantBits(), "Emmett Harkins", "Software Engineer 3", "3 BeechWood Ave", "48585833");

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}
}
