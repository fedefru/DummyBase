package Hello;
import java.util.Map;



public class DummyBase {

	private static Map<String,String> mapa;
	
	static {
    mapa.put("fede", "1234");
    mapa.put("mario", "4321");
    mapa.put("chile", "1234");
    mapa.put("javi", "9876");
	}

	public static Map<String, String> getMap() {
		return mapa;
	}
	
	

}
