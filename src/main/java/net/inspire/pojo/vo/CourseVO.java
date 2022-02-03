package net.inspire.pojo.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
/**
 * @author Rajashekhar Arroju
 *
 */
@JsonInclude(value=Include.NON_NULL)
public class CourseVO {

	private String courseTitle;
	
	private List<LessonVO> lessonVO;
	
	private TileMenuVO tileMenuVO;
	
	private LandingPageVO landingPageVO;

	public List<LessonVO> getLessonVO() {
		return lessonVO;
	}

	public void setLessonVO(List<LessonVO> lessonVO) {
		this.lessonVO = lessonVO;
	}

	public TileMenuVO getTileMenuVO() {
		return tileMenuVO;
	}

	public void setTileMenuVO(TileMenuVO tileMenuVO) {
		this.tileMenuVO = tileMenuVO;
	}

	public LandingPageVO getLandingPageVO() {
		return landingPageVO;
	}

	public void setLandingPageVO(LandingPageVO landingPageVO) {
		this.landingPageVO = landingPageVO;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	@Override
	public String toString() {
		return "CourseVO [courseTitle=" + courseTitle + ", lessonVO=" + lessonVO + ", tileMenuVO=" + tileMenuVO
				+ ", landingPageVO=" + landingPageVO + "]";
	}

	
}
