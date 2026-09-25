class Device{
	int DeviceId;
	String DeviceName;
	boolean PowerStatus;

	Device(int id, String name, boolean status){
		DeviceId=id;
		DeviceName=name;
		PowerStatus=status;
	}
	
	void turnOn(){
		if(PowerStatus==true){
		System.out.println("Device is On.");}
	}
	void turnOff(){
		if(PowerStatus==false){
		System.out.println("Device is Off.");}
	}
}

class SmartLight extends Device{
	int BrightnessLevel;
	String Color;

	SmartLight(int id, String name, boolean status, int brightness, String col){
		super(id, name, status);
		BrightnessLevel=brightness;
		Color=col;
	}

	void ChangeBrightnesslevel(int level){
		BrightnessLevel=level;		
	}

	void displayInfo(){
			System.out.println("Device Id: "+ DeviceId);
			System.out.println("Device Name: "+ DeviceName);
			System.out.println("PowerStatus: "+ PowerStatus);
			System.out.println("Brightness level: "+ BrightnessLevel);
			System.out.println("Colour Mode: "+ Color);
	}
}

class smarthomeautomation{
	public static void main(String cp[]){
		SmartLight s=new SmartLight(2401, "LED", false, 15, "Warm");

		s.ChangeBrightnesslevel(20);
		s.turnOn();
		s.turnOff();
		s.displayInfo();
	}
}