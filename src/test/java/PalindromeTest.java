import org.example.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void shouldReturnFalse(){
        final var result = Palindrome.isPalindrome("text");
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnTrue(){
        final var result = Palindrome.isPalindrome("txt");
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnTrueForKobyla(){
        final var result = Palindrome.isPalindrome("kobyłamamałybok");
        Assertions.assertTrue(result);
    }

}
