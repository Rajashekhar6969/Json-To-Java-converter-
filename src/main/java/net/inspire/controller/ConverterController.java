package net.inspire.controller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.inspire.pojo.TLesson;
import net.inspire.pojo.TigerCourse;
import net.inspire.pojo.vo.CourseVO;
import net.inspire.pojo.vo.LessonVO;

@RestController
public class ConverterController {

	@RequestMapping("/convertCourse")
	public String converter() throws IOException, ParseException {

		TigerCourse tigerCourse = null;
		try {
			CourseVO courseVo = new CourseVO();
			ArrayList<LessonVO> lessonList = new ArrayList<LessonVO>();
			ObjectMapper om = new ObjectMapper();
			tigerCourse = om.readValue(new File("src/main/resources/tiger_sample_course/shared/json/structure.json"),
					TigerCourse.class);
			System.out.println(tigerCourse.getId());
			System.out.println(tigerCourse.getLessons().get(0).id);

			Object obj = new JSONParser()
					.parse(new FileReader("src/main/resources/tiger_sample_course/enUS/json/titles.json"));

			JSONObject jo = (JSONObject) obj;
			JSONObject courseTitle = (JSONObject) jo.get(tigerCourse.getId());
			System.out.println("course title----" + courseTitle.get("title"));
			courseVo.setCourseTitle(courseTitle.get("title").toString());
			List<TLesson> lessonlist = tigerCourse.getLessons();
			for (TLesson lesson : lessonlist) {
				JSONObject lessonTitles = (JSONObject) jo.get(lesson.getId());
				LessonVO lessonVO = new LessonVO();
				System.out.println(lessonTitles.get("title"));
				lessonVO.setLessonTitle(lessonTitles.get("title").toString());
				lessonVO.setDuration(lessonTitles.get("duration").toString());
				lessonList.add(lessonVO);
			}
			courseVo.setLessonVO(lessonList);
			return courseVo.toString();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
