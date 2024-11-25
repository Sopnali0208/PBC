package Main;
import com.employee.*;
import com.manager.*;

public class Main {
	public static void main(String[] args) {
		
Employee employee = new Employee();
employee.sal(20000);

Manager manager = new Manager();
manager.sal(40000, 5000, 3000);
	}
}
