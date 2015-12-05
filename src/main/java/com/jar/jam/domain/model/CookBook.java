package com.jar.jam.domain.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cook_books")
public class CookBook {

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@ManyToMany
	@JoinTable(name = "books_recipes", joinColumns = { @JoinColumn(name = "book_id", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "recipe_id", referencedColumnName = "id") })
	private List<Recipe> recipes;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User creator;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

}
