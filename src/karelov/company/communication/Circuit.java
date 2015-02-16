package karelov.company.communication;

public class Circuit {
	public int mCurrent;
	public Voltage mVoltage;
	public CurrentFrequency mFrequency;

	public Circuit(int amper, Voltage volt, CurrentFrequency hz) {
		mCurrent = amper;
		mVoltage = volt;
		mFrequency = hz;
	}

}
