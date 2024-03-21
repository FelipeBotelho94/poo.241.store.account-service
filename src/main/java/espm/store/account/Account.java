package espm.store.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@Builder @Accessors(chain = true, fluent = true)
@NoArgsConstructor @AllArgsConstructor
public final class Account {

    private String id;
    private String name;
    private String email;
    private String password;
    
}
