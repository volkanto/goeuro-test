package tokmak.goeuro.util;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import tokmak.goeuro.dto.SuggestDto;

/**
 * <b>Project GoEuroTest</b><br />
 * JsonUtil.java<br />
 *
 * @author Volkan Tokmak
 * @since 0.0.1
 */
public class JsonUtil 
{
	/**
	 * JsonUtil<br />
	 *
	 * @param argList
	 * @return
	 * 
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 */
	public static JSONArray convertToJson(List<SuggestDto> argList)
	{
		JSONArray csvItemList = new JSONArray();
		
		for (SuggestDto suggestDto : argList) 
		{
			JSONObject csvItem = new JSONObject();
			csvItem.put("_id", suggestDto.get_id());
			csvItem.put("name", suggestDto.getName());
			csvItem.put("type", suggestDto.getType());
			csvItem.put("latitude", suggestDto.getGeo_position().getLatitude());
			csvItem.put("longitude", suggestDto.getGeo_position().getLongitude());
			
			csvItemList.put(csvItem);
		}
		
		return csvItemList;
	}
}
