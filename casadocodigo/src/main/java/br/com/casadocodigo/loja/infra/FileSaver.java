package br.com.casadocodigo.loja.infra;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileSaver {

	@Autowired
	private HttpServletRequest request;

	public String write(String baseFolder, MultipartFile file) {
		try {
			//SALVAR EM PASTA DO PROJETO
//			String realPath = request.getServletContext().getRealPath("/"+baseFolder);
//			String path = realPath + "/" + file.getOriginalFilename();
			
			//SALVAR EM PASTA DO SERVIDOR
			String homePath = System.getProperty("user.home");
			String baseFolderPath = homePath + "/" +baseFolder;
			String path = baseFolderPath +"/" +file.getOriginalFilename();
			
			file.transferTo(new File(path));

			return baseFolder + "/" + file.getOriginalFilename();

		} catch (IllegalStateException | IOException e) {
			throw new RuntimeException(e);
		}
	}
}