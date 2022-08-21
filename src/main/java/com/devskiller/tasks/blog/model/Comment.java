package com.devskiller.tasks.blog.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Comment {

	@org.springframework.data.annotation.Id
	private String Id;

	private String postId;

	private String author;

	private String content;
	private LocalDateTime creationDate;

	public Comment(String postId, String author, String content, LocalDateTime creationDate) {
		this.postId = postId;
		this.author = author;
		this.content = content;
		this.creationDate = creationDate;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
