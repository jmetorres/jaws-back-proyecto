package aws.mitocode.spring.controller.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import aws.mitocode.spring.model.Encuesta;
import aws.mitocode.spring.service.IEncuestaService;

@Controller
@CrossOrigin
@RequestMapping("api/encuesta")
public class ApiEncuestaController {

	private static final Logger logger = LoggerFactory.getLogger(ApiEncuestaController.class);
	
	@Autowired
	private IEncuestaService encuestaService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Encuesta>> getAll(){
		try {
			return new ResponseEntity<List<Encuesta>>(
					encuestaService.getAll(), 
					HttpStatus.OK);
		}catch(Exception e) {
			logger.error("Error: ",e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Encuesta> save(
			@RequestBody Encuesta encuesta){
		try {
			encuestaService.save(encuesta);
			return new ResponseEntity<Encuesta>(encuesta, HttpStatus.OK);
		}catch(Exception e) {
			logger.error("Error: ",e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
