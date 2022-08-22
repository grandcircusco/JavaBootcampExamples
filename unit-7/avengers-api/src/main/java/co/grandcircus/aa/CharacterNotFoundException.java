package co.grandcircus.aa;

public class CharacterNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CharacterNotFoundException(Long id) {
		super("Could not find character with id " + id);
	}
}
