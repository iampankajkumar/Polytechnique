package com.pankaj.action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class NewsMgmtAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File file;
	private String fileContentType;
	private String fileFileName;
	private String heading;
	private String description;
	private String responseFileString;
	private short userId;

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

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getResponseFileString() {
		return responseFileString;
	}

	public void setResponseFileString(String responseFileString) {
		this.responseFileString = responseFileString;
	}

	@Override
	public String execute() throws Exception {
		return null;
	}

	public String uploadNews() {
		return SUCCESS;
	}

	public String getAllNews() {
		return SUCCESS;
	}

	public short getUserId() {
		return userId;
	}

	public void setUserId(short userId) {
		this.userId = userId;
	}

}