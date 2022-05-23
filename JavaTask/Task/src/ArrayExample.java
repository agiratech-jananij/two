import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ArrayExample {

	public static void main(String[] args) 
	{
		ArrayList <Employee> List = new ArrayList <Employee>();
		List.add(new Employee(6,"Janani",15000));
		List.add(new Employee(1,"Kaviya",15000));
		List.add(new Employee(3,"Reethik",20000));
		List.add(new Employee(9,"Lavanya",10000));
		List.add(new Employee(7,"Viji",18000));
		List.add(new Employee(8,"Karthik",25000));
		List.add(new Employee(12,"Dinesh",50000));
		List.add(new Employee(28,"Jagadeesan",35000));
		List.add(new Employee(23,"Selvi",28000));
		
		
		System.out.println("The Empolyee List \n ");
		for(Employee emp : List)
		{
			
			System.out.println(emp.Id +"," + emp.Name + ","+emp.Salary);
		}
		System.out.println("\n ");
		
		
//		Sorting ID
		Collections.sort(List, new Comparator <Employee>()
				{

					@Override
					public int compare(Employee arr1, Employee arr2) {
						
						return arr1.Id.compareTo(arr2.Id);
						
					}
				}
				);
		System.out.println("The Sorting ID List: \n ");
		for(int i=0; i< List.size(); i++)
		{
			System.out.println(List.get(i).Id+","+List.get(i).Name+","+List.get(i).Salary);
		}
		System.out.println("\n ");
		
		
	
		
//		Sorting NAme
		Collections.sort(List, new Comparator <Employee>()
				{

					@Override
					public int compare(Employee arr1, Employee arr2) {
						
						return arr1.Name.compareTo(arr2.Name);
						
					}
				}
				);
		System.out.println("The Sorting Name List: \n ");
		for(int i=0; i< List.size(); i++)
		{
			System.out.println(List.get(i).Id+","+List.get(i).Name+","+List.get(i).Salary);
		}
	}

}
class Employee
{
	Integer Id;
	String Name;
	Integer Salary;
	public Employee(int Id, String Name,int Salary)
	{
		this.Id=Id;
		this.Name=Name;
		this.Salary=Salary;
	}
}
