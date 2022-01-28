package net.inspire.pojo.vo;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
/**
 * @author Rajashekar Arroju
 *
 */
@JsonInclude(value=Include.NON_NULL)
public class LessonVO {
	
	private String lessonTitle;
	private String lessonType;
	private List<PageVO> pageVO;
	private String duration;

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<PageVO> getPageVO() {
		return pageVO;
	}

	public void setPageVO(List<PageVO> pageVO) {
		this.pageVO = pageVO;
	}

	public String getLessonType() {
		return lessonType;
	}

	public void setLessonType(String lessonType) {
		this.lessonType = lessonType;
	}

	public String getLessonTitle() {
		return lessonTitle;
	}

	public void setLessonTitle(String lessonTitle) {
		this.lessonTitle = lessonTitle;
	}

	@Override
	public String toString() {
		return "LessonVO [lessonTitle=" + lessonTitle + ", lessonType=" + lessonType + ", pageVO=" + pageVO
				+ ", duration=" + duration + "]";
	}

}
