package com.jar.jam.domain.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.jar.jam.domain.enums.EntityType;

@Entity
@Table(name = "comments")
public class Comment {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name = "comment")
	private String comment;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "entity")
	private EntityType entity;
	
	@Column(name = "entity_id")
	private Long entityId;
	
	@ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="comment_id")
	private Comment parrent;
	
	@Column(name = "likes")
	private Double likes;

	public Long getId() {
		return id;
	}

	public String getComment() {
		return comment;
	}

	public User getUser() {
		return user;
	}

	public EntityType getEntity() {
		return entity;
	}

	public Long getEntityId() {
		return entityId;
	}

	public Comment getParrent() {
		return parrent;
	}

	public Double getLikes() {
		return likes;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setEntity(EntityType entity) {
		this.entity = entity;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public void setParrent(Comment parrent) {
		this.parrent = parrent;
	}

	public void setLikes(Double likes) {
		this.likes = likes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((entity == null) ? 0 : entity.hashCode());
		result = prime * result
				+ ((entityId == null) ? 0 : entityId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((likes == null) ? 0 : likes.hashCode());
		result = prime * result + ((parrent == null) ? 0 : parrent.hashCode());
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
		Comment other = (Comment) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (entity != other.entity)
			return false;
		if (entityId == null) {
			if (other.entityId != null)
				return false;
		} else if (!entityId.equals(other.entityId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (likes == null) {
			if (other.likes != null)
				return false;
		} else if (!likes.equals(other.likes))
			return false;
		if (parrent == null) {
			if (other.parrent != null)
				return false;
		} else if (!parrent.equals(other.parrent))
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
		return "Comment [id=" + id + ", comment=" + comment + ", user=" + user
				+ ", entity=" + entity + ", entityId=" + entityId
				+ ", parrent=" + parrent + ", likes=" + likes + "]";
	}

}