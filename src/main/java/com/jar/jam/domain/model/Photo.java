package com.jar.jam.domain.model;

import com.jar.jam.domain.enums.EntityType;

public class Photo {

	private long id;
	private User user;
	private String path;
	private EntityType entity;
	private long entityId;

	public long getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public String getPath() {
		return path;
	}

	public EntityType getEntity() {
		return entity;
	}

	public long getEntityId() {
		return entityId;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setEntity(EntityType entity) {
		this.entity = entity;
	}

	public void setEntityId(long entityId) {
		this.entityId = entityId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((entity == null) ? 0 : entity.hashCode());
		result = prime * result + (int) (entityId ^ (entityId >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((path == null) ? 0 : path.hashCode());
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
		Photo other = (Photo) obj;
		if (entity != other.entity)
			return false;
		if (entityId != other.entityId)
			return false;
		if (id != other.id)
			return false;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Photo [id=" + id + ", user=" + user + ", path=" + path
				+ ", entity=" + entity + ", entityId=" + entityId + "]";
	}

}
