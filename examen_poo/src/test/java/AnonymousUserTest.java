import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.examen_poo.AnonymousUser;

public class AnonymousUserTest {
    private AnonymousUser anon;

    @BeforeEach
    public void setUp() {
        anon = new AnonymousUser(77);
    }

    @Test
    public void testAnonymousUserCreation() {
        assertEquals(77, anon.getID());
    }

    @Test
    public void testShowDataUser() {
        assertDoesNotThrow(() -> anon.showDataUser());
    }
}
