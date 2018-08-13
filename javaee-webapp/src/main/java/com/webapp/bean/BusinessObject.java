package com.webapp.bean;

public class BusinessObject {

	private String objectId;
	private String type;
	private String name;
	private String revision;
	private String description;

	public BusinessObject() {

	}

	public BusinessObject(String objectId, String type, String name, String revision, String description) {
		super();
		this.objectId = objectId;
		this.type = type;
		this.name = name;
		this.revision = revision;
		this.description = description;
	}

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
