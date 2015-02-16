package karelov.company.program;

import karelov.company.building.Building;
import karelov.company.building.Company;
import karelov.company.building.Floor;
import karelov.company.building.WorkRoom;

public class Life {
	public static String STATUS_ON = "ON";
	public static String STATUS_OFF = "OFF";

	public static void main(String[] args) {
		Company company = new Company("Marat");
		Building building = company.createBuilding();
		building.setmCircuitStatus(STATUS_ON);
		building.setmPlumbingStatus(STATUS_ON);
		Floor[] floors = building.getmFloors();
		for (int fl = 0; fl < floors.length; fl++) {
			WorkRoom[] workRooms = floors[fl].getmWorkRooms();
			for (int wr = 0; wr < workRooms.length; wr++) {
				WorkRoom workRoom = workRooms[wr];
				workRoom.setTheTable(5);
			}
		}
	}
}
