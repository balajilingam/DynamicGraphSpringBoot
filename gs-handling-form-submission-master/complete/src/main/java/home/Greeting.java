package home;

public class Greeting {

    private long id;
    private int voltage;
    private String location;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", voltage=" + voltage + ", location=" + location + "]";
	}


}
