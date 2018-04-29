package evento.io.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import evento.io.model.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long>{

}
