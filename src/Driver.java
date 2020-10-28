
public class Driver 
{

	public static void main(String[] args) 
	{
		String s = "A elephant lives in the zoo!";
		System.out.println(s);
		String answer = Driver.parse(s);
		System.out.println(Driver.reverse("woot"));
	}
	
	public static String reverse(String s)
	{
		String answer = "";
		for(int i = 0; i < s.length(); i++)
		{
			answer = s.charAt(i) + answer;
		}
		return answer;
	}
	//write a function that takes a string and replaces all
	//words (tokens) that are at least 5 character long with
	//the reverse of that token
	//"A elephant lives in the zoo!" becomes
	// “A tnahpele sevil in the zoo!”
	public static String parse(String s)
	{
		String[] parts = s.split(" ");
		
		return "woot";
	}

}
