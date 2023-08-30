package firstProject;

import entities.Bookmark;
import entities.User;
import managers.BookmarkManager;
import managers.UserManager;

public class Launch {
	private static User[] users;
	private static Bookmark[][] bookmarks;

	private static void LoadData() {
		System.out.println("1. Loading Data...");
		DataStore.loadData();
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getinstance().getbookmarks();
		System.out.println("Printing data...");
		printUserData();
		printBookmarkData();
	}

	private static void printBookmarkData() {
		for(Bookmark[] bookmarkList:bookmarks) {
			for(Bookmark bookmark : bookmarkList) {
				System.out.println(bookmark);
			}
		}
		
	}

	private static void printUserData() {
		for (User user : users) {
			System.out.println(user);
		}
	}
	private static void startBookmarking() {
		System.out.println("\n 2. Bookmarking...");
		for (User user : users) {
			View.bookmark(user, bookmarks);
		}
	}
	public static void main(String[] args) {
		LoadData();
		startBookmarking();
	}

	

}
