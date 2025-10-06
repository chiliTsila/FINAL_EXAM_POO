import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.examen_poo.Messages;
import com.examen_poo.NormalUser;
import com.examen_poo.Publication;

public class MessagesTest {
    private Messages message;
    private NormalUser author;
    private Publication publication;

    @BeforeEach
    public void setUp() {
        author = new NormalUser(5, "Sam", "Doe", "sam@example.com");
        publication = new Publication(100, "Contenu de la publication", author);
        message = new Messages(50, "Ceci est un message", author, publication);
    }

    @Test
    public void testMessageCreation() {
        assertEquals(50, message.getID());
        assertEquals("Ceci est un message", message.getContent());
        assertEquals(author, message.getAuthor());
        assertEquals(publication, message.getPublication());
    }

    @Test
    public void testShowDataMessage() {
        assertDoesNotThrow(() -> message.showDataMessage());
    }
}
