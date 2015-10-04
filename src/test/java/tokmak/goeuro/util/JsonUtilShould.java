package tokmak.goeuro.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.junit.Test;

import tokmak.goeuro.dto.SuggestDto;

/**
 * <b>Project GoEuroTest</b><br />
 * JsonUtilShould.java<br />
 *
 * @author Volkan Tokmak
 * @since 0.0.1
 */
public class JsonUtilShould 
{
	@Test(expected=NullPointerException.class) public void
	throws_exception_when_suggestlist_is_empty()
	{
		JsonUtil.convertToJson(null);
	}
	
	@Test public void
	returns_empty_json_when_suggestlist_is_empty()
	{
		List<SuggestDto> suggestList = new ArrayList<>();
		JSONArray convertedToJson = JsonUtil.convertToJson(suggestList);
		assertEquals(0, convertedToJson.length());
	}
	
	@Test public void
	returns_not_empty_json_when_suggestlist_is_not_empty()
	{
		String city = "Berlin";
		List<SuggestDto> suggestList = RestUtil.getSuggestedInformation(city);
		JSONArray convertedToJson = JsonUtil.convertToJson(suggestList);
		assertTrue(convertedToJson.length() > 0);
	}
}
