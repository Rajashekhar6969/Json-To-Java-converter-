package net.inspire.pojo.vo;
/**
 * @author Rajashekhar Arroju
 *
 */
public class LandingPageVO {

	private String id;

	private String content;

	private String customCSS;

	private String courseName;

	private int courseDuration;

	private String pageCaption;

	private String dsktpCourseImg;

	private String mblCourseImg;

	private String courseDurIcon;

	private boolean courseDurationCompatible = true;

	private boolean dsktpCompatible = true;

	private boolean mblCompatible = true;

	private boolean tabCompatible = true;

	private String dsktpCompatibleIcon;

	private String mblCompatibleIcon;

	private String tabCompatibleIcon;

	private String startIcon;

	private String startIconHover;

	private String startIconMob;

	private String title;

	private Boolean hasLandingPage = true;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCustomCSS() {
		return customCSS;
	}

	public void setCustomCSS(String customCSS) {
		this.customCSS = customCSS;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	public String getPageCaption() {
		return pageCaption;
	}

	public void setPageCaption(String pageCaption) {
		this.pageCaption = pageCaption;
	}

	public String getDsktpCourseImg() {
		return dsktpCourseImg;
	}

	public void setDsktpCourseImg(String dsktpCourseImg) {
		this.dsktpCourseImg = dsktpCourseImg;
	}

	public String getMblCourseImg() {
		return mblCourseImg;
	}

	public void setMblCourseImg(String mblCourseImg) {
		this.mblCourseImg = mblCourseImg;
	}

	public String getCourseDurIcon() {
		return courseDurIcon;
	}

	public void setCourseDurIcon(String courseDurIcon) {
		this.courseDurIcon = courseDurIcon;
	}

	public boolean isCourseDurationCompatible() {
		return courseDurationCompatible;
	}

	public void setCourseDurationCompatible(boolean courseDurationCompatible) {
		this.courseDurationCompatible = courseDurationCompatible;
	}

	public boolean isDsktpCompatible() {
		return dsktpCompatible;
	}

	public void setDsktpCompatible(boolean dsktpCompatible) {
		this.dsktpCompatible = dsktpCompatible;
	}

	public boolean isMblCompatible() {
		return mblCompatible;
	}

	public void setMblCompatible(boolean mblCompatible) {
		this.mblCompatible = mblCompatible;
	}

	public boolean isTabCompatible() {
		return tabCompatible;
	}

	public void setTabCompatible(boolean tabCompatible) {
		this.tabCompatible = tabCompatible;
	}

	public String getDsktpCompatibleIcon() {
		return dsktpCompatibleIcon;
	}

	public void setDsktpCompatibleIcon(String dsktpCompatibleIcon) {
		this.dsktpCompatibleIcon = dsktpCompatibleIcon;
	}

	public String getMblCompatibleIcon() {
		return mblCompatibleIcon;
	}

	public void setMblCompatibleIcon(String mblCompatibleIcon) {
		this.mblCompatibleIcon = mblCompatibleIcon;
	}

	public String getTabCompatibleIcon() {
		return tabCompatibleIcon;
	}

	public void setTabCompatibleIcon(String tabCompatibleIcon) {
		this.tabCompatibleIcon = tabCompatibleIcon;
	}

	public String getStartIcon() {
		return startIcon;
	}

	public void setStartIcon(String startIcon) {
		this.startIcon = startIcon;
	}

	public String getStartIconHover() {
		return startIconHover;
	}

	public void setStartIconHover(String startIconHover) {
		this.startIconHover = startIconHover;
	}

	public String getStartIconMob() {
		return startIconMob;
	}

	public void setStartIconMob(String startIconMob) {
		this.startIconMob = startIconMob;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getHasLandingPage() {
		return hasLandingPage;
	}

	public void setHasLandingPage(Boolean hasLandingPage) {
		this.hasLandingPage = hasLandingPage;
	}
}