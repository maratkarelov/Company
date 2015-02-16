package karelov.company.communication;

public class Network {
	private Provider mProvider;
	private int mSpeed;

	public Network(Provider provider, int speed) {
		this.mProvider = provider;
		this.mSpeed = speed;
	}

	public Provider getProvider() {
		return mProvider;
	}

	public int getSpeed() {
		return mSpeed;
	}

	public enum Provider {
		Volya, DataGroup, Triolan, Kyevstar, MTS
	}

}
