package karelov.company.building;

import karelov.company.program.Life;

public class Building {
	private Floor[]  mFloors;
	private String mCircuitStatus;
	private String mPlumbingStatus;
	
	

	public Building(Floor[] mFloors) {
		this.mFloors = mFloors;
		setmCircuitStatus(Life.STATUS_OFF);
	}

//	setters, getters
	public Floor[] getmFloors() {
		return mFloors;
	}

	public void setmFloors(Floor[] mFloors) {
		this.mFloors = mFloors;
	}

	public String getmCircuitStatus() {
		return mCircuitStatus;
	}

	public void setmCircuitStatus(String mCircuitStatus) {
		this.mCircuitStatus = mCircuitStatus;
	}

	public String getmPlumbingStatus() {
		return mPlumbingStatus;
	}

	public void setmPlumbingStatus(String mPlumbingStatus) {
		this.mPlumbingStatus = mPlumbingStatus;
	}
	
	
	
	

}
