package algaworksCRMapi.algaCRM.repository;

import algaworksCRMapi.algaCRM.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Cliente, Long> {
}
