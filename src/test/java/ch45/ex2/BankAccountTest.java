package ch45.ex2;

import org.example.ch45.ex2.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testConstructorAndGetters() {
        BankAccount acc = new BankAccount("123", "John", 1000);
        assertEquals("123", acc.getAccountNumber());
        assertEquals("John", acc.getOwner());
        assertEquals(1000, acc.getBalance());
    }

    @Test
    void testSettersValidation() {
        BankAccount acc = new BankAccount("123", "John", 1000);
        assertThrows(IllegalArgumentException.class, () -> acc.setBalance(-1));
        assertThrows(IllegalArgumentException.class, () -> acc.setOwner(""));
        assertThrows(IllegalArgumentException.class, () -> acc.setAccountNumber(null));
    }

    @Test
    void testDeposit() {
        BankAccount acc = new BankAccount("123", "John", 1000);
        acc.deposit(500);
        assertEquals(1500, acc.getBalance());
        assertThrows(IllegalArgumentException.class, () -> acc.deposit(0));
        assertThrows(IllegalArgumentException.class, () -> acc.deposit(-100));
    }

    @Test
    void testWithdraw() {
        BankAccount acc = new BankAccount("123", "John", 1000);
        acc.withdraw(500);
        assertEquals(500, acc.getBalance());
        assertThrows(IllegalArgumentException.class, () -> acc.withdraw(0));
        assertThrows(IllegalArgumentException.class, () -> acc.withdraw(-100));
        assertThrows(IllegalArgumentException.class, () -> acc.withdraw(2000));
    }
}