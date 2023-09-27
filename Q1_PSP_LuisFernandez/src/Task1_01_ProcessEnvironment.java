import java.util.Map;
import java.util.Map.Entry;


/* 
 * LUIS FERNANDEZ MARTINEZ
 * github.com/lufermy
 * 28 Septiembre 2023
 * 
 * */

public class Task1_01_ProcessEnvironment {
	public static void main(String[] args) {
        ProcessBuilder test1 = new ProcessBuilder();
        Map<String, String> test1_result = test1.environment();
        for (Entry<String, String> entry : test1_result.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
	}
}
