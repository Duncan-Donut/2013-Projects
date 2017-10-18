
import java.util.ArrayList;

public class Rainbow {
	String word = "the more phrases the better or is it better?";
	int length = word.length();
	ArrayList<Integer>hexaArray = new ArrayList<Integer>();
	ArrayList<Character>CharArray =new ArrayList<Character>();
	String fullString;
		    if (word.length() > 16777215) {
		        System.out.println("Sorry you have too many characters, the max character length is 16777215 and your's has" + word.length());
		    } else {
		        int hexa = 16777215 / word.length();
		        hexa = (int)Math.round(hexa);
		        int count = hexa;
		        while (count < 16777215) {
		            count = count + hexa;
		            String hexString = Integer.toHexString(count);
		            System.out.print(count);
		            String loopCount = hexaArray.("#" + hexString.toUpperCase());
		        }
		        var remover = hexaArray.pop();
		    }
		};
		    for (i = 0; i < word.length; i++) {
		        word = word.replace(/\s+/g, '');
		        //removes spaces
		        var letterValue = word.charAt(i);
		        var blah = letterArray.push(letterValue);
		    }

		    for (x = 0; x < letterArray.length; x++) {
		        var tempArray = hexaArray[x];
		        var result = letterArray[x].fontcolor("tempArray.toString()");
		        var fullString = fullString + result;
		    }
		    rainbow();
		    document.getElementById('text').innerHTML = fullString;
		console.log(fullString);
		}
		}
		


