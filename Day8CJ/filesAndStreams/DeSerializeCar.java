package filesAndStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

class Engine{
	private String engineNo;
	private int cubicCapacity;
	Engine(String engineNo,int cubicCapacity){
		this.engineNo=engineNo;
		this.cubicCapacity=cubicCapacity;
	}
	Engine(){
		
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public int getCubicCapacity() {
		return cubicCapacity;
	}
	public void setCubicCapacity(int cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}
	
}
class Car{
	private String registrationNo;
	private String carMake;
	Engine engine;
	Car(String registrationNo,String carMake,Engine engine){
		this.registrationNo=registrationNo;
		this.carMake=carMake;
		this.engine=engine;
	}
	Car(){
		
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
public class DeSerializeCar {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File file=new File("Cardata.ser");
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
		Car car=new Car();
		ois.readObject();
		System.out.println("Car Details:"+car.getRegistrationNo()+car.getCarMake()+car.getEngine());
		ois.close();
	}

}
