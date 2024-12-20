import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    @DisplayName("Durchschnittsbewertung")
    @Tag("Average")
    void average() {
        Bewertung bewertung = new Bewertung("Jasmin K.", LocalDateTime.of(2024, 12, 19, 0, 0, 0), 2, 4, 5, 1);

        assertEquals(3.0,bewertung.berechneDurchschnitt());
    }

}