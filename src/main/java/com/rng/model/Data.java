package com.rng.model;
public class Data{
	
	
    public String id;
    
    public String type;
    
    public Attributes attributes;
    
    public Relationships relationships;
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Attributes getAttributes() {
		return attributes;
	}
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}
	public Relationships getRelationships() {
		return relationships;
	}
	public void setRelationships(Relationships relationships) {
		this.relationships = relationships;
	}
}

