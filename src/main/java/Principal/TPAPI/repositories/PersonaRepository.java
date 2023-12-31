package Principal.TPAPI.repositories;

import Principal.TPAPI.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
