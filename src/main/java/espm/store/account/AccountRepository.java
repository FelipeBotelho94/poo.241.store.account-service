package espm.store.account;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<AccountModel, String> {

    // Notacao JQL - JPA
    List<AccountModel> findByEmail(String email);
    
}
