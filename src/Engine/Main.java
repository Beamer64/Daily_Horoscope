package Engine;

import lib.TextIO;

import java.io.IOException;

public class Main {
    
    private static Horoscopes scopes;
	
	static {
		try {
			scopes = new Horoscopes();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
        ScopeSelection();
    }
    
    public static int MainMenu() {
        System.out.println();
        System.out.println("Choose a number for your Zodiac Sign");
        
        System.out.print(" -------------------------------------\n");
        System.out.print("| (1.) Aries        (7. ) Libra       |\n");
        System.out.print("| (2.) Taurus       (8. ) Scorpio     |\n");
        System.out.print("| (3.) Gemini       (9. ) Sagittarius |\n");
        System.out.print("| (4.) Cancer       (10.) Capricorn   |\n");
        System.out.print("| (5.) Leo          (11.) Aquarius    |\n");
        System.out.print("| (6.) Virgo        (12.) Pisces      |\n");
        System.out.print(" -------------------------------------\n");
        System.out.print("> ");
        String sign = TextIO.getln();
        System.out.println();
        
        try {
			//converts string input to int
			return Integer.parseInt(sign);
		}
        catch (Exception e){
        	System.out.println();
        	System.out.println("Please Enter a Number.");
			return MainMenu();
        }
    }
    
    public static void ScopeSelection() throws IOException {
		switch (MainMenu()) {
			case 1:
				scopes.AriesHoroscope();
				break;
		
			case 2:
				scopes.TaurusHoroscope();
				break;
		
			case 3:
				scopes.GeminiHoroscope();
				break;
		
			case 4:
				scopes.CancerHoroscope();
				break;
		
			case 5:
				scopes.LeoHoroscope();
				break;
		
			case 6:
				scopes.VirgoHoroscope();
				break;
		
			case 7:
				scopes.LibraHoroscope();
				break;
		
			case 8:
				scopes.ScorpioHoroscope();
				break;
		
			case 9:
				scopes.SagittariusHoroscope();
				break;
		
			case 10:
				scopes.CapricornHoroscope();
				break;
		
			case 11:
				scopes.AquariusHoroscope();
				break;
		
			case 12:
				scopes.PiscesHoroscope();
				break;
		
			default:
				System.out.println("Not a Valid Option. Please Try Again.");
				MainMenu();
		}
	}
}
