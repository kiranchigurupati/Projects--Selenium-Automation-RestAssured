package POJO;

public class Location {
	
	private double lat; // since these are negative values and have decimals
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	private double lng;

}
