package tokmak.goeuro.util;

import org.json.JSONArray;
import org.junit.jupiter.api.Test;
import tokmak.goeuro.dto.SuggestDto;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static tokmak.goeuro.util.JsonUtil.convertToJson;

/**
 * <b>Project GoEuroTest</b><br />
 * JsonUtilShould.java<br />
 *
 * @author Volkan Tokmak
 * @since 0.0.1
 */
public class JsonUtilShould {
    @Test
    public void throws_exception_when_suggestlist_is_empty() {
        assertThrows(NullPointerException.class, () -> convertToJson(null));
    }

    @Test
    public void returns_empty_json_when_suggest_list_is_empty() {
        List<SuggestDto> suggestList = new ArrayList<>();
        JSONArray convertedToJson = convertToJson(suggestList);
        assertEquals(0, convertedToJson.length());
    }

    @Test
    public void returns_not_empty_json_when_suggest_list_is_not_empty() {
        String city = "Berlin";
        List<SuggestDto> suggestList = RestUtil.getSuggestedInformation(city);
        JSONArray convertedToJson = convertToJson(suggestList);
        assertTrue(convertedToJson.length() > 0);
    }
}
