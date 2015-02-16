package karelov.company.building;

import java.awt.Color;

import karelov.company.communication.Circuit;
import karelov.company.communication.CurrentFrequency;
import karelov.company.communication.Plumbing;
import karelov.company.communication.Voltage;
import karelov.company.materials.Decor;
import karelov.company.materials.Material;

abstract public class WC extends Room {
	private Plumbing mPlumbing;
	public static Decor DECOR_CEILING = new Decor(Color.WHITE, Material.Plaster);
	public static Decor DECOR_FLOORING = new Decor(Color.BLACK, Material.Ceramics);
	public static Decor DECOR_WALLCOVERINGS = new Decor(Color.blue, Material.Ceramics);
	public static Circuit CIRCUIT = new Circuit(20, Voltage.V_220, CurrentFrequency.Hz_50);

	public WC(Plumbing plumbing) {
		super(10, 3, DECOR_WALLCOVERINGS, DECOR_FLOORING, DECOR_FLOORING, CIRCUIT);
		this.mPlumbing = plumbing;
	}

//	setters, getters
	public Plumbing getmPlumbing() {
		return mPlumbing;
	}

	public void setmPlumbing(Plumbing mPlumbing) {
		this.mPlumbing = mPlumbing;
	}

}
