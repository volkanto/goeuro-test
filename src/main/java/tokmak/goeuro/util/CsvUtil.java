package tokmak.goeuro.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.json.CDL;
import org.json.JSONException;

import tokmak.goeuro.dto.SuggestDto;

/**
 * <b>Project GoEuroTest</b><br />
 * CsvUtil.java<br />
 *
 * @author Volkan Tokmak
 * @since 0.0.1
 */
public class CsvUtil 
{
	private static final String CSV_FILE_SUFFIX = ".csv";
	/**
	 * CsvUtil<br />
	 *
	 * @param argCityName
	 * @param argSuggestedList
	 * 
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 */
	public static void export(String argCityName, List<SuggestDto> argSuggestedList) 
	{
		try {
			FileUtils.writeStringToFile(new File(argCityName + CSV_FILE_SUFFIX), 
										CDL.toString(JsonUtil.convertToJson(argSuggestedList)));
		} 
		catch (JSONException | IOException e) {
			e.printStackTrace();
		}
	}
}
