package in.co.ad.java.designpatterns.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class BankAccount {
    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;

    private BankAccount(BankAccountBuilder bankAccountBuilder) {
        this.name = bankAccountBuilder.name;
        this.accountNumber = bankAccountBuilder.accountNumber;
        this.email = bankAccountBuilder.email;
        this.newsletter = bankAccountBuilder.newsletter;
    }

    @Override
    public String toString() {
        return String.format("name: " + name + ", accountNumber:" + accountNumber + ", email: " + email + ", newsletter:" + newsletter + ".");
    }

    @Data
    public static class BankAccountBuilder {
        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;

        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }


        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder wantNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }

    }
}
