package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import by.tc.task01.dao.*;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.factory.ApplianceStore;
import by.tc.task01.factory.Store;
import by.tc.task01.dao.impl.ApplianceDAOImpl;

public class ApplianceDAOImpl implements ApplianceDAO {

	public Appliance find(Criteria criteria) throws IOException {
		String objectSpecification = readFile(criteria);
		Appliance appliance = findAppliance(objectSpecification, criteria);
		return appliance;
	}

	private Appliance findAppliance(String objectSpecification, Criteria criteria) {
		if (objectSpecification == null) {
			return null;
		} else {
			HashMap<String, Object> resultMap = createResMap(objectSpecification, criteria);
			Store store = new ApplianceStore();
			return store.orderElectronics(criteria.getGroupSearchName(), resultMap);
		}
	}

	private String readFile(Criteria criteria) throws IOException {
		boolean isFind;
		FileReader fileReader = new FileReader("appliances_db.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String objectSpecification = "";
		String mainPatternSpecification;
		String patternSpecification = "";
		while ((objectSpecification = bufferedReader.readLine()) != null) {
			isFind = true;
			if (objectSpecification.contains(criteria.getGroupSearchName())) {
				for (String requare : criteria.keySet()) {
					mainPatternSpecification = requare + "=" + criteria.getValue(requare) + ",";
					patternSpecification = "" + criteria.getValue(requare);
					if (!objectSpecification.contains(mainPatternSpecification)
							& !patternSpecification.equals(objectSpecification.substring(objectSpecification.length() - patternSpecification.length()).trim())) {
						isFind = false;
						break;
					}
				}

			} else {
				isFind = false;
			}
			if (isFind) {
				bufferedReader.close();
				return objectSpecification;
			}
		}
		bufferedReader.close();
		return null;
	}

	private HashMap<String, Object> createResMap(String objectSpecification, Criteria criteria) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		objectSpecification = "," + objectSpecification;
		String arr[] = objectSpecification.split(",[^=]*=");
		switch (criteria.getGroupSearchName()) {
		case "Laptop":
			map.put(SearchCriteria.Laptop.BATTERY_CAPACITY.toString(), Double.parseDouble(arr[1]));
			map.put(SearchCriteria.Laptop.OS.toString(), arr[2]);
			map.put(SearchCriteria.Laptop.MEMORY_ROM.toString(), Integer.parseInt(arr[3]));
			map.put(SearchCriteria.Laptop.SYSTEM_MEMORY.toString(), Integer.parseInt(arr[4]));
			map.put(SearchCriteria.Laptop.CPU.toString(), Double.parseDouble(arr[5]));
			map.put(SearchCriteria.Laptop.DISPLAY_INCHS.toString(), Integer.parseInt(arr[6]));
			return map;
		case "Oven":
			map.put(SearchCriteria.Oven.POWER_CONSUMPTION.toString(), Integer.parseInt(arr[1]));
			map.put(SearchCriteria.Oven.WEIGHT.toString(), Integer.parseInt(arr[2]));
			map.put(SearchCriteria.Oven.CAPACITY.toString(), Integer.parseInt(arr[3]));
			map.put(SearchCriteria.Oven.DEPTH.toString(), Integer.parseInt(arr[4]));
			map.put(SearchCriteria.Oven.HEIGHT.toString(), Double.parseDouble(arr[5]));
			map.put(SearchCriteria.Oven.WIDTH.toString(), Double.parseDouble(arr[6]));
			return map;
		case "Refrigerator":
			map.put(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString(), Integer.parseInt(arr[1]));
			map.put(SearchCriteria.Refrigerator.WEIGHT.toString(), Integer.parseInt(arr[2]));
			map.put(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString(), Double.parseDouble(arr[3]));
			map.put(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString(), Integer.parseInt(arr[4]));
			map.put(SearchCriteria.Refrigerator.HEIGHT.toString(), Integer.parseInt(arr[5]));
			map.put(SearchCriteria.Refrigerator.WIDTH.toString(), Integer.parseInt(arr[6]));
			return map;
		case "Speakers":
			map.put(SearchCriteria.Speakers.POWER_CONSUMPTION.toString(), Integer.parseInt(arr[1]));
			map.put(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString(), Integer.parseInt(arr[2]));
			map.put(SearchCriteria.Speakers.FREQUENCY_RANGE.toString(), arr[3]);
			map.put(SearchCriteria.Speakers.CORD_LENGTH.toString(), Integer.parseInt(arr[4]));
			return map;
		case "TabletPC":
			map.put(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString(), Integer.parseInt(arr[1]));
			map.put(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), Integer.parseInt(arr[2]));
			map.put(SearchCriteria.TabletPC.MEMORY_ROM.toString(), Integer.parseInt(arr[3]));
			map.put(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString(), Integer.parseInt(arr[4]));
			map.put(SearchCriteria.TabletPC.COLOR.toString(), arr[5]);
			return map;
		case "VacuumCleaner":
			map.put(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString(), Integer.parseInt(arr[1]));
			map.put(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(), arr[2]);
			map.put(SearchCriteria.VacuumCleaner.BAG_TYPE.toString(), arr[3]);
			map.put(SearchCriteria.VacuumCleaner.WAND_TYPE.toString(), arr[4]);
			map.put(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), Integer.parseInt(arr[5]));
			map.put(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString(), Integer.parseInt(arr[6]));
			return map;
		default:
			return null;
		}
		// you may add your own code here
	}
}

//you may add your own new classes