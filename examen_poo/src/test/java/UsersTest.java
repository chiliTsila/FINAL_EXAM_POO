
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.examen_poo.AnonymousUser;
import com.examen_poo.NormalUser;

public class UsersTest {
    private NormalUser user;
    private AnonymousUser anonyme;

    @BeforeEach
    public void setUp() {
        user = new NormalUser(1, "Alice", "Dupont", "alice@example.com");
        anonyme = new AnonymousUser(99);
    }

    @Test
    public void testNormalUserCreation() {
        assertEquals(1, user.getID());
        assertEquals("Alice", user.getFirstName());
    }

    @Test
    public void testAnonymousUserCreation() {
        assertEquals(99, anonyme.getID());
    }
}