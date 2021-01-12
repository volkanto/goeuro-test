package tokmak.goeuro.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.web.client.RestTemplate;
import tokmak.goeuro.dto.SuggestDto;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static tokmak.goeuro.util.CSVUtil.export;
import static tokmak.goeuro.util.RestUtil.getSuggestedInformation;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CSVUtilShould {

//    @TempDir
//    Path directory;
//
//    private RestUtil restUtilMock;
//    private RestTemplate restTemplateMock;
//
//    @BeforeAll
//    public void beforeAll() {
//        restUtilMock = mock(RestUtil.class);
//        restTemplateMock = mock(RestTemplate.class);
//    }
//
//    @AfterAll
//    public void afterAll() {
//        reset(restUtilMock, restTemplateMock);
//    }

    @Test
    public void throws_exception_when_suggest_list_is_empty() {
        List<SuggestDto> list = null;
        assertThrows(NullPointerException.class, () -> export("Berlin", list));
    }

    @Test
    public void creates_csv_file_suggest_list_is_empty() {

        RestTemplate restTemplate = mock(RestTemplate.class);
        when(restTemplate.getForObject(anyString(), any(Class.class))).thenReturn(emptyList());

        String cityName = "unknown city";

        List<SuggestDto> suggestionList = getSuggestedInformation(cityName);
        export(cityName, suggestionList);
        assertTrue(new File("unknown_city.csv").exists());
    }

    @Test
    public void creates_csv_file_suggest_list_is_not_empty() {

        String cityName = "Berlin";
        List<SuggestDto> list = getSuggestedInformation(cityName);
        export(cityName, list);
        assertTrue(new File("berlin.csv").exists());
    }
}
