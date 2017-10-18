import java.util.Scanner;

public class RNA {
	
	public static String converter(String St){
	
		String thang = "";
	
	for(int x=0;x<=St.length()-1;x++)
	{
		char p = St.charAt(x);
	
	switch (p) {
	case 'A':thang += 'U';break;
	case 'U':thang += 'A';break;
	case 'G':thang += 'C';break;
	case 'C':thang += 'G';break;
	case 'T':thang += 'A';
	}
	}
	return thang;
	}
	
	public static void main(String[] args) {
		String RNA; 
		String thang = "";
		int x;
		Character p;
		
		System.out.println("Please enter your DNA string");
		Scanner Sc = new Scanner(System.in);
		
		RNA = converter(Sc.nextLine());
		System.out.println("Here is your RNA string");
	
		System.out.println(RNA);
				
			}
		

	}


