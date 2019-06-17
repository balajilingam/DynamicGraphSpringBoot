package home;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.google.gson.Gson;

@Controller
public class GreetingController {
	
	List<Map<Object, Object>> list = null;
	GreetingController() {
		
		if (list == null) {
			list = new ArrayList<Map<Object, Object>>();
		}
	}

	@GetMapping("/greeting")
	public String greetingForm(Model model) {
		model.addAttribute("greeting", new Greeting());
		return "greeting";
	}

	private void fileProcessing(Greeting greeting) {
		try {
			File resource = new File("D:/v1/data.dat");
			if (!resource.exists()) {
				resource.createNewFile();
			}
			FileWriter fw = new FileWriter(resource, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(greeting.toString());
			bw.newLine();
			bw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@PostMapping("/greeting")
	public String greetingSubmit(@ModelAttribute Greeting greeting) {
		float r ;
		float v = (float)greeting.getVoltage();
		float c = (float)greeting.getCurrent();
		r=v/c;		
		greeting.setResistance(r);
		fileProcessing(greeting);
		chartProcessing(greeting);
		return "result";
	}

	private void chartProcessing(Greeting greeting) {
		Gson gsonObj = new Gson();
		Map<Object, Object> map = null;
		
		 
		/*map = new HashMap<Object,Object>(); map.put("label", "Berlin"); map.put("y", 188); list.add(map);
		map = new HashMap<Object,Object>(); map.put("label", "Hamburg"); map.put("y", 213); list.add(map);
		map = new HashMap<Object,Object>(); map.put("label", "Bavaria"); map.put("y", 213); list.add(map);
		map = new HashMap<Object,Object>(); map.put("label", "North Rhine-Westphalia"); map.put("y", 219); list.add(map);
		map = new HashMap<Object,Object>(); map.put("label", "Saxony"); map.put("y", 207); list.add(map);
		map = new HashMap<Object,Object>(); map.put("label", "Bavaria"); map.put("y", 167); list.add(map);
		map = new HashMap<Object,Object>(); map.put("label", "karlShue"); map.put("y", 136); list.add(map);*/
		map = new HashMap<Object,Object>(); map.put("label", greeting.getVoltage()); map.put("y", greeting.getCurrent()); this.list.add(map);
		 
		//String dataPoints = gsonObj.toJson(list);
		greeting.setDataPoints(gsonObj.toJson(this.list));
		System.out.println(greeting.getDataPoints());
	}

}
