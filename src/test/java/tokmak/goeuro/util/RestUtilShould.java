package tokmak.goeuro.util;

import org.junit.jupiter.api.Test;
import tokmak.goeuro.dto.SuggestDto;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RestUtilShould {

    @Test
    public void returns_not_empty_suggest_list_when_city_is_Berlin() {
        String city = "Berlin";
        List<SuggestDto> suggestList = RestUtil.getSuggestedInformation(city);
        assertTrue(suggestList != null);
        assertTrue(suggestList.size() > 0);
    }

    @Test
    public void returns_empty_suggest_list_when_city_is_unknown() {
        String city = "unknown";
        List<SuggestDto> suggestList = RestUtil.getSuggestedInformation(city);
        assertTrue(suggestList.size() == 0);
    }
}
