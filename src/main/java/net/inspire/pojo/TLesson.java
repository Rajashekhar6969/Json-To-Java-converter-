package net.inspire.pojo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TLesson {
	@JsonProperty("id") 
	public String id;
	@JsonProperty("type") 
    public String type;
	@JsonProperty("page") 
    public ArrayList<Tpage> page;
	
	
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


	public ArrayList<Tpage> getPage() {
		return page;
	}


	public void setPage(ArrayList<Tpage> page) {
		this.page = page;
	}


	@Override
	public String toString() {
		return "TLesson [id=" + id + ", type=" + type + ", page=" + page + "]";
	}
	
	
}
