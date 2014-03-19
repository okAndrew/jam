package com.jar.jam.domain.model;

public class Recipe {

	private long id;
	private String name;
	private String description;
	private User user;
	private int views;
	private int complexity;
	private Recipe parent;
	private double raiting;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public User getUser() {
		return user;
	}

	public int getViews() {
		return views;
	}

	public int getComplexity() {
		return complexity;
	}

	public Recipe getParent() {
		return parent;
	}

	public double getRaiting() {
		return raiting;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public void setComplexity(int complexity) {
		this.complexity = complexity;
	}

	public void setParent(Recipe parent) {
		this.parent = parent;
	}

	public void setRaiting(double raiting) {
		this.raiting = raiting;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + complexity;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
		long temp;
		temp = Double.doubleToLongBits(raiting);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + views;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recipe other = (Recipe) obj;
		if (complexity != other.complexity)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parent == null) {
			if (other.parent != null)
				return false;
		} else if (!parent.equals(other.parent))
			return false;
		if (Double.doubleToLongBits(raiting) != Double
				.doubleToLongBits(other.raiting))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (views != other.views)
			return false;
		return true;
	}

	// TODO Update to StringBuilder.
	@Override
	public String toString() {
		return "Recipe [id=" + id + ", name=" + name + ", description="
				+ description + ", user=" + user + ", views=" + views
				+ ", complexity=" + complexity + ", parent=" + parent
				+ ", raiting=" + raiting + "]";
	}

}