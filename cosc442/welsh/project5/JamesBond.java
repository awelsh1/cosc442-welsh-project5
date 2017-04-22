package cosc442.welsh.project5;
import java.util.regex.*;





public class JamesBond {
	
	public boolean bondRegex (String input)
	{
		String regex = "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, (, )]([0, 1, 2, 3, 4, 5, 6, 7, 8, 9, (, )]007[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, (, )])[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, (, )]";
		String tbd = input; 
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(tbd);
		boolean b = m.find();
		return b; 
	}
	
}
