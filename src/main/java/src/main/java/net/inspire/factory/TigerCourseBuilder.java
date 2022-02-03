package src.main.java.net.inspire.factory;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.inspire.pojo.*;

import static src.main.java.net.inspire.InspireConstants.*;

public class TigerCourseBuilder {
	
	private TigerCourse tigerCourse = null;
	private String courseTitle 		= null;
	
	public TigerCourseBuilder() throws Exception {
		buildTigerCourse();
		buildCourseTitle();
		
		//This is only for Testing....
		parseTigerCourse();
	}
	
	private void buildTigerCourse() throws Exception {
		System.out.println("buildTigerCourse Started ===>");
		String filepath=null;
		ObjectMapper om = new ObjectMapper();
		tigerCourse = om.readValue(new File(FILE_STRUCTURE_PATH),
				TigerCourse.class);
		System.out.println("buildTigerCourse Ended ===>");
	}
	
	private String buildCourseTitle() throws Exception {
		
		System.out.println("buildCourseTitle Started ===>");
		Object obj = new JSONParser()
				.parse(new FileReader(FILE_TITLES_PATH));

		JSONObject jo = (JSONObject) obj;
		JSONObject courseTitle = (JSONObject) jo.get(tigerCourse.getId());
		
		System.out.println("course title----" + courseTitle.get("title"));
		
		System.out.println("buildCourseTitle Ended ===>" + (String)courseTitle.get("title"));
		
		return (String)courseTitle.get("title");
	}

	public TigerCourse getTigerCourse() {
		return tigerCourse;
	}

	public String getCourseTitle() {
		return courseTitle;
	}
	
	public void parseTigerCourse() throws Exception {
		System.out.println(tigerCourse.getId());
		
		for (TLesson lesson : tigerCourse.getLessons()) {
			
			System.out.println(lesson.getId() + " : " + lesson.getTitle() + " : " + lesson.getType());
			
			for (Tpage page : lesson.getPage()) {
				System.out.println(page.getProfile() + " : " + page.getTemplate() + " : " + page.getType());
				System.out.println("Parsing ...\n");
				page.parsePageJson();
			}
			
		}

		
	}
	
}
