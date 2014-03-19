package com.jar.jam.domain.model;

import com.jar.jam.domain.enums.EntityType;

public class Comment {

	private long id;
	private String comment;
	private long userId;
	private EntityType entity;
	private long entityId;
	private Comment parrent;
	private double likes;

	public long getId() {
		return id;
	}

	public String getComment() {
		return comment;
	}

	public long getUserId() {
		return userId;
	}

	public EntityType getEntity() {
		return entity;
	}

	public long getEntityId() {
		return entityId;
	}

	public Comment getParrent() {
		return parrent;
	}

	public double getLikes() {
		return likes;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public void setEntity(EntityType entity) {
		this.entity = entity;
	}

	public void setEntityId(long entityId) {
		this.entityId = entityId;
	}

	public void setParrent(Comment parrent) {
		this.parrent = parrent;
	}

	public void setLikes(double likes) {
		this.likes = likes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((entity == null) ? 0 : entity.hashCode());
		result = prime * result + (int) (entityId ^ (entityId >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		long temp;
		temp = Double.doubleToLongBits(likes);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((parrent == null) ? 0 : parrent.hashCode());
		result = prime * result + (int) (userId ^ (userId >>> 32));
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
		Comment other = (Comment) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (entity != other.entity)
			return false;
		if (entityId != other.entityId)
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(likes) != Double
				.doubleToLongBits(other.likes))
			return false;
		if (parrent == null) {
			if (other.parrent != null)
				return false;
		} else if (!parrent.equals(other.parrent))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	// TODO Update to StringBuilder.
	@Override
	public String toString() {
		return "Comment [id=" + id + ", comment=" + comment + ", userId="
				+ userId + ", entity=" + entity + ", entityId=" + entityId
				+ ", parrent=" + parrent + ", likes=" + likes + "]";
	}

}