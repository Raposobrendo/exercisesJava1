package listEntities;

import java.util.List;

public class Enterprise {
	public static Employee searchEmployee(List<Employee> employee, Integer id) {
		for(Employee x : employee) {
			if(x.getId() == id) {
				return x;
			}
		}
		System.out.println("This id does not exist!");
		return null;
	}
}
