package champollion;

public class ServicePrevu {
	private int volumeTD;
	private int volumeTP;
	private int volumeCM;
	
	public ServicePrevu(int volumeTD, int volumeTP, int volumeCM) {
		this.volumeTD = volumeTD;
		this.volumeTP = volumeTP;
		this.volumeCM = volumeCM;
	}
	
	public int getVolumeTD() {
		return volumeTD;
	}

	public int getVolumeTP() {
		return volumeTP;
	}

	public int getVolumeCM() {
		return volumeCM;
	}

	public void setVolumeTD(int volumeTD) {
		this.volumeTD = volumeTD;
	}

	public void setVolumeTP(int volumeTP) {
		this.volumeTP = volumeTP;
	}

	public void setVolumeCM(int volumeCM) {
		this.volumeCM = volumeCM;
	}
}
