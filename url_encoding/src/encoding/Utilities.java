package encoding;

import java.util.Random;
import org.json.simple.JSONObject;

public class Utilities {

	 static JSONObject json_generator(String url, int timeout, int skip_path, int except_file) {
		 JSONObject json = new JSONObject();
		 Random random = new Random();
	    	
	    	json.put("seq", random.nextInt(100) );
	    	json.put("path", url);
	    	json.put("exp", timeout);
	    	
	    	return json;
		  }
	
}
