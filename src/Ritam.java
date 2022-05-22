import java.util.Scanner;

public class  Ritam {

	
	

		
		public  static void sinR() {
			System.out.println("Da li ispred svakog QRS kompleksa postoji jedan p talas?");
			
			
		Scanner sinusniRitam = new Scanner(System.in);
		
		String str=sinusniRitam.nextLine();
		String sinRit=str.toLowerCase();
	
		switch(sinRit) {
		
		case ("da"):
			System.out.println("Sinusni ritam");
			break;
		case ("ne"):
			System.out.println("Nije sinusni ritam");
			break;
		default:
			System.out.println("Nije pravilan unos");
			sinR();
			break;
			
		}
		}
		
		public static void frekv() {
			
		try {
			System.out.println("Kolika je frekvenca srca?");
			Scanner frekvenca = new Scanner(System.in);
			
			int f=frekvenca.nextInt();
			
			if(f>=100) {System.out.println("Frekvenca je tahikardična");}
			else if(f<=60){System.out.println("Frekvenca je bradikardična");
			bradikardicna();}
			else if(f<100 && f>60){System.out.println("Frekvenca je normokardična");}

			else{
			}
		}
			catch(Exception e) {
				System.out.println("Unos je nepravilan");
				frekv();
			}}

	public static void bradikardicna() {
		PT_interval.av_blok();
		PT_interval.definicijaBloka();

		PT_interval.mobitzDva();
		PT_interval.treciStepen();
		//TO DO list
		
	}
}
