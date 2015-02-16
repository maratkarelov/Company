package karelov.company.building;


public class Company {
	private String mName;
	private Building[] mBuildings;

	public Company(String name) {
		this.setmName(name);

	}

	public Building createBuilding() {
		Floor[] floors = new Floor[1];
		floors[0] = new Floor(3, 5, 2, 2);

		Building building = new Building(floors);
		return building;

	}

	// setters, getters
	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public Building[] getmBuildings() {
		return mBuildings;
	}

	public void setmBuildings(Building[] mBuildings) {
		this.mBuildings = mBuildings;
	}

}
