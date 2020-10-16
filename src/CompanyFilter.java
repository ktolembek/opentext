import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CompanyFilter {

	public static void main(String[] args) {
		// Company names
		ArrayList<String> companies = new ArrayList<String>();
		companies.add("Apple");
		companies.add("Google");
		companies.add("Amazon");
		companies.add("Microsoft");
		companies.add("Oracle");
		companies.add("Facebook");
		companies.add("Netflix");
		companies.add("Adidas");
		companies.add("Nike");
		companies.add("Reebok");
		companies.add("New Balance");
		companies.add("Under Armour");
		// Same company names with whitespace and in lower case 
		companies.add(" apple ");
		companies.add(" google ");
		companies.add(" apazon ");
		companies.add(" microsoft");
		companies.add(" oracle");
		companies.add(" facebook");
		companies.add(" netflix ");
		companies.add(" apipas ");
		companies.add(" nike ");
		companies.add(" reebok");
		companies.add(" new balance ");
		companies.add(" under armour ");
		
		//Printing all company names
		System.out.println(companies);
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter String for filtering. For example, try 'Ap' or 'Apple' ");

			String input = sc.nextLine();  // Read user input
			
			System.out.println("Your filter is: " + input);  // Output user input
			
			System.out.println("------ Strict filter ------");
			companies.stream().filter(s->s.startsWith(input)).forEach(s->System.out.println(s));
			
			//Filtering should not be case sensitive.
			//Filtering should Ignore white spaces while filtering
			System.out.println("------- Soft filter -------");
			companies.stream().map(s->s.toLowerCase().trim()).filter(s->s.startsWith(input.toLowerCase().trim())).forEach(s->System.out.println(s));
		}
		catch(Exception ex){
			System.out.println(" Error occured: "+ ex.getMessage());
		}
		
	    //Your program should allow for sorting the list of company names in alphabetical order.
		System.out.println("------- Sorting -----------");
		companies.stream().map(s->s.trim().toLowerCase()).sorted().forEach(s->System.out.println(s));
		
		//Your program should allow for sorting the list of company names in reverse alphabetical order.
		System.out.println("------- Reverse Sorting -----------");
		companies.stream().map(s->s.trim().toLowerCase()).sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));

	}
	
	

}
