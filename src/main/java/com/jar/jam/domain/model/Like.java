package com.jar.jam.domain.model;

import com.jar.jam.domain.enums.EntityType;

public class Like {

	private long id;
	private User user;
	private EntityType entity;
	private long entityId;
	private Like like;

	public long getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public EntityType getEntity() {
		return entity;
	}

	public long getEntityId() {
		return entityId;
	}

	public Like getLike() {
		return like;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setEntity(EntityType entity) {
		this.entity = entity;
	}

	public void setEntityId(long entityId) {
		this.entityId = entityId;
	}

	public void setLike(Like like) {
		this.like = like;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((entity == null) ? 0 : entity.hashCode());
		result = prime * result + (int) (entityId ^ (entityId >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((like == null) ? 0 : like.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Like other = (Like) obj;
		if (entity != other.entity)
			return false;
		if (entityId != other.entityId)
			return false;
		if (id != other.id)
			return false;
		if (like == null) {
			if (other.like != null)
				return false;
		} else if (!like.equals(other.like))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	// TODO Update to StringBuilder.
	@Override
	public String toString() {
		return "Like [id=" + id + ", user=" + user + ", entity=" + entity
				+ ", entityId=" + entityId + ", like=" + like + "]";
	}

}
