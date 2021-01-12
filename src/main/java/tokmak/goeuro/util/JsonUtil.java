package tokmak.goeuro.util;

import org.json.JSONArray;
import org.json.JSONObject;
import tokmak.goeuro.dto.SuggestDto;

import java.util.List;
import java.util.stream.Collector;

public class JsonUtil {
    public static JSONArray convertToJson(List<SuggestDto> suggestionList) {
        return suggestionList.stream().map(suggestion -> {
            JSONObject csvItem = new JSONObject();
            csvItem.put("_id", suggestion.getId());
            csvItem.put("name", suggestion.getName());
            csvItem.put("type", suggestion.getType());
            csvItem.put("latitude", suggestion.getGeoPosition().getLatitude());
            csvItem.put("longitude", suggestion.getGeoPosition().getLongitude());
            return csvItem;
        }).collect(Collector.of(JSONArray::new, JSONArray::put, JSONArray::put));
    }
}
