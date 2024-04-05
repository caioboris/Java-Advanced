package br.com.fiap.FirstApp.Repository;

import br.com.fiap.FirstApp.Models.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Usuario, Long> {


}
