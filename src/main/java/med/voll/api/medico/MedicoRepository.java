package med.voll.api.medico;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long>{

   Page<Medico> findAllByAtivoTrue(Pageable paginacao);
   
}
