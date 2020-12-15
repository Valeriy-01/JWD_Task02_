package by.tc.task01.factory;

import java.util.HashMap;

import by.tc.task01.entity.Appliance;

public abstract class Store{
	
	public Appliance orderElectronics(String type,HashMap<String, Object> requirements) {
		Appliance electronics;
		electronics=createElectronics(type,requirements);
		return electronics;
	}
	
	abstract Appliance createElectronics(String type,HashMap<String, Object> requirements);
	

}
