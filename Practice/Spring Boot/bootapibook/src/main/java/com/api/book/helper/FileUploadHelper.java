package com.api.book.helper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadHelper {
	
//	public final String UPLOAD_DIR = "R:\\java sts\\Practice\\Spring Boot\\bootapibook\\"
//			+ "src\\main\\resources\\static\\image";
	
	public final String UPLOAD_DIR = new ClassPathResource("/static/image/").getFile().getAbsolutePath();
	
	public FileUploadHelper() throws IOException {
		
	}
	
	public boolean uploadFile(MultipartFile multipartFile) {
		boolean f = false;
		
		try {
			//read
			
//			InputStream is = multipartFile.getInputStream();
//			byte[] data = new byte[is.available()];
//			is.read(data);
			
			//write
//			
//			FileOutputStream fos = new FileOutputStream(UPLOAD_DIR+"\\"+multipartFile.getOriginalFilename());
//			fos.write(data);
//			
//			fos.flush();
//			fos.close();
			
			Files.copy(multipartFile.getInputStream(), 
					Paths.get(UPLOAD_DIR+"\\"+multipartFile.getOriginalFilename()), 
					StandardCopyOption.REPLACE_EXISTING);
			f=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}

}
