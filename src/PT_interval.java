import java.util.Scanner;

public class PT_interval {

	public static void av_blok() {

		System.out.println("Normalan PT interval iznosi 3-5 malih kockica 120-200ms");

		System.out.println("Da li je PT interval duzi od 5 kockica, tj. 200ms?");

		Scanner blok = new Scanner(System.in);

		String av = blok.nextLine();
		String avBlok = av.toLowerCase();

		switch (avBlok) {
		case "da":
			System.out.println("DODATNA PITANJA O VRSTI BLOKA");
			definicijaBloka();

			break;
		case "ne":
			System.out.println("Nema AV bloka!");
		}

	}

	public static void definicijaBloka() {
		System.out.println("Da li preskoči QRS kompleks?");

		Scanner blokMobitzI = new Scanner(System.in);

		String blokMobI = blokMobitzI.nextLine();
		String mobitzI = blokMobI.toLowerCase();

		switch (mobitzI) {
		case "da":
			System.out.println("Ako ima simtoma dati atropin!");
			break;

		case "ne":
			System.out.println("Ne treba lečenje.");
			break;
		default:
			System.out.println("uneli ste pogrešan odgovor");
		
			definicijaBloka();

		}
	}

	public static void mobitzDva() {
		System.out.println("Da li su p talasi produžuje postepeno, dok ne preskoči jedanput?");
	

	Scanner blokMobitzII = new Scanner(System.in);

	String blokMobII = blokMobitzII.nextLine();

	String mobitzII=blokMobII.toLowerCase();

	switch(mobitzII){
	
	case "da":
		System.out.println("Dati atropin!");
	break;
	case "ne":
		System.out.println("Nije mobitz II.");
		break;

	default:
		System.out.println("uneli ste pogrešan odgovor");
	mobitzDva();
	}
	}

	public static void treciStepen() {
		System.out.println("Da li su p talasi i QRS kompleksi asihronizirani?");

	Scanner blokIII=new Scanner(System.in);

	String  blokAvIII=blokIII.nextLine();
	
	String blokAVIII=blokAvIII.toLowerCase();
	
	switch(blokAVIII) {
	case "da":
	
		System.out.println("Ugraditi pejsmejker!");
	break;
	case "ne":
		
			System.out.println("nije AV blok trećeg stepena!");
break;
	
	default:
	System.out.println("Uneli ste pogrešan odgovor.");
	treciStepen();
	
	}
	}
}
