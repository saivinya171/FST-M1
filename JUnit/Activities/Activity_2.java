import activites.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity_2 {
    @Test
    void notEnoughFunds(){
        BankAccount account = new BankAccount(10);
        assertThrows(BankAccount.NotEnoughFundsException.class,()->account.withdraw(11));
    }


    @Test
    void enoughFunds(){
        BankAccount account = new BankAccount(100);
        assertDoesNotThrow(()->account.withdraw(20));
    }
}
