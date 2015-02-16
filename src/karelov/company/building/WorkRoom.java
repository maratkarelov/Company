package karelov.company.building;

import java.awt.Color;

import karelov.company.communication.Circuit;
import karelov.company.communication.CurrentFrequency;
import karelov.company.communication.Network;
import karelov.company.communication.Voltage;
import karelov.company.communication.Network.Provider;
import karelov.company.furniture.Table;
import karelov.company.materials.Decor;
import karelov.company.materials.Material;
import karelov.company.trim.MakerOfWindows;
import karelov.company.trim.Window;

public class WorkRoom extends Room {
	private Network mNetwork;
	private Window[] mWindows;
	private Table[] mTables;
	public static Decor DECOR_CEILING = new Decor(new Color(100, 100, 100), Material.Plaster);
	public static Decor DECOR_FLOORING = new Decor(new Color(100, 100, 100), Material.Laminate);
	public static Decor DECOR_WALLCOVERINGS = new Decor(new Color(100, 100, 100), Material.Wood);
	public static Circuit CIRCUIT = new Circuit(50, Voltage.V_220, CurrentFrequency.Hz_50);;

	public WorkRoom(int countWindows) {
		super(50, 3, DECOR_WALLCOVERINGS, DECOR_FLOORING, DECOR_FLOORING, CIRCUIT);
		mNetwork = new Network(Provider.DataGroup, 100);
		for (int i = 0; i < countWindows; i++) {
			mWindows[i] = new Window(MakerOfWindows.VEKA);
		}
	}

	public void setTheTable(int countTables) {
		for (int i = 0; i < countTables; i++) {
			mTables[i] = new Table(1400, 60, 70);
		}
	}

	public Network getmNetwork() {
		return mNetwork;
	}

	public void setmNetwork(Network mNetwork) {
		this.mNetwork = mNetwork;
	}

}
