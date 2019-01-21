package aws.mitocode.spring.service;
import java.util.List;
import aws.mitocode.spring.model.Encuesta;

public interface IEncuestaService {
	List<Encuesta> getAll();
	void save(Encuesta encuesta);
}
