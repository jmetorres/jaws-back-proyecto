package aws.mitocode.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aws.mitocode.spring.dao.IEncuestaDao;
import aws.mitocode.spring.model.Encuesta;
import aws.mitocode.spring.service.IEncuestaService;

@Service
public class EncuestaServiceImpl implements IEncuestaService {

	@Autowired
	private IEncuestaDao encuestaDao;
	
	
	@Override
	public List<Encuesta> getAll() {	
		return encuestaDao.findAll();
	}

	@Override
	public void save(Encuesta encuesta) {
		encuestaDao.save(encuesta);
	}

}
