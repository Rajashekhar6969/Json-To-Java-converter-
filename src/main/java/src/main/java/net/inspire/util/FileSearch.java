package src.main.java.net.inspire.util;

import java.io.*;
import java.util.*;

public class FileSearch {

	  private String fileNameToSearch;
	  private List<String> result = new ArrayList<String>();
		
	  public String getFileNameToSearch() {
		return fileNameToSearch;
	  }

	  public void setFileNameToSearch(String fileNameToSearch) {
		this.fileNameToSearch = fileNameToSearch;
	  }

	  public List<String> getResult() {
		return result;
	  }

	  public static void find(String folderPath, String fileName, String extention) {

		FileSearch fileSearch = new FileSearch();
	  
	        //try different directory and filename :)
		fileSearch.searchDirectory(new File(folderPath), fileName+extention);

		int count = fileSearch.getResult().size();
		if(count ==0){
		    System.out.println("\nNo result found!");
		}else{
		    System.out.println("\nFound " + count + " result!\n");
		    for (String matched : fileSearch.getResult()){
			System.out.println("Found : " + matched);
		    }
		}
	  }
	  public static String find(String folderPath, String fileName) {

			FileSearch fileSearch = new FileSearch();
		  
		        //try different directory and filename :)
			fileSearch.searchDirectory(new File(folderPath), fileName);

			int count = fileSearch.getResult().size();
			if(count ==0){
			    System.out.println("\nNo result found!");
			}else{
			    System.out.println("\nFound " + count + " result!\n");
			    for (String matched : fileSearch.getResult()){
				System.out.println("Found : " + matched);
				return matched;
			    }
			}
			return "Path not found";
		  }

	  public void searchDirectory(File directory, String fileNameToSearch) {

		setFileNameToSearch(fileNameToSearch);

		if (directory.isDirectory()) {
		    search(directory);
		} else {
		    System.out.println(directory.getAbsoluteFile() + " is not a directory!");
		}

	  }

	  private void search(File file) {

		if (file.isDirectory()) {
		  //System.out.println("Searching directory ... " + file.getAbsoluteFile());
			
	            //do you have permission to read this directory?	
		    if (file.canRead()) {
			for (File temp : file.listFiles()) {
			    if (temp.isDirectory()) {
				search(temp);
			    } else {
				if (getFileNameToSearch().equals(temp.getName().toLowerCase())) {			
				    result.add(temp.getAbsoluteFile().toString());
			    }

			}
		    }

		 } else {
			System.out.println(file.getAbsoluteFile() + "Permission Denied");
		 }
	      }

	  }

	}