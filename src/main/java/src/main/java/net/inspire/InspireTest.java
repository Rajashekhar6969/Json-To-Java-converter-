package src.main.java.net.inspire;

import net.inspire.pojo.vo.CourseVO;
import src.main.java.net.inspire.delegator.InspireDelegator;

public class InspireTest {

	public static void main(String[] args) throws Exception {
		
		InspireDelegator inspireDelegator = new InspireDelegator();
		
		CourseVO courseVO = inspireDelegator.getCourseVO();
		
		System.out.println(courseVO);
	}

}
