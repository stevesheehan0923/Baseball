import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name of the Player");
		String Name = scanner.nextLine();
		System.out.println("Enter the Number of Hits");
		int Hits = scanner.nextInt();
		System.out.println("Enter the Number of At Bats");
		int AB = scanner.nextInt();
		System.out.println("Enter the Number of Walks");
		int BB = scanner.nextInt();
		System.out.println("Enter the Number of Hit By Pitches");
		int HBP = scanner.nextInt();
		System.out.println("Enter the Number of Sacrafice Fly Balls");
		int SF = scanner.nextInt();
		System.out.println("Enter the Number of Doubles");
		int dbl = scanner.nextInt();
		System.out.println("Enter the Number of Triples");
		int triple = scanner.nextInt();
		System.out.println("Enter the Number of Home Runs");
		int HR = scanner.nextInt();
		System.out.println("Enter the Number of Runs");
		int R = scanner.nextInt();
		
		
		Baseball player = new Baseball(Hits, AB, BB, HBP, SF, dbl, triple, HR, R);
		
		System.out.println("The stats of " + Name + ":");
		System.out.println("The batting average is:" + player.BA());
		System.out.println("The on base percentage is:" + player.OBP());
		System.out.println("The slugging percentage is:" + player.SLG());
		System.out.println("The on base plus slugging percentage is:" + player.OBS());
		System.out.println("The total number of bases is:" + player.TB());
		
		
		
		
	}

}
