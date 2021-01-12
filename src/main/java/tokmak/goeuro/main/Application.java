package tokmak.goeuro.main;

import tokmak.goeuro.dto.SuggestDto;
import tokmak.goeuro.util.CSVUtil;
import tokmak.goeuro.util.RestUtil;

import java.io.IOException;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        exportSuggestions(args);
    }

    private static void exportSuggestions(String[] parameters) {
        String cityName = validateInput(parameters);
        CSVUtil.export(cityName, validateSuggestion(RestUtil.getSuggestedInformation(cityName)));
    }

    private static String validateInput(String[] args) {
        if (args == null || args.length == 0) {
            throw new IllegalArgumentException("there is no parameter");
        }
        if (args.length > 1) {
            throw new IllegalArgumentException("arguments must equal 1");
        }
        return args[0];
    }

    private static List<SuggestDto> validateSuggestion(List<SuggestDto> suggestList) {
        if (suggestList == null || suggestList.size() == 0) {
            throw new IllegalArgumentException("no result");
        }
        return suggestList;
    }
}
