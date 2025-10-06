import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.examen_poo.Messages;
import com.examen_poo.NormalUser;
import com.examen_poo.Publication;

public class PublicationTest {
    private Publication publication;
    private NormalUser author;
    private Messages message1;
    private Messages message2;

    @BeforeEach
    public void setUp() {
        author = new NormalUser(1, "Paul", "Durand", "paul@example.com");
        publication = new Publication(200, "Contenu de la publication", author);
        message1 = new Messages(1, "Premier message", author, publication, true);
        message2 = new Messages(2, "Deuxième message", author, publication, false);
    }

    @Test
    public void testPublicationCreation() {
        assertEquals(200, publication.getID());
        assertEquals(author, publication.getAuthor());
    }

    @Test
    public void testAddMessage() {
        publication.addMessage(message1);
        publication.addMessage(message2);
        assertDoesNotThrow(() -> publication.showMessageAuthors());
    }

    @Test
    public void testShowDataPublication() {
        assertDoesNotThrow(() -> publication.showDataPublication());
    }
}
