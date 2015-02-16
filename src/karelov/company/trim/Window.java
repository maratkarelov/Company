package karelov.company.trim;

public class Window {
	private MakerOfWindows makerOfWindows;

	public Window(MakerOfWindows makerOfWindows) {
		this.makerOfWindows = makerOfWindows;
	}

	public MakerOfWindows getMakerOfWindows() {
		return makerOfWindows;
	}

	public void setMakerOfWindows(MakerOfWindows makerOfWindows) {
		this.makerOfWindows = makerOfWindows;
	}

}
