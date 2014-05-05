package com.jar.jam.web;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jar.jam.domain.enums.EntityType;
import com.jar.jam.domain.model.Photo;
import com.jar.jam.service.impl.PhotoServiceImpl;
import com.jar.jam.service.impl.UserServiceImpl;

@Controller
public class FileUploadController {

	private static final Logger LOG = Logger
			.getLogger(FileUploadController.class);

	@Autowired
	private PhotoServiceImpl photoServiceImpl;

	@Autowired
	private UserServiceImpl userServiceImpl;

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public String uploadFileHandler(@RequestParam("file") MultipartFile file) {
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				String rootPath = "C:\\JAM\\";
				File dir = new File(rootPath + File.separator);
				if (!dir.exists()) {
					dir.mkdirs();
				}
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + file.getOriginalFilename());
				BufferedOutputStream output = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				output.write(bytes);
				output.close();
				setPhotoInDB(serverFile);
				LOG.info("Server File Location = "
						+ serverFile.getAbsolutePath());
				return "redirect:profile";

			} catch (IOException e) {
				return "errors/403";
			}
		} else {
			return "errors/404";
		}

	}

	private void setPhotoInDB(File file) {
		Photo photo = new Photo();
		photo.setEntity(EntityType.AVATAR);
		photo.setPath(file.getAbsolutePath());
		photo.setUser(userServiceImpl.get(1L));
		photoServiceImpl.create(photo);
	}
}
