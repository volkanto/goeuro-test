package tokmak.goeuro.util;

import java.util.List;

import org.junit.Test;

import tokmak.goeuro.dto.SuggestDto;

/**
 * <b>Project GoEuroTest</b><br />
 * CsvUtilShould.java<br />
 *
 * @author Volkan Tokmak
 * @since 0.0.1
 */
public class CsvUtilShould 
{
	@Test(expected=NullPointerException.class) public void
	throws_exception_when_suggestlist_is_empty()
	{
		List<SuggestDto> list = null;
		CsvUtil.export("Berlin", list);
	}
	
	@Test public void
	creates_csv_file_suggestlist_is_empty()
	{
		String cityName = "unknown city";
		List<SuggestDto> list = RestUtil.getSuggestedInformation(cityName);
		CsvUtil.export(cityName, list);
	}
	
	@Test public void 
	creates_csv_file_suggestlist_is_not_empty()
	{
		String cityName = "Berlin";
		List<SuggestDto> list = RestUtil.getSuggestedInformation(cityName);
		CsvUtil.export(cityName, list);
	}
}
