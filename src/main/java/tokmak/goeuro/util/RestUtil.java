package tokmak.goeuro.util;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import tokmak.goeuro.dto.SuggestDto;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class RestUtil {

    private static final String SUGGEST_ENDPOINT = "http://api.goeuro.com/api/v2/position/suggest/en/{0}";

    public static List<SuggestDto> getSuggestedInformation(String city) {
        SuggestDto[] suggestedCities = createRestTemplateForJson()
                .getForObject(MessageFormat.format(SUGGEST_ENDPOINT, city), SuggestDto[].class);
        return asList(suggestedCities);
    }

    private static RestTemplate createRestTemplateForJson() {

        RestTemplate restTemplate = new RestTemplate();
        //Create a list for the message converters
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        //Add the Jackson Message converter
        messageConverters.add(new MappingJackson2HttpMessageConverter());
        //Add the message converters to the restTemplate
        restTemplate.setMessageConverters(messageConverters);

        return restTemplate;
    }
}
