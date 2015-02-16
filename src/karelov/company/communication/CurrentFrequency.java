package karelov.company.communication;

public enum CurrentFrequency {Hz_50(50),Hz_60(60);
private int value;

CurrentFrequency(int value) {
	this.value = value;
}

public int getValue() {
	return value;
}
}
