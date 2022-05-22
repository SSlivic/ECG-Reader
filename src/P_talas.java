import java.util.Scanner;

public class P_talas {

	public static void pTalasMitrale(){
	
	System.out.println("Gledajte drugi odvod(II)");
	
	System.out.println("Da li je p talas širi od 3 kockice?");
	Scanner p=new Scanner(System.in);
	
	String  pt =p.nextLine();
	String pMitrale=pt.toLowerCase();
	
	switch(pMitrale) {
	case "da":
		System.out.println("Talas ukazuje na hipertrofiju leve pretkomore(p mitrale)");
	
	break;
	case "ne":
		System.out.println("Leva pretkomora nije zahvaćena");
		
	break;	
	default:
		System.out.println("Niste uneli pravilan odgovor");
	
		pTalasMitrale();
	}}
	public static void pTalasPulmonale(){
		
		System.out.println("Gledajte i dalje drugi odvod(II)");
		
		
		System.out.println("Da li je p talas viši od 3 kockice?");
		Scanner pp=new Scanner(System.in);
		
		String  ppul =pp.nextLine();
		String pPulmonale=ppul.toLowerCase();
		
		switch(pPulmonale) {
		case "da":
			System.out.println("Talas ukazuje na hipertrofiju desne pretkomore(p pulmonale)");
			
		break;
		case "ne":
			System.out.println("Desna pretkomora nije zahvaćena");
			
		break;	
		default:
			System.out.println("Niste uneli pravilan odgovor");
			
			pTalasPulmonale();
	}}
	

	
}
