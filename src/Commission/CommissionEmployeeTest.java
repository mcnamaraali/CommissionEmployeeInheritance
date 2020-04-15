package Commission;

public class CommissionEmployeeTest {

	public static void main(String[] args) {
		CommissionEmployee employee = new CommissionEmployee ("Ali", 			"McNamara", "1234567N", 10000, .06 );
		
		System.out.println("Employee information obtained");
		System.out.printf("%n%s %s%n", "First name is",employee.getFirstName() );
		System.out.printf("%n%s %s%n", "Last name is",employee.getLastName() );
		System.out.printf("%n%s %s%n", "social security number is",employee.getSocialSecurityNumber() );
		System.out.printf("%n%s %.2f%n", "earnings are",employee.earnings());
		System.out.printf("%n%s %.2f%n", "Gross sales are",employee.getGrossSales());

	}

}
