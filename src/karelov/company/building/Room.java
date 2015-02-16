package karelov.company.building;

import karelov.company.communication.Circuit;
import karelov.company.materials.Decor;

abstract public class Room {
	private int mSquare;
	private Decor mWallCoverings;
	private Decor mFlooring;
	private Decor mCeiling;
	private Circuit mCircuit;

	public Room(int mSquare, int mHeight, Decor mWallCoverings, Decor mFlooring, Decor mCeiling, Circuit mCircuit) {
		this.mSquare = mSquare;
		this.mWallCoverings = mWallCoverings;
		this.mFlooring = mFlooring;
		this.mCeiling = mCeiling;
		this.mCircuit = mCircuit;
	}

	public int getmSquare() {
		return mSquare;
	}

	public void setmSquare(int mSquare) {
		this.mSquare = mSquare;
	}


	public Decor getmWallCoverings() {
		return mWallCoverings;
	}

	public void setmWallCoverings(Decor mWallCoverings) {
		this.mWallCoverings = mWallCoverings;
	}

	public Decor getmCeiling() {
		return mCeiling;
	}

	public void setmCeiling(Decor mCeiling) {
		this.mCeiling = mCeiling;
	}

	public Decor getmFlooring() {
		return mFlooring;
	}

	public void setmFlooring(Decor mFlooring) {
		this.mFlooring = mFlooring;
	}

	public Circuit getmCircuit() {
		return mCircuit;
	}

	public void setmCircuit(Circuit mCircuit) {
		this.mCircuit = mCircuit;
	}

}
