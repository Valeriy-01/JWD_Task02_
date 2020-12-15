package by.tc.task01.entity;

public class Laptop extends Appliance{
	private double battery_capacity;
	private String os;
	private int memory_rom;
	private int system_memory;
	private double cpu;
	private int display_inchs;
	
	public Laptop(double battery_capacity,String os,int memory_rom,int system_memory,double cpu,int display_inchs) {
		this.battery_capacity=battery_capacity;
		this.os=os;
		this.memory_rom=memory_rom;
		this.system_memory=system_memory;
		this.cpu=cpu;
		this.display_inchs=display_inchs;
	}
	
	public Laptop() {}
	
	public double getBattery_capacity() {
		return battery_capacity;
	}

	public String getOs() {
		return os;
	}

	public void setBattery_capacity(double battery_capacity) {
		this.battery_capacity = battery_capacity;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public void setMemory_rom(int memory_rom) {
		this.memory_rom = memory_rom;
	}

	public void setSystem_memory(int system_memory) {
		this.system_memory = system_memory;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public void setDisplay_inchs(int display_inchs) {
		this.display_inchs = display_inchs;
	}

	public int getMemory_rom() {
		return memory_rom;
	}

	public int getSystem_memory() {
		return system_memory;
	}

	public double getCpu() {
		return cpu;
	}

	public int getDisplay_inchs() {
		return display_inchs;
	}

	
	public String toString() {
		return "Name is Laptop" +"\n Battery Capacity is "+battery_capacity+"\n OS is "+os 
				+"\n Memory Rom is "+memory_rom + "\n System Memory is "+system_memory+
				"\n CPU is "+cpu+"\n Display Inchs is "+display_inchs;
	}
}
