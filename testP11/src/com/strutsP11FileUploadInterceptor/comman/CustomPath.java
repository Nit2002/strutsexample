
package com.strutsP11FileUploadInterceptor.comman;

import javax.servlet.http.HttpServletRequest;

public class CustomPath {
	
	public static String getPath(HttpServletRequest request,String folderName) {
		String filePath = request.getServletContext().getRealPath("/");
		String path = filePath.substring(0, filePath.indexOf(".metadata"))
					.concat(filePath.substring(filePath.indexOf("wtpwebapps") +"wtpwebapps".length() )
					.concat("WebContent/")
					.concat(folderName));
		System.out.println(" "+path);
		return path;
	}
}
