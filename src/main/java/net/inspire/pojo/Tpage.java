package net.inspire.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tpage {
	/*String id;
	
	String type;//basic, menu,controlled
	
	String template;/* t_intro_start,t_profiler,t_menu,tq_culture,t_text,
	                   t_reflection,t_speaking_up,t_course_timer,t_video,t_accordion,
	                   t_timeline,t_timeline_vertical,t_slideshow,t_parallax,t_popup_expand,
	                   t_ask_the_expert,t_clickevent_imagegrid,t_coverflow,t_attestation,tq_question_center,
	                   tq_question_left,tq_question_right,tq_question_right_image_centre,tq_question_right_one_third_image,tq_question_right_two_third_image,
	                   tq_quickquiz*/
	
	//String src; lrn_102_me03_01.json 
	@JsonProperty("template") 
	public String template;
	@JsonProperty("src") 
    public String src;
	@JsonProperty("type") 
    public String type;
	@JsonProperty("navoff") 
    public String navoff;
	@JsonProperty("back") 
    public String back;
	@JsonProperty("next") 
    public String next;
	@JsonProperty("profile") 
    public String profile;
	@JsonProperty("analytics") 
    public String analytics;
	
	
	public String getTemplate() {
		return template;
	}


	public void setTemplate(String template) {
		this.template = template;
	}


	public String getSrc() {
		return src;
	}


	public void setSrc(String src) {
		this.src = src;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getNavoff() {
		return navoff;
	}


	public void setNavoff(String navoff) {
		this.navoff = navoff;
	}


	public String getBack() {
		return back;
	}


	public void setBack(String back) {
		this.back = back;
	}


	public String getNext() {
		return next;
	}


	public void setNext(String next) {
		this.next = next;
	}


	public String getProfile() {
		return profile;
	}


	public void setProfile(String profile) {
		this.profile = profile;
	}


	public String getAnalytics() {
		return analytics;
	}


	public void setAnalytics(String analytics) {
		this.analytics = analytics;
	}


	@Override
	public String toString() {
		return "Tpage [template=" + template + ", src=" + src + ", type=" + type + ", navoff=" + navoff + ", back="
				+ back + ", next=" + next + ", profile=" + profile + ", analytics=" + analytics + "]";
	}
	
	

}
