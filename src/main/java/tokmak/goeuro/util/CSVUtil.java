package tokmak.goeuro.util;

import org.apache.commons.io.FileUtils;
import org.json.CDL;
import org.json.JSONException;
import org.springframework.util.StringUtils;
import tokmak.goeuro.dto.SuggestDto;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class CSVUtil {

    private static final String CSV_FILE_SUFFIX = ".csv";

    public static void export(String city, List<SuggestDto> suggestList) {
        try {
            String[] split = StringUtils.trimWhitespace(city).split(" ");
            String preparedCityName = Arrays.stream(split).map(_city -> _city.toLowerCase(Locale.ROOT)).collect(Collectors.joining("_"));
            String fileName = preparedCityName + CSV_FILE_SUFFIX;

            FileUtils.writeStringToFile(new File(fileName),
                    CDL.toString(JsonUtil.convertToJson(suggestList)), Charset.defaultCharset());
        } catch (JSONException | IOException e) {
            e.printStackTrace();
        }
    }
}
