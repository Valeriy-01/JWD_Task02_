package by.tc.task01.entity;

public class Oven extends Appliance{
	private int power_consumption;
	private int weight;
	private int capacity;
	private int depth;
	private double height;
	private double width;
	
	public Oven(int power_consumption,int weight,int capacity,int depth,double height,double width) {
		this.power_consumption=power_consumption;
		this.weight=weight;
		this.capacity=capacity;
		this.depth=depth;
		this.height=height;
		this.width=width;
	}
	
	public Oven() {};

	public int getPower_consumption() {
		return power_consumption;
	}

	public int getWeight() {
		return weight;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getDepth() {
		return depth;
	}

	public void setPower_consumption(int power_consumption) {
		this.power_consumption = power_consumption;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	
	public String toString() {
		return "Name is Oven" +"\n Power Consumption is "+power_consumption+"\n Weight is "+weight 
				+"\n Capacity is "+capacity + "\n Depth is "+depth+
				"\n Height is "+height+"\n Width is "+width;
	}
}
