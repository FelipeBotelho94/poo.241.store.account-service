package espm.store.account;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
@Builder @Accessors(chain = true, fluent = true)
public final class Account {

    private String id;
    private String name;
    private String email;
    private String password;
    
}
