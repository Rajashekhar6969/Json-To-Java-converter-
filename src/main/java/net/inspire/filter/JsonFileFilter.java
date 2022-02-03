package net.inspire.filter;

import java.io.*;

public class JsonFileFilter implements FilenameFilter {

	String initials;

	public JsonFileFilter(String initials) {
		this.initials = initials;
	}

	// overriding the accept method of FilenameFilter
	// interface
	public boolean accept(File dir, String name) {
		return name.startsWith(initials);
	}

}
