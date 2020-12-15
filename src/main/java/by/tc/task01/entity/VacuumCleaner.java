package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{
	private int power_consumption;
	private char filter_type;
	private String bag_type;
	private String wand_type;
	private int motor_speed_regulation;
	private int cleaning_width;
	
	public VacuumCleaner(int power_consumption,char filter_type,String bag_type,String wand_type,int motor_speed_regulation,int cleaning_width) {
		this.power_consumption=power_consumption;
		this.filter_type=filter_type;
		this.bag_type=bag_type;
		this.wand_type=wand_type;
		this.motor_speed_regulation=motor_speed_regulation;
		this.cleaning_width=cleaning_width;
	}
	
	public VacuumCleaner() {};
	
	public int getPower_consumption() {
		return power_consumption;
	}

	public char getFilter_type() {
		return filter_type;
	}

	public String getBag_type() {
		return bag_type;
	}

	public String getWand_type() {
		return wand_type;
	}

	public int getMotor_speed_regulation() {
		return motor_speed_regulation;
	}

	public int getCleaning_width() {
		return cleaning_width;
	}
	
	
	public void setPower_consumption(int power_consumption) {
		this.power_consumption = power_consumption;
	}

	public void setFilter_type(char filter_type) {
		this.filter_type = filter_type;
	}

	public void setBag_type(String bag_type) {
		this.bag_type = bag_type;
	}

	public void setWand_type(String wand_type) {
		this.wand_type = wand_type;
	}

	public void setMotor_speed_regulation(int motor_speed_regulation) {
		this.motor_speed_regulation = motor_speed_regulation;
	}

	public void setCleaning_width(int cleaning_width) {
		this.cleaning_width = cleaning_width;
	}

	public String toString() {
		return "Name is Refrigerator" +"\n Power Consumption is "+power_consumption+"\n Filter Type is "+filter_type 
				+"\n Bag Type is "+bag_type + "\n Wand Type is "+wand_type+
				"\n Motor Speed Regulation is "+motor_speed_regulation+"\n Cleaning Width is "+cleaning_width;
	}
}
