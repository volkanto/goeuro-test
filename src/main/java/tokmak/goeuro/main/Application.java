package tokmak.goeuro.main;

import java.io.IOException;
import java.util.List;

import tokmak.goeuro.dto.SuggestDto;
import tokmak.goeuro.util.CsvUtil;
import tokmak.goeuro.util.RestUtil;

/**
 * <b>Project goeuro-dev-test</b><br />
 * Application.java<br />
 *
 * @author Volkan Tokmak
 * @since 0.0.1
 */
public class Application 
{
	/**
	 * Application<br />
	 *
	 * @param args
	 * 
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 * 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException  
	{
		exportSuggestions(args);
	}
	
	/**
	 * Application<br />
	 *
	 * @param argParameters
	 * @throws IOException
	 * 
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 */
	private static void exportSuggestions(String[] argParameters) throws IOException
	{
		String cityName = validateInput(argParameters);
		CsvUtil.export(cityName, validateSuggestion(RestUtil.getSuggestedInformation(cityName)));
	}
	
	/**
	 * Application<br />
	 *
	 * @param args
	 * @return
	 * 
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 */
	private static String validateInput(String[] args)
	{
		if(args == null || args.length == 0) {
			throw new IllegalArgumentException("there is no parameter");
		}
		if(args.length > 1) {
			throw new IllegalArgumentException("arguments must equal 1");
		}
		return args[0];
	}
	
	/**
	 * Application<br />
	 *
	 * @param argSuggestList
	 * @return
	 * 
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 */
	private static List<SuggestDto> validateSuggestion(List<SuggestDto> argSuggestList)
	{
		if(argSuggestList == null || argSuggestList.size() == 0) {
			throw new IllegalArgumentException("no result");
		}
		return argSuggestList;
	}
}
