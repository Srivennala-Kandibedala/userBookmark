package entities;

import static org.junit.Assert.*;

import org.junit.Test;

import constants.BookGenre;
import managers.BookmarkManager;

public class BookTest {

	@Test
	public void testIsKidFriendlyEligible() {
		Book book = BookmarkManager.getinstance().createBook(4000,"Walden","",1854,"Wilder Publications",new String[]{"Henry David Thoreau"},BookGenre.PHILOSOPHY,4.3);
		boolean isKidFriendlyEligible = book.isKidFriendlyEligible();
		assertFalse("For Philosphy genre isKidFriendlyEligible should return false ",isKidFriendlyEligible);
		
		book = BookmarkManager.getinstance().createBook(4000,"Walden","",1854,"Wilder Publications",new String[]{"Henry David Thoreau"},BookGenre.SELF_HELP,4.3);
		isKidFriendlyEligible = book.isKidFriendlyEligible();
		assertFalse("For self_help genre isKidFriendlyEligible should return false ",isKidFriendlyEligible);
	}

}
