package Car_Res;
public class Car {
private int car_id;
private int available;
private boolean ac;
private String duration;
Car(int car_id,int available,boolean ac,String duration){
this.car_id=car_id;
this.available=available;
this.ac=ac;
this.duration=duration;
}
	public int getCarid() {
		return car_id;
	}
	public int getavailable() {
		return available;
	}
	public boolean getac() {
		return ac;
	}
	public String getDuration() {
		return duration;
	}
	public void setavailable(int cap) {
		
	}
	public void setac(boolean val) {
	
	}
	public void setDuration(String dur) {
		
	}
	
public void Displaycarinfo() {
	System.out.println(" Route No -- "+car_id+" : Available Cars -- "+available+" : AC -- "+ac+" : Duration -- "+duration);
}
}
