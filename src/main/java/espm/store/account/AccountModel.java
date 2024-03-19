package espm.store.account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/*
 * Representa a tabela de contas de usuarios
 */
@Entity
@Table(name = "account")
@AllArgsConstructor @NoArgsConstructor
public class AccountModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_account")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "hash_password")
    private String hashPassword;

    public AccountModel(Account account) {
        this.id = account.id();
        this.name = account.name();
        this.email = account.email();
        this.hashPassword = account.password();
    }

    public Account to() {
        return Account.builder()
            .id(id)
            .name(name)
            .email(email)
            .password(hashPassword)
            .build();
    }
    
}
