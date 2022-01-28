
package net.inspire.pojo.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
/**
 * @author Rajashekhar Arroju
 *
 */
@JsonInclude(value=Include.NON_NULL)
public class PageVO {

	public String template;
    public String src;
    public String type;
    public String profile;
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
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "PageVO [template=" + template + ", src=" + src + ", type=" + type + ", profile=" + profile + "]";
	}
}
