package net.inspire.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Titles {
	//@JsonProperty("id")
	//public String id;
	@JsonProperty("title") 
	public String title;
	@JsonProperty("duration") 
    public String duration;
	/*public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}*/
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Titles [title=" + title + ", duration=" + duration + "]";
	}
    
	
	

}
