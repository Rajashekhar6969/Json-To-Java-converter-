package src.main.java.net.inspire.factory;

import net.inspire.pojo.vo.CourseVO;

public class InspireCourseBuilder {
	
	private TigerCourseBuilder tigerCourseBuilder;
	
	

	
	public CourseVO buildInspireCourse() {
		CourseVO courseVO = new CourseVO();
		
		
		
		return courseVO;
	}
	
	public InspireCourseBuilder(TigerCourseBuilder tigerCourseBuilder) {
		this.tigerCourseBuilder = tigerCourseBuilder;
	}
}
