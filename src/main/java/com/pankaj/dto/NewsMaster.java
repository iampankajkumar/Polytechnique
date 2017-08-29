package com.pankaj.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "news_master")
public class NewsMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private short newsId;

	@Column(name = "user_id")
	private String userId;

	private String heading;

	private String description;

	@Column(name = "news_name")
	private String newsFileName;

	private byte[] newsFile;

	public short getNewsId() {
		return newsId;
	}

	public void setNewsId(short newsId) {
		this.newsId = newsId;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNewsFileName() {
		return newsFileName;
	}

	public void setNewsFileName(String newsFileName) {
		this.newsFileName = newsFileName;
	}

	public byte[] getNewsFile() {
		return newsFile;
	}

	public void setNewsFile(byte[] newsFile) {
		this.newsFile = newsFile;
	}

}
