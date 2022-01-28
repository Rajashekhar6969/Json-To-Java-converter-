package net.inspire.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RootTitle {
	@JsonProperty("")
	Titles titles;

	public Titles getTitles() {
		return titles;
	}

	public void setTitles(Titles titles) {
		this.titles = titles;
	}

	@Override
	public String toString() {
		return "RootTitile [titles=" + titles + "]";
	}

}
