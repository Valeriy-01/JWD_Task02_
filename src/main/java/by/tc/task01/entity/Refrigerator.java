package by.tc.task01.entity;

public class Refrigerator extends Appliance{
	private int power_consumption;
	private double freezer_capacity;
	private int overall_capacity;
	private int weight;
	private int height;
	private int width;
	
	public Refrigerator(int power_consumption,double freezer_capacity,int overall_capacity,int weight,int height,int width) {
		this.power_consumption=power_consumption;
		this.freezer_capacity=freezer_capacity;
		this.overall_capacity=overall_capacity;
		this.weight=weight;
		this.height=height;
		this.width=width;
	}
	
	public Refrigerator() {};
	
	public int getPower_consumption() {
		return power_consumption;
	}

	public double getFreezer_capacity() {
		return freezer_capacity;
	}

	public int getOverall_capacity() {
		return overall_capacity;
	}

	public int getWeight() {
		return weight;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
	
	
	public void setPower_consumption(int power_consumption) {
		this.power_consumption = power_consumption;
	}

	public void setFreezer_capacity(double freezer_capacity) {
		this.freezer_capacity = freezer_capacity;
	}

	public void setOverall_capacity(int overall_capacity) {
		this.overall_capacity = overall_capacity;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String toString() {
		return "Name is Refrigerator" +"\n Power Consumption is "+power_consumption+"\n Weight is "+weight 
				+"\n Freezer Capacity is "+freezer_capacity + "\n Overall Capacity is "+overall_capacity+
				"\n Height is "+height+"\n Width is "+width;
	}

}
