package entities;

import static org.junit.Assert.*;

import org.junit.Test;

import constants.MovieGenre;
import managers.BookmarkManager;

public class MovieTest {

	@Test
	public void testIsKidFriendlyEligible() {
		Movie movie  = BookmarkManager.getinstance().createMovie(3000,"Citizen Kane","",1941,new String[]{"Henry Fonda","Jane Darwell"},new String[]{"Orson Welles"},MovieGenre.HORROR,8.5);
		boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();
		assertFalse("For Horror Genre - isKidFriendlyEligible should return false",isKidFriendlyEligible);
		
		movie  = BookmarkManager.getinstance().createMovie(3000,"Citizen Kane","",1941,new String[]{"Henry Fonda","Jane Darwell"},new String[]{"Orson Welles"},MovieGenre.THRILLERS,8.5);
		isKidFriendlyEligible = movie.isKidFriendlyEligible();
		assertFalse("For Thrillers Genre - isKidFriendlyEligible should return false",isKidFriendlyEligible);
	}

}
