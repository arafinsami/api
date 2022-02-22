package com.api;

import java.util.Date;

public class User {

	private int id;

	private String username;

	private String about;

	private String submitted;

	private Date updated_at;

	private int submission_count;

	private int comment_count;

	private String created_at;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getSubmitted() {
		return submitted;
	}

	public void setSubmitted(String submitted) {
		this.submitted = submitted;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public int getSubmission_count() {
		return submission_count;
	}

	public void setSubmission_count(int submission_count) {
		this.submission_count = submission_count;
	}

	public int getComment_count() {
		return comment_count;
	}

	public void setComment_count(int comment_count) {
		this.comment_count = comment_count;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", about=" + about + ", submitted=" + submitted
				+ ", updated_at=" + updated_at + ", submission_count=" + submission_count + ", comment_count="
				+ comment_count + ", created_at=" + created_at + "]";
	}

}
