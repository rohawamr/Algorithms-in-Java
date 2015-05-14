import javax.swing.text.DateFormatter;


public class datamanipulation {
public static void main(String[] args) {
	String str1= "January 1, 2011";
	DateFormatter formatter = DateFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
	LocalDate d1 = LocalDate.parse(str1, formatter);

	String str2 = "March 6, 2064";
	LocalDate d2 = LocalDate.parse(str2, formatter);

	long noOfMiliSecondsInDay = (100 * 60 * 60 * 24)

	long totalMiliSec = d1.getTime() - d2.getTime();

	long totalDays = totalMiliSec / noOfMiliSecondsInDay ;

	int dayDiff = totalDays % 7;
}
}


public void function(){
	System.out.println(bubby);
}