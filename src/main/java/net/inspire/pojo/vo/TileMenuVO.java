package net.inspire.pojo.vo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rajashekhar Arroju
 *
 */
public class TileMenuVO {
    
	private String id;

    private boolean exploratoryOrNot = true;
    
    private Boolean jumpLesson = false;
    
    private String CSS = null;
    
    
    private String misc = null;
    
    private int tilesPerRow = 3;
    
    
    private boolean isDefaltMsgsTrans = true;
    
    private boolean isValid;
    
    private Boolean hasTileMenu;
    
    private Boolean hasCourseTestOut;
	
	private Boolean hasPersonalization;
	
	private Boolean knowledgeRequired;
	
	private Boolean hasCert;
    
    
    

	public Boolean getHasTileMenu() {
		return hasTileMenu;
	}

	public void setHasTileMenu(Boolean hasTileMenu) {
		this.hasTileMenu = hasTileMenu;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isExploratoryOrNot() {
		return exploratoryOrNot;
	}

	public void setExploratoryOrNot(boolean exploratoryOrNot) {
		this.exploratoryOrNot = exploratoryOrNot;
	}

	public Boolean getJumpLesson() {
		return jumpLesson;
	}

	public void setJumpLesson(Boolean jumpLesson) {
		this.jumpLesson = jumpLesson;
	}

	public String getCSS() {
		return CSS;
	}

	public void setCSS(String cSS) {
		CSS = cSS;
	}

	public String getMisc() {
		return misc;
	}

	public void setMisc(String misc) {
		this.misc = misc;
	}

	public int getTilesPerRow() {
		return tilesPerRow;
	}

	public void setTilesPerRow(int tilesPerRow) {
		this.tilesPerRow = tilesPerRow;
	}

	public boolean isDefaltMsgsTrans() {
		return isDefaltMsgsTrans;
	}

	public void setDefaltMsgsTrans(boolean isDefaltMsgsTrans) {
		this.isDefaltMsgsTrans = isDefaltMsgsTrans;
	}
	
	public Boolean getKnowledgeRequired() {
		return knowledgeRequired;
	}

	/**
	 * @param isKnowledgerequired
	 *            the isKnowledgerequired to set
	 */
	public void setKnowledgeRequired(Boolean knowledgeRequired) {
		this.knowledgeRequired = knowledgeRequired;
	}
	
	public Boolean getHasCert() {
		return hasCert;
	}

	public void setHasCert(Boolean hasCert) {
		this.hasCert = hasCert;
	}
	
	public Boolean getHasCourseTestOut() {
		return hasCourseTestOut;
	}

	public void setHasCourseTestOut(Boolean hasCourseTestOut) {
		this.hasCourseTestOut = hasCourseTestOut;
	}

	public Boolean getHasPersonalization() {
		return hasPersonalization;
	}

	public void setHasPersonalization(Boolean hasPersonalization) {
		this.hasPersonalization = hasPersonalization;
	}
}