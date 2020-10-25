package filesAndStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeCar {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Car car=new Car("KA38M4771","SUZUKI",new Engine("D12134",1000));
		File file=new File("Cardata.ser");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(car);
		oos.close();
	}

}
