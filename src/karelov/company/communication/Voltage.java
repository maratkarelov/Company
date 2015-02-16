package karelov.company.communication;

public enum Voltage {
	V_220(220), V_380(380);
	private int value;

	Voltage(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
