package com.cl.springjuegos.service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.cl.springjuegos.model.Juego;
import com.cl.springjuegos.repository.JuegoRepository;
import com.cl.springjuegos.util.Excepcion;

@Service
public class JuegoService {
	
	@Value("${app.upload.dir}")
    public String uploadDir;

	@Autowired
	private JuegoRepository repository;

	public Juego save(Juego juego,MultipartFile file) {
		String ruta =uploadFile(file);
		juego.setImagen_juego(ruta);
		return repository.save(juego);
	}
	public Juego edit(Juego juego) {
		return repository.save(juego);
	}
	
	public void delete(int id) {
		repository.deleteById(id);
	}
	
	public Juego getById(int id) {
		Optional<Juego> juego =repository.findById(id);
		if(juego.isPresent()) {
			return juego.get();
		}
		return null;
	}
	
	public List<Juego> getAll(){
		List<Juego> lista = new ArrayList<>();
		lista =(List<Juego>) repository.findAll();
		return lista;
	}
	
	

    public String uploadFile(MultipartFile file) {

    	String ruta;
        try {
            Path copyLocation = Paths
                .get(uploadDir + File.separator + StringUtils.cleanPath(file.getOriginalFilename()));
            Files.copy(file.getInputStream(), copyLocation, StandardCopyOption.REPLACE_EXISTING);
            ruta = copyLocation.getFileName().toString();
            System.out.print(ruta);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Excepcion("Could not store file " + file.getOriginalFilename()
                + ". Please try again!");
        }
        return ruta;
    }
}
