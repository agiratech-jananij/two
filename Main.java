
import java.util.Scanner;
	public class Main {
		int Passenger;
		String Source,destination;
		Scanner sc = new Scanner(System.in);
		public String PName[];
		public int PAges[];
		public String PGender [];
//		USER INFO
		public void info()
		{

			System.out.println("This is Train Ticket Railway Reservation\n");
			System.out.println("Enter No of Passengers:");
			Passenger=sc.nextInt();
			Pass(Passenger);
			System.out.println("Enter the Source Place:");
			Source=sc.next();
			System.out.println("Enter the Destination Place:");
			destination=sc.next();
		}
	//pASSENGER DETAILS
		public  void Pass( int Passenger)
		{
			PName = new String[Passenger];
			PAges = new int[Passenger];
			PGender = new String[Passenger];
			for(int i=0; i<Passenger;i++)
			{
				System.out.println("Enter the Passengers Name:"+(i+1));
				PName[i]= sc.next();
				System.out.println("Enter the Passengers Age:"+(i+1));
				PAges[i]=sc.nextInt();
				System.out.println("Enter the Passengers Gender:"+(i+1));
				PGender[i]=sc.next();
			}
		}
	//uSER DETAILS DISPLAY
		public void infodetails()
		{
			System.out.println("Your Ticket Reservation");
			System.out.println("The Numbers of Passengers:" +Passenger);
			for(int i=0;i<Passenger;i++) 
			{
				System.out.println("Passenger name is :"+PName[i]);
				System.out.println("Passenger age is :"+PAges[i]);
				System.out.println("Passenger gender is :"+PGender[i]+"\n");
			}
			System.out.println("Source Place:" +Source);
			System.out.println("Destination Place:" +destination);
			System.out.println("Thank You!.............");
		}
		public static void main(String[] args) {
			Main e = new Main();
			e.info();
			e.infodetails();
		}
}