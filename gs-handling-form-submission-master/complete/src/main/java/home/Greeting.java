package home;

public class Greeting {

    private float voltage;
    private float current;
    private float resistance; 
    private Object dataPoints;

	public Object getDataPoints() {
		return dataPoints;
	}

	public void setDataPoints(Object dataPoints) {
		this.dataPoints = dataPoints;
	}

	public float getVoltage() {
		return voltage;
	}

	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}

	public float getCurrent() {
		return current;
	}

	public void setCurrent(float current) {
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
