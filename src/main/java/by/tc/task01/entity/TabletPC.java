package by.tc.task01.entity;

public class TabletPC extends Appliance{
	private int battery_capacity;
	private int display_inches;
	private int memory_rom;
	private int flash_memory_capacity;
	private String color;
	
	public TabletPC(int battery_capacity,int display_inches,int memory_rom,int flash_memory_capacity,String color) {
		this.battery_capacity=battery_capacity;
		this.display_inches=display_inches;
		this.memory_rom=memory_rom;
		this.flash_memory_capacity=flash_memory_capacity;
		this.color=color;
	}
	
	public TabletPC() {};
	
	public int getBattery_capacity() {
		return battery_capacity;
	}

	public int getDisplay_inches() {
		return display_inches;
	}

	public int getMemory_rom() {
		return memory_rom;
	}

	public int getFlash_memory_capacity() {
		return flash_memory_capacity;
	}

	public String getColor() {
		return color;
	}
	
	public void setBattery_capacity(int battery_capacity) {
		this.battery_capacity = battery_capacity;
	}

	public void setDisplay_inches(int display_inches) {
		this.display_inches = display_inches;
	}

	public void setMemory_rom(int memory_rom) {
		this.memory_rom = memory_rom;
	}

	public void setFlash_memory_capacity(int flash_memory_capacity) {
		this.flash_memory_capacity = flash_memory_capacity;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Name is TablePC" +"\n Battery Capacity is "+battery_capacity+"\n Display Inches is "+display_inches 
				+"\n Memory Rom is "+memory_rom + "\n Flash Memory Capacity is "+flash_memory_capacity+
				"\n Color is "+color;
	}
}
