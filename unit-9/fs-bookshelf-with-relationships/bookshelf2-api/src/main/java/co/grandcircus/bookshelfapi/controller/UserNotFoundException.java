package co.grandcircus.bookshelfapi.controller;
public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserNotFoundException(Long id) {
		super("Could not find book with id " + id);
	}
}