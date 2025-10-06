
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.examen_poo.NormalUser;

public class NormalUserTest {
	private NormalUser user;

	@BeforeEach
	public void setUp() {
		user = new NormalUser(10, "Bob", "Martin", "bob@example.com");
	}

	@Test
	public void testNormalUserCreation() {
		assertEquals(10, user.getID());
		assertEquals("Bob", user.getFirstName());
	}

	@Test
	public void testShowDataUser() {
		assertDoesNotThrow(() -> user.showDataUser());
	}

}
