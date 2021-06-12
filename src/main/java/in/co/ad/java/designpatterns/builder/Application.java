package in.co.ad.java.designpatterns.builder;

import lombok.extern.java.Log;

@Log
public class Application {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder("a", "1").build();
        log.info(bankAccount.toString());
        BankAccount bankAccount2 = new BankAccount.BankAccountBuilder("a", "1").withEmail("mail@gmail.com").build();
        log.info(bankAccount2.toString());
        BankAccount bankAccount3 = new BankAccount.BankAccountBuilder("a", "1").withEmail("mail@gmail.com").wantNewsletter(true).build();
        log.info(bankAccount3.toString());
    }
}
