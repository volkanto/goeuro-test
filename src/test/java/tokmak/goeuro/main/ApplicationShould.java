package tokmak.goeuro.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class ApplicationShould {

    @Test
    public void throws_exception_when_argument_is_null() {
        assertThrows(IllegalArgumentException.class, () -> Application.main(null));
    }

    @Test
    public void
    throws_exception_when_argument_is_empty() {
        String[] arguments = {};
        assertThrows(IllegalArgumentException.class, () -> Application.main(arguments));
    }

    @Test
    public void throws_exception_when_argument_is_more_than_one() {
        String[] arguments = {"Ankara", "Berlin"};
        assertThrows(IllegalArgumentException.class, () -> Application.main(arguments));
    }

    @Test
    public void throws_exception_when_suggest_list_is_empty() {
        String[] arguments = {"Unknown city"};
        assertThrows(IllegalArgumentException.class, () -> Application.main(arguments));
    }
}
