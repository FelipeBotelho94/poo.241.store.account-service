package espm.store.account;

public final class AccountParser {
    
    public static Account to(AccountIn in) {
        return null == in ? null : Account.builder()
            .name(in.name())
            .email(in.email())
            .password(in.password())
            .build();
    }

    public static AccountOut to(Account account) {
        return null == account ? null : new AccountOut(
            account.id(),
            account.name(),
            account.email()
        );
    }

}
