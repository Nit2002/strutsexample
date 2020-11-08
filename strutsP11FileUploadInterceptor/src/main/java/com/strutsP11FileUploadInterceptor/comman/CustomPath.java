
package com.strutsP11FileUploadInterceptor.comman;

import org.apache.struts2.ServletActionContext;

public class CustomPath {
	
	public static String getPath(String folderName) {
		String filePath = ServletActionContext.getServletContext().getRealPath("/");
		String path = filePath.substring(0, filePath.indexOf(".metadata"))
					.concat(filePath.substring(filePath.indexOf("wtpwebapps") +"wtpwebapps".length() )
					.concat("src/main/webapp/")
					.concat(folderName));
		System.out.println(" "+path);
		return path;
	}
}
