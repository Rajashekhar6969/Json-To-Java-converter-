package net.inspire.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TigerCourse {
	
	@JsonProperty("id") 
	String id;
	@JsonProperty("type") 
	String type;
	@JsonProperty("groupnode") 
	List<TLesson> lessons;
	
	
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


	public List<TLesson> getLessons() {
		return lessons;
	}


	public void setLessons(List<TLesson> lessons) {
		this.lessons = lessons;
	}


	@Override
	public String toString() {
		return "TigerCourse [id=" + id + ", type=" + type + ", lessons=" + lessons + "]";
	}
	
	
}