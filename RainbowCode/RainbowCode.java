
	import java.awt.Color;
import java.util.ArrayList;

	public class RainbowCode {
		public static void main(String[] args){
		String word = "the more phrases the better or is it better?";
		int length = word.length();
		ArrayList<String>hexaArray = new ArrayList<String>();
		ArrayList<String>CharArray =new ArrayList<String>();
		String fullString;
		    if (word.length() > 16777215) 
		        System.out.println("Sorry you have too many characters, the max character length is 16777215 and your's has" + word.length());
		     else {
		        int hexa = 16777215 / word.length();
		        hexa = (int)Math.round(hexa);
		        int count = hexa;
		        while (count < 16777215) {
		            count = count + hexa;
		            String hexString = Integer.toHexString(count);
		            String loopCount = 	"0x" + hexString.toUpperCase();
		            hexaArray.add(loopCount);	
		            }
		        hexaArray.remove(hexaArray.size() - 1);
		    }
		
		    for (int i = 1; i < word.length(); i++) {
		        word = word.replaceAll(" ","");
		        String letterValue = word.substring(i-1,i);
		        CharArray.add(letterValue);
		    }
		    
		    for (int x = 0; x <word.length(); x++) {
		    	String p=CharArray.get(x);
		    	
		        
		    }
		}
		}
	
		
