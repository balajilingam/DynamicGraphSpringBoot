package home;

public class Greeting {

    private int voltage;
    private int current;
    private float resistance; 
    private Object dataPoints;

	public Object getDataPoints() {
		return dataPoints;
	}

	public void setDataPoints(Object dataPoints) {
		this.dataPoints = dataPoints;
	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public float getResistance() {
		return resistance;
	}

	public void setResistance(float resistance) {
		this.resistance = resistance;
	}

	@Override
	public String toString() {
		return "Greeting [voltage=" + voltage + ", current=" + current + ", resistance=" + resistance + "]";
	}

	



}
