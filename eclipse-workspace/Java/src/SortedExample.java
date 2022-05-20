import java.util.ArrayList;
class Employee
{
	int Id , Salary;
	String Name;
	public Employee(int Id,String Name,int Salary)
	{
		this.Id = Id;
		this.Name = Name;
		this.Salary =Salary;
	}
}
public class SortedExample
{
	public static void main(String[] args)
	{
		ArrayList <Employee> List = new ArrayList <Employee>();
		
		Employee e = new Employee(1, "Janani", 5000);
		
		List.add(e);
		
		for(Employee i : List)
		{
			System.out.println(toString.(i);
		}
	}

}
