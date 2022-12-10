package mappers;

import java.util.HashMap;
import java.util.Map;

public class Headers {

	public static Map<String,String> getquery(){
		
		Map<String,String> mp=new HashMap<String,String>();
		
		mp.put("page", "2");
		
		return mp;
	}
}
