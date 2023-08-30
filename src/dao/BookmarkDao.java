package dao;

import entities.Bookmark;
import entities.UserBookmark;
import firstProject.DataStore;

public class BookmarkDao {
	public Bookmark[][] getBookmarks() {
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userbookmark) {
		DataStore.add(userbookmark);
		
	}
}
