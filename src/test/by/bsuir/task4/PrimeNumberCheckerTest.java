package test.by.bsuir.task4;

import main.by.bsuir.task4.PrimeNumberChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberCheckerTest {
    private static final int[] PRIME_NUMBERS = {2, 3, 5, 7, 11, 13, 17, 104729, 1299827, 15485867};
    private static final int[] NON_PRIME_NUMBERS = {1, 4, 6, 8, 9, 15, 25, 1000000, 12345678, 987654321};
    private static final int[] NEGATIVE_NUMBERS = {-2, -3, -5, -7};

    @Test
    public void isPrimeTestPrimeNumbers() {
        for (int number : PRIME_NUMBERS) {
            assertTrue(PrimeNumberChecker.isPrime(number));
        }
    }

    @Test
    public void isPrimeTestNonPrimeNumbers() {
        for (int number : NON_PRIME_NUMBERS) {
            assertFalse(PrimeNumberChecker.isPrime(number));
        }
    }

    @Test
    public void isPrimeTestNegativeNumbers() {
        for (int number : NEGATIVE_NUMBERS) {
            assertFalse(PrimeNumberChecker.isPrime(number));
        }
    }
}