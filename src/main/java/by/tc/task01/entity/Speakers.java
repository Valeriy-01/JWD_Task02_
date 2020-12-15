package by.tc.task01.entity;

public class Speakers extends Appliance{
	private int power_consumption;
	private int number_of_speakers;
	private String frequency_range;
	private int cord_length;
	
	public Speakers(int power_consumption,int number_of_speakers,String frequency_range,int cord_length) {
		this.power_consumption=power_consumption;
		this.number_of_speakers=number_of_speakers;
		this.frequency_range=frequency_range;
		this.cord_length=cord_length;
	}
	
	public Speakers() {};
	
	public int getPower_consumption() {
		return power_consumption;
	}

	public int getNumber_of_speakers() {
		return number_of_speakers;
	}

	public String getFrequency_range() {
		return frequency_range;
	}

	public int getCord_length() {
		return cord_length;
	}
	
	
	public void setPower_consumption(int power_consumption) {
		this.power_consumption = power_consumption;
	}

	public void setNumber_of_speakers(int number_of_speakers) {
		this.number_of_speakers = number_of_speakers;
	}

	public void setFrequency_range(String frequency_range) {
		this.frequency_range = frequency_range;
	}

	public void setCord_length(int cord_length) {
		this.cord_length = cord_length;
	}

	public String toString() {
		return "Name is Refrigerator" +"\n Power Consumption is "+power_consumption+"\n Number Of Speakers is "+number_of_speakers 
				+"\n Frequency Range is "+frequency_range + "\n Cord Length is "+cord_length;
	}

}
