import java.util.*;

public class Movie {
	//private fields
	private String title = null;
	private String category = null;
	//constructor
	public Movie(String pamtitle, String pamcategory) {
		this.title = pamtitle;
		this.category = pamcategory;
	}
	//getters
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public static void main(String[] args) {
		Scanner JavaInput = new Scanner(System.in);
		ArrayList<Movie> movieList = createMovieList(); 
		System.out.println("Welcome to the Movie List Application!");
		while(true) {
		System.out.println("There are 10 movies in this list.");
		System.out.println("What category do you want to see?");
		String userCategoryChoice = JavaInput.nextLine();
		userCategoryChoice = userCategoryChoice.toLowerCase();
		if (userCategoryChoice.equals("drama") || userCategoryChoice.equals("scifi") || userCategoryChoice.equals("horror") || userCategoryChoice.equals("animated")){
			for (int i = 0; i < movieList.size(); i++) {
				if (userCategoryChoice.equals(movieList.get(i).getCategory())){
					System.out.println(movieList.get(i).getTitle());
			}
			}
			System.out.println("Would you like to continue? (y/n)");
			String userContinue = JavaInput.nextLine();
			if (userContinue.contains("y")) {
				continue;
			}
			else {
				break;
			}
		}
		else {
			System.out.println("The category you chose does not exist. Would you like to try again? (y/n)");
			String tryAgain = JavaInput.nextLine();
			if (tryAgain.contains("y")) {
				continue;
			}
			else {
				break;
			}
		}
	}
	}
	private static ArrayList<Movie> createMovieList() {
		ArrayList<Movie> movieList = new ArrayList<Movie>(); 
		Movie obj1 = new Movie("Titanic", "drama");	
		movieList.add(obj1);
		Movie obj2 = new Movie("E.T", "scifi");	
		movieList.add(obj2);
		Movie obj3 = new Movie("The Secret Life of Pets", "animated");	
		movieList.add(obj3);
		Movie obj4 = new Movie("Animal Farm", "drama");	
		movieList.add(obj4);
		Movie obj5 = new Movie("The Ring", "horror");	
		movieList.add(obj5);
		Movie obj6 = new Movie("Scream", "horror");	
		movieList.add(obj6);
		Movie obj7 = new Movie("Paranormal Activity", "horror");	
		movieList.add(obj7);
		Movie obj8 = new Movie("Captain America", "scifi");	
		movieList.add(obj8);
		Movie obj9 = new Movie("Star Wars", "scifi");	
		movieList.add(obj9);
		Movie obj10 = new Movie("Inception", "scifi");	
		movieList.add(obj10);
		return movieList;
	}
}