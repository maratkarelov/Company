package karelov.company.building;

import karelov.company.communication.Plumbing;

public class Floor {
	private int mHeight;
	private WorkRoom[] mWorkRooms;
	private Toilet[] mToilets;
	private Shower[] mShowers;

	public Floor(int height, int countWorkRooms, int countToilets, int countShowers) {
		this.mHeight = height;
		mWorkRooms = new WorkRoom[countWorkRooms];
		for (int i = 0; i < countWorkRooms; i++) {
			WorkRoom workRoom = new WorkRoom(2);
			mWorkRooms[i] = workRoom;
		}
		mToilets = new Toilet[countToilets];
		for (int i = 0; i < countToilets; i++) {
			Toilet toilet = new Toilet(Plumbing.COLD_HEAT);
			mToilets[i] = toilet;
		}
		mShowers = new Shower[countShowers];
		for (int i = 0; i < countShowers; i++) {
			Shower shower = new Shower(Plumbing.COLD_HEAT);
			mShowers[i] = shower;
		}
	}

	// setters, getters

	public int getmHeight() {
		return mHeight;
	}

	public void setmWorkRooms(WorkRoom[] mWorkRooms) {
		this.mWorkRooms = mWorkRooms;
	}

	public WorkRoom[] getmWorkRooms() {
		return mWorkRooms;
	}

}
