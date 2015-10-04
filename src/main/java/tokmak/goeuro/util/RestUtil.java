package tokmak.goeuro.util;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import tokmak.goeuro.dto.SuggestDto;

/**
 * <b>Project GoEuroTest</b><br />
 * RestUtil.java<br />
 *
 * @author Volkan Tokmak
 * @since 0.0.1
 */
public class RestUtil {

	private static final String SUGGEST_ENDPOINT = "http://api.goeuro.com/api/v2/position/suggest/en/{0}";
	
	/**
	 * RestUtil<br />
	 *
	 * @param argCityName
	 * @return
	 * 
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 */
	public static List<SuggestDto> getSuggestedInformation(String argCityName)
	{
		return Arrays.asList(createRestTemplateForJson().getForObject(MessageFormat.format(SUGGEST_ENDPOINT, argCityName), SuggestDto[].class));
	}
	
	/**
	 * RestUtil<br />
	 *
	 * @return
	 * 
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 */
	private static RestTemplate createRestTemplateForJson()
	{
		RestTemplate restTemplate = new RestTemplate();
		
		//Create a list for the message converters
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		//Add the Jackson Message converter
		messageConverters.add(new MappingJackson2HttpMessageConverter());
		//Add the message converters to the restTemplate
		restTemplate.setMessageConverters(messageConverters);
		
		return restTemplate;
	}
	
}
