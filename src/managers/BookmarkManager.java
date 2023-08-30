package managers;

import dao.BookmarkDao;
import entities.Book;
import entities.Bookmark;
import entities.Movie;
import entities.User;
import entities.UserBookmark;
import entities.WebLink;

public class BookmarkManager {
	private static BookmarkManager instance = new BookmarkManager();

	private BookmarkManager() {
	}

	public static BookmarkManager getinstance() {
		return instance;
	}
	private static BookmarkDao dao = new BookmarkDao();

	public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast,
			String[] directors, String genre, double imdbRating) {
		Movie movie = new Movie();
		movie.setId(id);
		movie.setTitle(title);
		movie.setProfileUrl(profileUrl);
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);
		return movie;
	}

	public Book createBook(long id, String title, String profileUrl, int publicationYear, String publisher,
			String[] authors, String genre, double amazonRating) {
		Book book = new Book();
		book.setId(id);
		book.setTitle(title);
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setAuthors(authors);
		book.setGenre(genre);
		book.setAmazonRating(amazonRating);
		return book;
	}

	public WebLink createWebLink(long id, String title, String url, String host) {
		WebLink web = new WebLink();
		web.setId(id);
		web.setTitle(title);
		web.setUrl(url);
		web.setHost(host);
		return web;
	}
	public Bookmark[][] getbookmarks() {
		return dao.getBookmarks();
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		UserBookmark userbookmark = new UserBookmark();
		userbookmark.setUser(user);
		userbookmark.setBookmark(bookmark);
		
		dao.saveUserBookmark(userbookmark);
	}
}
