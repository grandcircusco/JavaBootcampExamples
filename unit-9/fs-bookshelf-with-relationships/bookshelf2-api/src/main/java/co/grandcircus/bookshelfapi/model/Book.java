package co.grandcircus.bookshelfapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bookshelf2_book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 80)
	private String title;
	@Column(length = 80)
	private String author;
	private Integer pages;
	private Boolean lentOut;
	// relationship to User
	private Long ownerId;
	// nested relationship to User
	@ManyToOne
	private User lentOutTo;

	public Book() {
	}

	public Book(String title, String author, Integer pages, Boolean lentOut,
			Long ownerId, User lentOutTo) {
		super();
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.lentOut = lentOut;
		this.ownerId = ownerId;
		this.lentOutTo = lentOutTo;
	}

	public Book(Long id, String title, String author, Integer pages,
			Boolean lentOut, Long ownerId, User lentOutTo) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.lentOut = lentOut;
		this.ownerId = ownerId;
		this.lentOutTo = lentOutTo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Boolean getLentOut() {
		return lentOut;
	}

	public void setLentOut(Boolean lentOut) {
		this.lentOut = lentOut;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public User getLentOutTo() {
		return lentOutTo;
	}

	public void setLentOutTo(User lentOutTo) {
		this.lentOutTo = lentOutTo;
	}

}
