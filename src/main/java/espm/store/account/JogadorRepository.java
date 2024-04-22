package espm.store.account;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Repository
public interface JogadorRepository extends CrudRepository<AccountModel, String> {

    // Notacao JQL - JPA
    List<AccountModel> findByEmail(String email);

    @Entity
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Getters e Setters
}

    Account save(Account jogador);
    
}
