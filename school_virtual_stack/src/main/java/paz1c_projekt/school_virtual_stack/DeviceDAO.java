package paz1c_projekt.school_virtual_stack;

import java.util.List;
import java.util.ArrayList;

public class DeviceDAO {
	
	private List<Device> devices = new ArrayList<Device>();
	private long lastId = 0;
	
	public DeviceDAO() {
		//TODO potom zmazat
		
		Device p = new Device();
		p.setNazov("Pocitac");
		p.setZodpovednaOsoba("Adam Zodpovedny");
		p.setUcebna("Nonstopka");
		this.add(p);
	}
	
 	public void add(Device device) {
 		device.setId(++lastId);
 		devices.add(device);
	}
	
	public List<Device> getAll() {
		return devices;
	}

}
