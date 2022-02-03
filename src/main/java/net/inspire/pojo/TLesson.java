package net.inspire.pojo;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.annotation.JsonProperty;

import static src.main.java.net.inspire.InspireConstants.*;

public class TLesson {
	@JsonProperty("id") 
	public String id;
	@JsonProperty("type") 
    public String type;
	@JsonProperty("page") 
    public ArrayList<Tpage> page;
	
	private String title;
	private String duration;
	
	
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
	
	public String getTitle() throws Exception {
		if ( title == null ) {
			title = getKeyValue("title");
		}
		
		return title;
	}
	
	public String getDuration() throws Exception {
		if ( duration == null ) {
			duration = getKeyValue("duration");
		}
		
		return duration;
	}
	
	private String getKeyValue(String key) throws Exception {
		String value = null;
		
		Object obj = new JSONParser()
				.parse(new FileReader(FILE_TITLES_PATH));

		JSONObject jo = (JSONObject) obj;
		JSONObject lessonTitles = (JSONObject) jo.get(this.getId());
		return (String)lessonTitles.get(key);
	}


	@Override
	public String toString() {
		return "TLesson [id=" + id + ", type=" + type + ", page=" + page + "]";
	}
	
	
}
