package net.inspire.controller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.inspire.pojo.TigerCourse;
import net.inspire.pojo.Titles;

@RestController
public class HelloController {

	@RequestMapping("/convertCourse")
	public String converter() throws IOException, ParseException {
		
		 TigerCourse tigerCourse =null;
		try {
            ObjectMapper om = new ObjectMapper();
            tigerCourse = om.readValue(new File("src/main/resources/tiger_sample_course/shared/json/structure.json"), TigerCourse.class);
            System.out.println(tigerCourse.getId());
            System.out.println(tigerCourse.getLessons().get(0).id);
            //ObjectMapper om1 = new ObjectMapper();
            //titles = om1.readValue(new File("src/main/resources/tiger_sample_course/enUS/json/titles.json"), TitleRoot.class);
            //System.out.println(titles.toString());
            //fetch titles
            
            Object obj = new JSONParser().parse(new FileReader("src/main/resources/tiger_sample_course/enUS/json/titles.json"));
            
	        // typecasting obj to JSONObject
	        JSONObject jo = (JSONObject) obj;
	        //Titles titles1=(Titles) jo.get(tigerCourse.getId());
	        System.out.println(jo.get(tigerCourse.getId()));
	        //Titles titles1=(Titles) jo.get(tigerCourse.getId());
	        //System.out.println(titles1.getTitle());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		return tigerCourse.toString();
    }
	
	
}
