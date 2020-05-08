package nicolini.will.h2dbmanha.repository;

import nicolini.will.h2dbmanha.model.CelphoneEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

// A partir desta começa a camada de persistência - JPA
public interface CelphoneRepository extends CrudRepository<CelphoneEntity, Long> {







}
