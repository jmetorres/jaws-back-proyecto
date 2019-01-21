package aws.mitocode.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aws.mitocode.spring.model.Encuesta;

@Repository
public interface IEncuestaDao extends JpaRepository<Encuesta, Integer>{

}
