package cosc442.welsh.project5;
import java.util.regex.*;





public class JamesBond {
	
	public boolean bondRegex (String input)
	{
		String regex = ".*(.*007.*).*";
		String tbd = input; 
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(tbd);
		boolean b = m.find();
		return b; 
	}
	
}
