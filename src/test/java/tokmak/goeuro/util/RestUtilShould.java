package tokmak.goeuro.util;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import tokmak.goeuro.dto.SuggestDto;

/**
 * <b>Project GoEuroTest</b><br />
 * RestUtilShould.java<br />
 *
 * @author Volkan Tokmak
 * @since 0.0.1
 */
public class RestUtilShould 
{
	@Test public void
	returns_not_empty_suggestlist_when_city_is_Berlin()
	{
		String city = "Berlin";
		List<SuggestDto> suggestList = RestUtil.getSuggestedInformation(city);
		assertTrue(suggestList != null);
		assertTrue(suggestList.size() > 0);
	}
	
	@Test public void
	returns_empty_suggestlist_when_city_is_unknown()
	{
		String city = "unknown";
		List<SuggestDto> suggestList = RestUtil.getSuggestedInformation(city);
		assertTrue(suggestList.size() == 0);
	}
}
