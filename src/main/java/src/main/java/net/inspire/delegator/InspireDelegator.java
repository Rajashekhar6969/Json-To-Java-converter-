package src.main.java.net.inspire.delegator;

import net.inspire.pojo.vo.CourseVO;
import src.main.java.net.inspire.factory.InspireCourseBuilder;
import src.main.java.net.inspire.factory.TigerCourseBuilder;

public class InspireDelegator {
	
	private TigerCourseBuilder builder;
	
	
	public CourseVO getCourseVO() throws Exception {
		
		populateTigerCourseBuilder();
		
		InspireCourseBuilder inspireCourseBuilder = new InspireCourseBuilder(builder);
		
		CourseVO courseVO = inspireCourseBuilder.buildInspireCourse();
		
		
		return courseVO;
	}
	
	private void populateTigerCourseBuilder() throws Exception {
		builder = new TigerCourseBuilder();
	}
	
	 
	
}
