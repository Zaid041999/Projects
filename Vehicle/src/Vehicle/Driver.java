package Vehicle;

import java.util.Scanner;

interface vehicletestDriveStatus// 100% abstraction achieve by using interface
{
	void testDrive();
}

class Vehicle implements vehicletestDriveStatus {
	String category;
	String subcategory;
	String brand;
	String name;
	String color;
	String fuel;
	double price;
	String battery;
	int maxspeed;
	String drivingrange;
	String mileage;
	long debit;
	private String ownername = "Zaid";// Data hiding achieved by using Encapsulation and private keyword

	public String getOwnerName() // getterMethod-->to get private data
	{
		return ownername;
	}

	public void setOwnerName(String ownername)  //setterMethod-->to set/modify private data
	{
		this.ownername = ownername;
	}

	public void testDrive() // runtime polymorphism achieved by method overriding of testDrive()
	{
		System.out.println("You cannot take test drive");
	}

}

//category of Vehicle
class TwoWheeler extends Vehicle {
	{
		category = "Two Wheeler";
	}
}

//sub category of Two wheeler
class Bike extends TwoWheeler {
	{
		subcategory = "Bike";
	}
}

class RoyalEnfield extends Bike {
	{
		brand = "Royal Enfield";
	}
}

class Himalayan extends RoyalEnfield {
	public void update() {
		name = "Himalayan";
		color = "Black& Red";
		price = 150000;
		maxspeed = 140;
		mileage = "12 km/l ";
	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class GT650 extends RoyalEnfield {
	public void update() {
		name = " GT650";
		color = "Black,Blue,Red";
		price = 200000;
		maxspeed = 135;
		mileage = "30 km/l ";
	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Classic extends RoyalEnfield {
	public void update() {
		name = "Classic";
		color = "Black,Green";
		price = 218450;
		maxspeed = 140;
		mileage = "32 km/l ";
	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class ThunderBird extends RoyalEnfield {
	public void update() {
		name = "ThunderBird";
		color = "Black,White";
		price = 186000;
		maxspeed = 107;
		mileage = "32 km/l ";
	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Honda extends Bike {
	{
		brand = "Honda";
	}
}

class Activa extends Honda {
	public void update() {
		name = "Activa";
		color = "Black,Grey,Red";
		price = 87000;
		maxspeed = 110;
		mileage = "43 km/l ";
	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Shine extends Honda {

	public void update() {
		name = "Shine";
		color = "Black,Grey";
		price = 92000;
		maxspeed = 115;
		mileage = "40 km/l ";
	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}

}

class Tvs extends Bike {
	{
		brand = "TVS";
	}
}

class Jupiter extends Tvs {
	public void update() {
		name = "Jupiter";
		color = "Black,Grey,Blue";
		price = 95000;
		maxspeed = 110;
		mileage = "42 km/l ";
	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Apache extends Tvs {
	public void update() {
		name = "Apache";
		color = "Red";
		price = 112681;
		maxspeed = 120;
		mileage = "45 km/l ";
	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Bajaj extends Bike {
	{
		brand = "Bajaj";
	}
}

class Pulsar extends Bajaj {
	public void update() {
		name = "Pulsar 125";
		color = "Black,Black & Red,Yellow ";
		price = 82713;
		maxspeed = 122;
		mileage = "50 km/l ";
	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Platina extends Bajaj {
	public void update() {
		name = "Platina 100";
		color = "Black,Red ";
		price = 57772;
		maxspeed = 110;
		mileage = "55 km/l ";
	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}

}

class Jawa extends Bike {
	{
		brand = "Jawa";
	}
}

class Jawa_42 extends Jawa {
	public void update() {
		name = " Jawa_42";
		color = "AllstarBlack, Orion Red ";
		price = 194142;
		maxspeed = 145;
		mileage = "30 km/l ";
	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Jawa_Perak extends Jawa {
	public void update() {
		name = " Jawa_Perak";
		color = "Black ";
		price = 209187;
		maxspeed = 155;
		mileage = "30 km/l ";
	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Yamaha extends Bike {
	{
		brand = "Yamaha";
	}
}

class RX100 extends Yamaha {
	public void update() {
		name = " RX100";
		color = "Black,Grey,Red ";
		price = 140000;
		maxspeed = 125;
		mileage = "28 km/l ";
	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class RX15 extends Yamaha {
	public void update() {
		name = " RX15";
		color = "Black,Grey ";
		price = 140000;
		maxspeed = 120;
		mileage = "25 km/l ";
	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class FZ25 extends Yamaha {
	public void update() {
		name = " FZ25";
		color = "Racing Blue,Metallic Black ";
		price = 167290;
		maxspeed = 127;
		mileage = "50 km/l ";
	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}

}

//sub category of Two wheeler
class Cycle extends TwoWheeler {
	{
		subcategory = "Cycle";
	}
}

class Avon extends Cycle {
	public void update() {
		brand = "Avon";
		name = "WaltX Dune";
		color = "Grey, Orange";
		price = 14370;

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Hercules extends Cycle {
	public void update() {
		brand = "Hercules";
		name = "Storm HT 26T";
		color = "Green";
		price = 7399;

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class FireFox extends Cycle {
	public void update() {
		brand = "FireFox";
		name = "Spirit";
		color = "Black";
		price = 18900;

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

//category of Vehicle
class ThreeWheeler extends Vehicle {
	{
		category = " ThreeWheeler";
	}
}

//sub category of Three wheeler
class Autorickshaw extends ThreeWheeler {
	{
		subcategory = "Autorickshaw";
	}
}

class MahindraAlfa extends Autorickshaw {
	public void update() {
		brand = "Mahindra";
		name = "MahindraAlfa";
		color = "Black,Yellow and Black";
		price = 2.75;
		maxspeed = 100;
		mileage = "28.9 km/l ";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class PiaggoApe extends Autorickshaw {
	public void update() {
		brand = " Piaggo";
		name = " PiaggoApe";
		color = "Yellow and Black";
		price = 2.70;
		maxspeed = 101;
		mileage = "27 km/l ";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class BajajMaxima extends Autorickshaw {
	public void update() {
		brand = " Bajaj";
		name = " BajajMaxima";
		color = "Yellow and Black,Yellow and Green";
		price = 2.77;
		maxspeed = 101;
		mileage = "28 km/l ";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

//category of Vehicle
class FourWheeler extends Vehicle {
	{
		category = "Four Wheeler";

	}
}

//sub category of Four wheeler
class Petrol extends FourWheeler {
	{
		subcategory = "Petrol";
	}
}

class HondaCity extends Petrol {
	public void update() {
		brand = " Honda";
		name = " Honda City";
		color = "Red , Black,Silver";
		price = 11.57;
		fuel = "40L";
		mileage = "17.8 kmpl ";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Alto extends Petrol {
	public void update() {
		brand = " Suzuki";
		name = " Alto";
		color = "Red,Blue";
		price = 4.28;
		fuel = "30L";
		mileage = "31.59 kmpl";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Innova extends Petrol {
	public void update() {
		brand = " Toyota";
		name = " Innova";
		color = "Navy Blue ,Black ,Siver";
		price = 17.86;
		fuel = "55L";
		mileage = "12 km/l ";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Swift extends Petrol {
	public void update() {
		brand = " Suzuki";
		name = " Swift";
		color = "Red and Black,White and Black";
		price = 5.92;
		fuel = "45L";
		mileage = "23.76 km/l ";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

//sub category of Four wheeler
class Disel extends FourWheeler {
	{
		subcategory = "Disel";
	}
}

class KiaSeltos extends Disel {
	public void update() {
		brand = " kia";
		name = " kia Seltos";
		color = "Orange ands White ,White,Black";
		price = 11.39;
		fuel = "50L";
		mileage = "20.8  km/l ";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Fortuner extends Disel {
	public void update() {
		brand = " Toyota";
		name = " Fortuner";
		color = "Phantom Brown, Sparkling Black Crystal Shine, Avant garde bronze, Super white";
		price = 46.50;
		fuel = "30L";
		mileage = "8 km/l ";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Creta extends Disel {
	public void update() {
		brand = " Hyundai";
		name = " Creta";
		color = "Typhoon Silver,Red Mulberry,Knight Black";
		price = 11.21;
		fuel = "50L";
		mileage = "21 km/l ";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class XUV700 extends Disel {
	public void update() {
		brand = " Mahindra";
		name = " XUV700";
		color = " Midnight Black, Everest White, Dazzling Silver, Red Rage, Electric Blue";
		price = 15.80;
		fuel = "60L";
		mileage = "12.75  km/l ";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

//sub category of Four wheeler
class EV extends FourWheeler {
	{
		subcategory = "EV";
	}
}

class AudiEtron extends EV {
	public void update() {
		brand = " Audi";
		name = "AudiEtron";
		color = "Glacier white Metallic, Galaxy-Blue-Metallic, Typhoon Gray Metallic";
		price = 1.01;// crore
		// maxspeed= 70;
		battery = "Lithium-ion";
		drivingrange = "264-379km ";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class TataNexon extends EV {
	public void update() {
		brand = " Tata";
		name = " TataNexon";
		color = "Signature Teal Blue,Glacier White,Black";
		price = 14.99;
		// maxspeed= 70;
		battery = "Lithium-ion";
		drivingrange = "312 km ";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class MGZS extends EV {
	public void update() {
		brand = " MG";
		name = " MG ZS";
		color = "Currant Red, Ferris White, Sable Black and Ashen Silver";
		price = 23.5;
		// maxspeed= 70;
		battery = "Lithium-ion";
		drivingrange = "461 km ";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Tesla extends EV {
	public void update() {
		brand = " Tesla";
		name = " Model X";
		color = "Black,White";
		price = 1.5;// crore
		// maxspeed= 70;
		battery = "Lithium-ion";
		drivingrange = "535 km  ";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

//category of Vehicle
class SixWheeler extends Vehicle {
	{
		category = "Six Wheeler";

	}
}

//sub category of Six wheeler
class Truck extends SixWheeler {
	{
		subcategory = "Truck";
	}
}

class Ashokleyland extends Truck {
	public void update() {
		brand = " Ashokleyland";
		name = "  Partner";
		color = "White ,Blue";
		price = 14.98;
		// maxspeed= ;
		// mileage =" km/l ";
		fuel = "90L";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class BharatBenz extends Truck {
	public void update() {
		brand = "  BharatBenz";
		name = " 1917R";
		color = "White,Orange and Black";
		price = 24.77;
		fuel = "150L";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

//sub category of Six wheeler
class Bus extends SixWheeler {
	{
		subcategory = "Bus";
	}
}

class Volvo extends Bus {
	public void update() {
		brand = " Volvo";
		name = " Volvo 9400 ";
		color = "Blue,White";
		price = 90;
		fuel = "215L";
		// maxspeed= ;
		// mileage =" ";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Eicher extends Bus {
	public void update() {
		brand = " Eicher";
		name = " Starline";
		color = "White";
		price = 25.28;
		fuel = "200L";
		// maxspeed= ;
		// mileage =" ";

	}

	public void testDrive() {
		System.out.println("you can take test drive/ride");
	}
}

class Login {
	@Override
	public String toString() {
		return "You have login Successfully";
	}
}

public class Driver {
	static String name1 = "Zaid";
	static int pass1 = 12345;
	static {
		System.out.println("================================");
		System.out.println("Welcome To All In One Automobile");
		System.out.println("================================");
		System.out.println("\n");
		System.out.println("===========Login================");

	}

	public static void main(String[] args) {

		Vehicle vh = new Vehicle();
		Scanner sc = new Scanner(System.in);

		String name2 = "Zaid";
		System.out.println("username :" + name2);
		System.out.print("password :");
		int pass2 = sc.nextInt();
		if (name1 == name2 && pass1 == pass2) {
			Login lg = new Login();
			// System.out.println("\n");
			System.out.println(lg.toString());
			System.out.println("\n");
			System.out.println("Plz Enter your name");
			String names =sc.next();
			while (true) {
				System.out.println(
						"We have Varierty of vehicles \nPress number  to select  \n1.TwoWheeler \n2.ThreeWheeler \n3.FourWheeler \n4.SixWheeler");
				System.out.println("Enter your Choice:");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("You have selected Two Wheeler");
					System.out.println("Select \n1.Bike \n2.Cycle");
					int choice1 = sc.nextInt();

					switch (choice1) {
					case 1:
						System.out.println("You have selected Bike");
						System.out.println("Select \n1.RoyalEnfield \n2.Honda \n3.Tvs \n4.Bajaj \n5.Jawa \n6.Yamaha");

						int bike = sc.nextInt();
						switch (bike) {
						case 1:
							System.out.println("You have selected RoyalEnfield");
							System.out.println("Select \n1.Himalayan \n2.GT650 \n3.Classic \n4.ThunderBird ");
							int royalef = sc.nextInt();
							switch (royalef) {
							case 1:
								System.out.println("You have selected Himalayan");
								Himalayan hbike = new Himalayan();
								hbike.update();
								System.out.println("Segment:" + hbike.category);
								System.out.println("Subcategory:" + hbike.subcategory);
								System.out.println("Brand Name:" + hbike.brand);
								System.out.println("Model Name:" + hbike.name);
								System.out.println("Colour Available:" + hbike.color);
								System.out.println("Price is Rs:" + hbike.price);
								System.out.println("Maxspeed:" + hbike.maxspeed + "km/hr");
								System.out.println("Mileage:" + hbike.mileage);
								// System.out.println("\n\n");
								hbike.testDrive();
								System.out.println("Enter 1 to Buy");
								int hb = sc.nextInt();
								switch (hb) {
								case 1:
									System.out.print("Debit card no :");
									long debit = sc.nextLong();
									System.out.println("Transaction is successfull");
									System.out.println("Transaction no :" + hbike.hashCode());
									System.out.println("Congratulations for new " + hbike.name);
									hbike.setOwnerName(names);
									System.out.println("OwnerName :" + hbike.getOwnerName());
									break;

								default:
									System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
								}

								break;

							case 2:
								System.out.println("You have selected GT650");
								GT650 gtbike = new GT650();
								gtbike.update();
								System.out.println("Segment:" + gtbike.category);
								System.out.println("Subcategory:" + gtbike.subcategory);
								System.out.println("Brand Name:" + gtbike.brand);
								System.out.println("Model Name:" + gtbike.name);
								System.out.println("Colour Available:" + gtbike.color);
								System.out.println("Price is Rs:" + gtbike.price);
								System.out.println("Maxspeed:" + gtbike.maxspeed + "km/hr");
								System.out.println("Mileage:" + gtbike.mileage);
								// System.out.println("\n\n");
								gtbike.testDrive();
								System.out.println("Enter 1 to Buy");
								int gtb = sc.nextInt();
								switch (gtb) {
								case 1:
									System.out.print("Debit card no :");
									long debit = sc.nextLong();
									System.out.println("Transaction is successfull");
									System.out.println("Transaction no :" + gtbike.hashCode());
									System.out.println("Congratulations for new " + gtbike.name);
									gtbike.setOwnerName(names);
									System.out.println("OwnerName :" + gtbike.getOwnerName());
									break;

								default:
									System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
								}

								break;

							case 3:
								System.out.println("You have selected Classic");
								Classic clbike = new Classic();
								clbike.update();
								System.out.println("Segment:" + clbike.category);
								System.out.println("Subcategory:" + clbike.subcategory);
								System.out.println("Brand Name:" + clbike.brand);
								System.out.println("Model Name:" + clbike.name);
								System.out.println("Colour Available:" + clbike.color);
								System.out.println("Price is Rs:" + clbike.price);
								System.out.println("Maxspeed:" + clbike.maxspeed + "km/hr");
								System.out.println("Mileage:" + clbike.mileage);
								// System.out.println("\n\n");
								clbike.testDrive();
								System.out.println("Enter 1 to Buy");
								int clb = sc.nextInt();
								switch (clb) {
								case 1:
									System.out.print("Debit card no :");
									try{long debit = sc.nextLong();}catch(Exception e) {e.printStackTrace();}
									System.out.println("Transaction is successfull");
									System.out.println("Transaction no :" + clbike.hashCode());
									System.out.println("Congratulations for new " + clbike.name);
									clbike.setOwnerName(names);
									System.out.println("OwnerName :" + clbike.getOwnerName());
									break;

								default:
									System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
								}
								break;

							case 4:
								System.out.println("You have selected ThunderBird");
								ThunderBird tbbike = new ThunderBird();
								tbbike.update();
								System.out.println("Segment:" + tbbike.category);
								System.out.println("Subcategory:" + tbbike.subcategory);
								System.out.println("Brand Name:" + tbbike.brand);
								System.out.println("Model Name:" + tbbike.name);
								System.out.println("Colour Available:" + tbbike.color);
								System.out.println("Price is Rs:" + tbbike.price);
								System.out.println("Maxspeed:" + tbbike.maxspeed + "km/hr");
								System.out.println("Mileage:" + tbbike.mileage);
								// System.out.println("\n\n");
								tbbike.testDrive();
								System.out.println("Enter 1 to Buy");
								int tbb = sc.nextInt();
								switch (tbb) {
								case 1:
									System.out.print("Debit card no :");
									long debit = sc.nextLong();
									System.out.println("Transaction is successfull");
									System.out.println("Transaction no :" + tbbike.hashCode());
									System.out.println("Congratulations for new " + tbbike.name);
									tbbike.setOwnerName(names);
									System.out.println("OwnerName :" + tbbike.getOwnerName());
									break;

								default:
									System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
								}
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 2:
							System.out.println("You have selected Honda");
							System.out.println("Select \n1.Activa \n2.Shine ");
							int honda = sc.nextInt();
							switch (honda) {
							case 1:
								System.out.println("You have selected Activa");
								Activa atbike = new Activa();
								atbike.update();
								System.out.println("Segment:" + atbike.category);
								System.out.println("Subcategory:" + atbike.subcategory);
								System.out.println("Brand Name:" + atbike.brand);
								System.out.println("Model Name:" + atbike.name);
								System.out.println("Colour Available:" + atbike.color);
								System.out.println("Price is Rs:" + atbike.price);
								System.out.println("Maxspeed:" + atbike.maxspeed + "km/hr");
								System.out.println("Mileage:" + atbike.mileage);
								// System.out.println("\n\n");
								atbike.testDrive();
								System.out.println("Enter 1 to Buy");
								int atb = sc.nextInt();
								switch (atb) {
								case 1:
									System.out.print("Debit card no :");
									long debit = sc.nextLong();
									System.out.println("Transaction is successfull");
									System.out.println("Transaction no :" + atbike.hashCode());
									System.out.println("Congratulations for new " + atbike.name);
									atbike.setOwnerName(names);
									System.out.println("OwnerName :" + atbike.getOwnerName());
									break;

								default:
									System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
								}
								break;

							case 2:
								System.out.println("You have selected Shine");
								Shine shbike = new Shine();
								shbike.update();
								System.out.println("Segment:" + shbike.category);
								System.out.println("Subcategory:" + shbike.subcategory);
								System.out.println("Brand Name:" + shbike.brand);
								System.out.println("Model Name:" + shbike.name);
								System.out.println("Colour Available:" + shbike.color);
								System.out.println("Price is Rs:" + shbike.price);
								System.out.println("Maxspeed:" + shbike.maxspeed + "km/hr");
								System.out.println("Mileage:" + shbike.mileage);
								// System.out.println("\n\n");
								shbike.testDrive();
								System.out.println("Enter 1 to Buy");
								int shb = sc.nextInt();
								switch (shb) {
								case 1:
									System.out.print("Debit card no :");
									long debit = sc.nextLong();
									System.out.println("Transaction is successfull");
									System.out.println("Transaction no :" + shbike.hashCode());
									System.out.println("Congratulations for new " + shbike.name);
									shbike.setOwnerName(names);
									System.out.println("OwnerName :" + shbike.getOwnerName());
									break;

								default:
									System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
								}
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 3:
							System.out.println("You have selected Tvs");
							System.out.println("Select \n1.Jupiter \n2.Apache ");
							int tvs = sc.nextInt();
							switch (tvs) {
							case 1:
								System.out.println("You have selected Jupiter");
								Jupiter jbike = new Jupiter();
								jbike.update();
								System.out.println("Segment:" + jbike.category);
								System.out.println("Subcategory:" + jbike.subcategory);
								System.out.println("Brand Name:" + jbike.brand);
								System.out.println("Model Name:" + jbike.name);
								System.out.println("Colour Available:" + jbike.color);
								System.out.println("Price is Rs:" + jbike.price);
								System.out.println("Maxspeed:" + jbike.maxspeed + "km/hr");
								System.out.println("Mileage:" + jbike.mileage);
								// System.out.println("\n\n");
								jbike.testDrive();
								System.out.println("Enter 1 to Buy");
								int jb = sc.nextInt();
								switch (jb) {
								case 1:
									System.out.print("Debit card no :");
									long debit = sc.nextLong();
									System.out.println("Transaction is successfull");
									System.out.println("Transaction no :" + jbike.hashCode());
									System.out.println("Congratulations for new " + jbike.name);
									jbike.setOwnerName(names);
									System.out.println("OwnerName :" + jbike.getOwnerName());
									break;

								default:
									System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
								}
								break;

							case 2:
								System.out.println("You have selected Apache");
								Apache apbike = new Apache();
								apbike.update();
								System.out.println("Segment:" + apbike.category);
								System.out.println("Subcategory:" + apbike.subcategory);
								System.out.println("Brand Name:" + apbike.brand);
								System.out.println("Model Name:" + apbike.name);
								System.out.println("Colour Available:" + apbike.color);
								System.out.println("Price is Rs:" + apbike.price);
								System.out.println("Maxspeed:" + apbike.maxspeed + "km/hr");
								System.out.println("Mileage:" + apbike.mileage);
								// System.out.println("\n\n");
								apbike.testDrive();
								System.out.println("Enter 1 to Buy");
								int apb = sc.nextInt();
								switch (apb) {
								case 1:
									System.out.print("Debit card no :");
									long debit = sc.nextLong();
									System.out.println("Transaction is successfull");
									System.out.println("Transaction no :" + apbike.hashCode());
									System.out.println("Congratulations for new " + apbike.name);
									apbike.setOwnerName(names);
									System.out.println("OwnerName :" + apbike.getOwnerName());
									break;

								default:
									System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
								}
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 4:
							System.out.println("You have selected Bajaj");
							System.out.println("Select \n1.Pulsar \n2.Platina ");
							int bajaj = sc.nextInt();
							switch (bajaj) {
							case 1:
								System.out.println("You have selected Pulsar");
								Pulsar plbike = new Pulsar();
								plbike.update();
								System.out.println("Segment:" + plbike.category);
								System.out.println("Subcategory:" + plbike.subcategory);
								System.out.println("Brand Name:" + plbike.brand);
								System.out.println("Model Name:" + plbike.name);
								System.out.println("Colour Available:" + plbike.color);
								System.out.println("Price is Rs:" + plbike.price);
								System.out.println("Maxspeed:" + plbike.maxspeed + "km/hr");
								System.out.println("Mileage:" + plbike.mileage);
								// System.out.println("\n\n");
								plbike.testDrive();
								System.out.println("Enter 1 to Buy");
								int plb = sc.nextInt();
								switch (plb) {
								case 1:
									System.out.print("Debit card no :");
									long debit = sc.nextLong();
									System.out.println("Transaction is successfull");
									System.out.println("Transaction no :" + plbike.hashCode());
									System.out.println("Congratulations for new " + plbike.name);
									plbike.setOwnerName(names);
									System.out.println("OwnerName :" + plbike.getOwnerName());
									break;

								default:
									System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
								}
								break;

							case 2:
								System.out.println("You have selected Platina");
								Platina plabike = new Platina();
								plabike.update();
								System.out.println("Segment:" + plabike.category);
								System.out.println("Subcategory:" + plabike.subcategory);
								System.out.println("Brand Name:" + plabike.brand);
								System.out.println("Model Name:" + plabike.name);
								System.out.println("Colour Available:" + plabike.color);
								System.out.println("Price is Rs:" + plabike.price);
								System.out.println("Maxspeed:" + plabike.maxspeed + "km/hr");
								System.out.println("Mileage:" + plabike.mileage);
								// System.out.println("\n\n");
								plabike.testDrive();
								System.out.println("Enter 1 to Buy");
								int pla = sc.nextInt();
								switch (pla) {
								case 1:
									System.out.print("Debit card no :");
									long debit = sc.nextLong();
									System.out.println("Transaction is successfull");
									System.out.println("Transaction no :" + plabike.hashCode());
									System.out.println("Congratulations for new " + plabike.name);
									plabike.setOwnerName(names);
									System.out.println("OwnerName :" + plabike.getOwnerName());
									break;

								default:
									System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
								}
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 5:
							System.out.println("You have selected Jawa");
							System.out.println("Select \n1.Jawa_42 \n2.Jawa_Perak ");
							int jawa = sc.nextInt();
							switch (jawa) {
							case 1:
								System.out.println("You have selected Jawa_42");
								Jawa_42 jabike = new Jawa_42();
								jabike.update();
								System.out.println("Segment:" + jabike.category);
								System.out.println("Subcategory:" + jabike.subcategory);
								System.out.println("Brand Name:" + jabike.brand);
								System.out.println("Model Name:" + jabike.name);
								System.out.println("Colour Available:" + jabike.color);
								System.out.println("Price is Rs:" + jabike.price);
								System.out.println("maxspeed:" + jabike.maxspeed + "km/hr");
								System.out.println("Mileage:" + jabike.mileage);
								// System.out.println("\n\n");
								jabike.testDrive();
								System.out.println("Enter 1 to Buy");
								int jab = sc.nextInt();
								switch (jab) {
								case 1:
									System.out.print("Debit card no :");
									long debit = sc.nextLong();
									System.out.println("Transaction is successfull");
									System.out.println("Transaction no :" + jabike.hashCode());
									System.out.println("Congratulations for new " + jabike.name);
									jabike.setOwnerName(names);
									System.out.println("OwnerName :" + jabike.getOwnerName());
									break;

								default:
									System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
								}
								break;

							case 2:
								System.out.println("You have selected Jawa_Perak");
								Jawa_Perak jpbike = new Jawa_Perak();
								jpbike.update();
								System.out.println("Segment:" + jpbike.category);
								System.out.println("Subcategory:" + jpbike.subcategory);
								System.out.println("Brand Name:" + jpbike.brand);
								System.out.println("Model Name:" + jpbike.name);
								System.out.println("Colour Available:" + jpbike.color);
								System.out.println("Price is Rs:" + jpbike.price);
								System.out.println("Maxspeed:" + jpbike.maxspeed + "km/hr");
								System.out.println("Mileage:" + jpbike.mileage);
								// System.out.println("\n\n");
								jpbike.testDrive();
								System.out.println("Enter 1 to Buy");
								int jpb = sc.nextInt();
								switch (jpb) {
								case 1:
									System.out.print("Debit card no :");
									long debit = sc.nextLong();
									System.out.println("Transaction is successfull");
									System.out.println("Transaction no :" + jpbike.hashCode());
									System.out.println("Congratulations for new " + jpbike.name);
									jpbike.setOwnerName(names);
									System.out.println("OwnerName :" + jpbike.getOwnerName());
									break;

								default:
									System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
								}
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}

							break;

						case 6:
							System.out.println("You have selected Yamaha");
							System.out.println("Select \n1.RX100 \n2.RX15 \n3.FZ25 ");
							int yamaha = sc.nextInt();
							switch (yamaha) {
							case 1:
								System.out.println("You have selected RX100");
								RX100 rxbike = new RX100();
								rxbike.update();
								System.out.println("Segment:" + rxbike.category);
								System.out.println("Subcategory:" + rxbike.subcategory);
								System.out.println("Brand Name:" + rxbike.brand);
								System.out.println("Model Name:" + rxbike.name);
								System.out.println("Colour Available:" + rxbike.color);
								System.out.println("Price is Rs:" + rxbike.price);
								System.out.println("Maxspeed:" + rxbike.maxspeed + "km/hr");
								System.out.println("Mileage:" + rxbike.mileage);
								// System.out.println("\n\n");
								rxbike.testDrive();
								System.out.println("Enter 1 to Buy");
								int rxb = sc.nextInt();
								switch (rxb) {
								case 1:
									System.out.print("Debit card no :");
									long debit = sc.nextLong();
									System.out.println("Transaction is successfull");
									System.out.println("Transaction no :" + rxbike.hashCode());
									System.out.println("Congratulations for new " + rxbike.name);
									rxbike.setOwnerName(names);
									System.out.println("OwnerName :" + rxbike.getOwnerName());
									break;

								default:
									System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
								}

								break;

							case 2:
								System.out.println("You have selected RX15");
								RX15 rbike = new RX15();
								rbike.update();
								System.out.println("Segment:" + rbike.category);
								System.out.println("Subcategory:" + rbike.subcategory);
								System.out.println("Brand Name:" + rbike.brand);
								System.out.println("Model Name:" + rbike.name);
								System.out.println("Colour Available:" + rbike.color);
								System.out.println("Price is Rs:" + rbike.price);
								System.out.println("Maxspeed:" + rbike.maxspeed + "km/hr");
								System.out.println("Mileage:" + rbike.mileage);
								// System.out.println("\n\n");
								rbike.testDrive();
								System.out.println("Enter 1 to Buy");
								int rb = sc.nextInt();
								switch (rb) {
								case 1:
									System.out.print("Debit card no :");
									long debit = sc.nextLong();
									System.out.println("Transaction is successfull");
									System.out.println("Transaction no :" + rbike.hashCode());
									System.out.println("Congratulations for new " + rbike.name);
									rbike.setOwnerName(names);
									System.out.println("OwnerName :" + rbike.getOwnerName());
									break;

								default:
									System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
								}
								break;

							case 3:
								System.out.println("You have selected FZ25");
								FZ25 fzbike = new FZ25();
								fzbike.update();
								System.out.println("Segment:" + fzbike.category);
								System.out.println("Subcategory:" + fzbike.subcategory);
								System.out.println("Brand Name:" + fzbike.brand);
								System.out.println("Model Name:" + fzbike.name);
								System.out.println("Colour Available:" + fzbike.color);
								System.out.println("Price is Rs:" + fzbike.price);
								System.out.println("Maxspeed:" + fzbike.maxspeed + "km/hr");
								System.out.println("Mileage:" + fzbike.mileage);
								// System.out.println("\n\n");
								fzbike.testDrive();
								System.out.println("Enter 1 to Buy");
								int fzb = sc.nextInt();
								switch (fzb) {
								case 1:
									System.out.print("Debit card no :");
									long debit = sc.nextLong();
									System.out.println("Transaction is successfull");
									System.out.println("Transaction no :" + fzbike.hashCode());
									System.out.println("Congratulations for new " + fzbike.name);
									fzbike.setOwnerName(names);
									System.out.println("OwnerName :" + fzbike.getOwnerName());
									break;

								default:
									System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
								}
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;
						default:
							System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
						}
						break;

					case 2:
						System.out.println("You have selected Cycle");
						System.out.println("Select \n1.Avon \n2.Hercules \n3.Firefox ");
						int cycle = sc.nextInt();
						switch (cycle) {
						case 1:
							System.out.println("You have selected Avon");
							Avon avcyc = new Avon();
							avcyc.update();
							System.out.println("Segment:" + avcyc.category);
							System.out.println("Subcategory:" + avcyc.subcategory);
							System.out.println("Brand Name:" + avcyc.brand);
							System.out.println("Model Name:" + avcyc.name);
							System.out.println("Colour Available:" + avcyc.color);
							System.out.println("Price is Rs:" + avcyc.price);
							// System.out.println("\n\n");
							avcyc.testDrive();
							// System.out.println("Maxspeed:"+avcyc.maxspeed+"km/hr");
							// System.out.println("Mileage:"+avcyc.mileage);
							System.out.println("Enter 1 to Buy");
							int avc = sc.nextInt();
							switch (avc) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + avcyc.hashCode());
								System.out.println("Congratulations for new " + avcyc.name);
								avcyc.setOwnerName(names);
								System.out.println("OwnerName :" + avcyc.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 2:
							System.out.println("You have selected Hercules");
							Hercules hercyc = new Hercules();
							hercyc.update();
							System.out.println("Segment:" + hercyc.category);
							System.out.println("Subcategory:" + hercyc.subcategory);
							System.out.println("Brand Name:" + hercyc.brand);
							System.out.println("Model Name:" + hercyc.name);
							System.out.println("Colour Available:" + hercyc.color);
							System.out.println("Price is Rs:" + hercyc.price);
							// System.out.println("\n\n");
							hercyc.testDrive();
							// System.out.println("Maxspeed:"+hercyc.maxspeed+"km/hr");
							// System.out.println("Mileage:"+hercyc.mileage);
							System.out.println("Enter 1 to Buy");
							int herc = sc.nextInt();
							switch (herc) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + hercyc.hashCode());
								System.out.println("Congratulations for new " + hercyc.name);
								hercyc.setOwnerName(names);
								System.out.println("OwnerName :" + hercyc.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 3:
							System.out.println("You have selected FireFox");
							FireFox ffcyc = new FireFox();
							ffcyc.update();
							System.out.println("Segment:" + ffcyc.category);
							System.out.println("Subcategory:" + ffcyc.subcategory);
							System.out.println("Brand Name:" + ffcyc.brand);
							System.out.println("Model Name:" + ffcyc.name);
							System.out.println("Colour Available:" + ffcyc.color);
							System.out.println("Price is Rs:" + ffcyc.price);
							// System.out.println("Maxspeed:"+ffcyc.maxspeed+"km/hr");
							// System.out.println("Mileage:"+ffcyc.mileage);
							// System.out.println("\n\n");
							ffcyc.testDrive();
							System.out.println("Enter 1 to Buy");
							int ffc = sc.nextInt();
							switch (ffc) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + ffcyc.hashCode());
								System.out.println("Congratulations for new " + ffcyc.name);
								ffcyc.setOwnerName(names);
								System.out.println("OwnerName :" + ffcyc.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						default:
							System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
						}
						break;

					default:
						System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
					}
					break;

				case 2:
					System.out.println("You have selected Three Wheeler");

					System.out.println("Select \n1.Autorickshaw");
					int choice2 = sc.nextInt();

					switch (choice2) {
					case 1:
						System.out.println("You have selected Autorickshaw");
						System.out.println("Select \n1.MahindraAlfa \n2.PiaggoApe \n3.BajajMaxima ");
						int autorick = sc.nextInt();
						switch (autorick) {
						case 1:
							System.out.println("You have selected MahindraAlfa");
							MahindraAlfa marick = new MahindraAlfa();
							marick.update();
							System.out.println("Segment:" + marick.category);
							System.out.println("Subcategory:" + marick.subcategory);
							System.out.println("Brand Name:" + marick.brand);
							System.out.println("Model Name:" + marick.name);
							System.out.println("Colour Available:" + marick.color);
							System.out.println("Price is Rs:" + marick.price);
							System.out.println("Maxspeed:" + marick.maxspeed + "km/hr");
							System.out.println("Mileage:" + marick.mileage);
							// System.out.println("\n\n");
							marick.testDrive();
							System.out.println("Enter 1 to Buy");
							int mar = sc.nextInt();
							switch (mar) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + marick.hashCode());
								System.out.println("Congratulations for new " + marick.name);
								marick.setOwnerName(names);
								System.out.println("OwnerName :" + marick.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 2:
							System.out.println("You have selected PiaggoApe");
							PiaggoApe parick = new PiaggoApe();
							parick.update();
							System.out.println("Segment:" + parick.category);
							System.out.println("Subcategory:" + parick.subcategory);
							System.out.println("Brand Name:" + parick.brand);
							System.out.println("Model Name:" + parick.name);
							System.out.println("Colour Available:" + parick.color);
							System.out.println("Price is Rs:" + parick.price);
							System.out.println("Maxspeed:" + parick.maxspeed + "km/hr");
							System.out.println("Mileage:" + parick.mileage);
							// System.out.println("\n\n");
							parick.testDrive();
							System.out.println("Enter 1 to Buy");
							int par = sc.nextInt();
							switch (par) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + parick.hashCode());
								System.out.println("Congratulations for new " + parick.name);
								parick.setOwnerName(names);
								System.out.println("OwnerName :" + parick.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 3:
							System.out.println("You have selected BajajMaxima");
							BajajMaxima bmrick = new BajajMaxima();
							bmrick.update();
							System.out.println("Segment:" + bmrick.category);
							System.out.println("Subcategory:" + bmrick.subcategory);
							System.out.println("Brand Name:" + bmrick.brand);
							System.out.println("Model Name:" + bmrick.name);
							System.out.println("Colour Available:" + bmrick.color);
							System.out.println("Price is Rs:" + bmrick.price);
							System.out.println("Maxspeed:" + bmrick.maxspeed + "km/hr");
							System.out.println("Mileage:" + bmrick.mileage);
							// System.out.println("\n\n");
							bmrick.testDrive();
							System.out.println("Enter 1 to Buy");
							int bmr = sc.nextInt();
							switch (bmr) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + bmrick.hashCode());
								System.out.println("Congratulations for new " + bmrick.name);
								bmrick.setOwnerName(names);
								System.out.println("OwnerName :" + bmrick.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						default:
							System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
						}
						break;
					default:
						System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
					}
					break;

				case 3:
					System.out.println("You have selected Four Wheeler");
					System.out.println("Select \n1.Petrol \n2.Disel \n3.EV");
					int choice3 = sc.nextInt();

					switch (choice3) {
					case 1:
						System.out.println("You have selected Petrol model");
						System.out.println("Select \n1.HondaCity \n2.Alto \n3.Innova \n4.Swift");
						int petrol = sc.nextInt();
						switch (petrol) {
						case 1:
							System.out.println("You have selected HondaCity");
							HondaCity hccar = new HondaCity();
							hccar.update();
							System.out.println("Segment: " + hccar.category);
							System.out.println("Subcategory: " + hccar.subcategory);
							System.out.println("Brand Name: " + hccar.brand);
							System.out.println("Model Name: " + hccar.name);
							System.out.println("Colour Available: " + hccar.color);
							System.out.println("Price is Rs: " + hccar.price + "Lakhs");
							System.out.println("Fuel Capacity: " + hccar.fuel);
							System.out.println("Mileage: " + hccar.mileage);
							// System.out.println("\n\n");
							hccar.testDrive();
							System.out.println("Enter 1 to Buy");
							int hcc = sc.nextInt();
							switch (hcc) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + hccar.hashCode());
								System.out.println("Congratulations for new " + hccar.name);
								hccar.setOwnerName(names);
								System.out.println("OwnerName :" + hccar.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 2:
							System.out.println("You have selected Alto");
							Alto alcar = new Alto();
							alcar.update();
							System.out.println("Segment: " + alcar.category);
							System.out.println("Subcategory: " + alcar.subcategory);
							System.out.println("Brand Name: " + alcar.brand);
							System.out.println("Model Name: " + alcar.name);
							System.out.println("Colour Available: " + alcar.color);
							System.out.println("Price is Rs: " + alcar.price + "Lakhs");
							System.out.println("Fuel Capacity: " + alcar.fuel);
							System.out.println("Mileage: " + alcar.mileage);
							// System.out.println("\n\n");
							alcar.testDrive();
							System.out.println("Enter 1 to Buy");
							int alc = sc.nextInt();
							switch (alc) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + alcar.hashCode());
								System.out.println("Congratulations for new " + alcar.name);
								alcar.setOwnerName(names);
								System.out.println("OwnerName :" + alcar.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 3:
							System.out.println("You have selected Innova");
							Innova incar = new Innova();
							incar.update();
							System.out.println("Segment: " + incar.category);
							System.out.println("Subcategory: " + incar.subcategory);
							System.out.println("Brand Name: " + incar.brand);
							System.out.println("Model Name: " + incar.name);
							System.out.println("Colour Available: " + incar.color);
							System.out.println("Price is Rs: " + incar.price + "Lakhs");
							System.out.println("Fuel Capacity: " + incar.fuel);
							System.out.println("Mileage: " + incar.mileage);
							// System.out.println("\n\n");
							incar.testDrive();
							System.out.println("Enter 1 to Buy");
							int inc = sc.nextInt();
							switch (inc) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + incar.hashCode());
								System.out.println("Congratulations for new " + incar.name);
								incar.setOwnerName(names);
								System.out.println("OwnerName :" + incar.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 4:
							System.out.println("You have selected Swift");
							Swift swcar = new Swift();
							swcar.update();
							System.out.println("Segment: " + swcar.category);
							System.out.println("Subcategory: " + swcar.subcategory);
							System.out.println("Brand Name: " + swcar.brand);
							System.out.println("Model Name: " + swcar.name);
							System.out.println("Colour Available: " + swcar.color);
							System.out.println("Price is Rs: " + swcar.price + "Lakhs");
							System.out.println("Fuel Capacity: " + swcar.fuel);
							System.out.println("Mileage: " + swcar.mileage);
							// System.out.println("\n\n");
							swcar.testDrive();
							System.out.println("Enter 1 to Buy");
							int swc = sc.nextInt();
							switch (swc) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + swcar.hashCode());
								System.out.println("Congratulations for new " + swcar.name);
								swcar.setOwnerName(names);
								System.out.println("OwnerName :" + swcar.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						default:
							System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
						}
						break;

					case 2:
						System.out.println("You have selected Disel model");
						System.out.println("Select \n1.KiaSeltos \n2.Fortuner \n3.Creta \n4.XUV700");
						int disel = sc.nextInt();
						switch (disel) {
						case 1:
							System.out.println("You have selected KiaSeltos");
							KiaSeltos kscar = new KiaSeltos();
							kscar.update();
							System.out.println("Segment: " + kscar.category);
							System.out.println("Subcategory: " + kscar.subcategory);
							System.out.println("Brand Name: " + kscar.brand);
							System.out.println("Model Name: " + kscar.name);
							System.out.println("Colour Available: " + kscar.color);
							System.out.println("Price is Rs: " + kscar.price + "Lakhs");
							System.out.println("Fuel Capacity: " + kscar.fuel);
							System.out.println("Mileage: " + kscar.mileage);
							// System.out.println("\n\n");
							kscar.testDrive();
							System.out.println("Enter 1 to Buy");
							int ksc = sc.nextInt();
							switch (ksc) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + kscar.hashCode());
								System.out.println("Congratulations for new " + kscar.name);
								kscar.setOwnerName(names);
								System.out.println("OwnerName :" + kscar.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 2:
							System.out.println("You have selected Fortuner");
							Fortuner forcar = new Fortuner();
							forcar.update();
							System.out.println("Segment: " + forcar.category);
							System.out.println("Subcategory: " + forcar.subcategory);
							System.out.println("Brand Name: " + forcar.brand);
							System.out.println("Model Name: " + forcar.name);
							System.out.println("Colour Available: " + forcar.color);
							System.out.println("Price is Rs: " + forcar.price + "Lakhs");
							System.out.println("Fuel Capacity: " + forcar.fuel);
							System.out.println("Mileage: " + forcar.mileage);
							// System.out.println("\n\n");
							forcar.testDrive();
							System.out.println("Enter 1 to Buy");
							int forc = sc.nextInt();
							switch (forc) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + forcar.hashCode());
								System.out.println("Congratulations for new " + forcar.name);
								forcar.setOwnerName(names);
								System.out.println("OwnerName :" + forcar.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 3:
							System.out.println("You have selected Creta");
							Creta crcar = new Creta();
							crcar.update();
							System.out.println("Segment: " + crcar.category);
							System.out.println("Subcategory: " + crcar.subcategory);
							System.out.println("Brand Name: " + crcar.brand);
							System.out.println("Model Name: " + crcar.name);
							System.out.println("Colour Available: " + crcar.color);
							System.out.println("Price is Rs: " + crcar.price + "Lakhs");
							System.out.println("Fuel Capacity: " + crcar.fuel);
							System.out.println("Mileage: " + crcar.mileage);
							// System.out.println("\n\n");
							crcar.testDrive();
							System.out.println("Enter 1 to Buy");
							int crc = sc.nextInt();
							switch (crc) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + crcar.hashCode());
								System.out.println("Congratulations for new " + crcar.name);
								crcar.setOwnerName(names);
								System.out.println("OwnerName :" + crcar.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}

							break;

						case 4:
							System.out.println("You have selected XUV700");
							XUV700 xuvcar = new XUV700();
							xuvcar.update();
							System.out.println("Segment: " + xuvcar.category);
							System.out.println("Subcategory: " + xuvcar.subcategory);
							System.out.println("Brand Name: " + xuvcar.brand);
							System.out.println("Model Name: " + xuvcar.name);
							System.out.println("Colour Available: " + xuvcar.color);
							System.out.println("Price is Rs: " + xuvcar.price + "Lakhs");
							System.out.println("Fuel Capacity: " + xuvcar.fuel);
							System.out.println("Mileage: " + xuvcar.mileage);
							// System.out.println("\n\n");
							xuvcar.testDrive();
							System.out.println("Enter 1 to Buy");
							int xuvc = sc.nextInt();
							switch (xuvc) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + xuvcar.hashCode());
								System.out.println("Congratulations for new " + xuvcar.name);
								xuvcar.setOwnerName(names);
								System.out.println("OwnerName :" + xuvcar.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						default:
							System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
						}
						break;

					case 3:
						System.out.println("You have selected EV model");
						System.out.println("Select \n1.AudiEtron \n2.TataNexon \n3.MGZS \n4.Tesla");
						int ev = sc.nextInt();
						switch (ev) {
						case 1:
							System.out.println("You have selected AudiEtron");
							AudiEtron aecar = new AudiEtron();
							aecar.update();
							System.out.println("Segment: " + aecar.category);
							System.out.println("Subcategory: " + aecar.subcategory);
							System.out.println("Brand Name: " + aecar.brand);
							System.out.println("Model Name: " + aecar.name);
							System.out.println("Colour Available: " + aecar.color);
							System.out.println("Price is Rs: " + aecar.price + "Crores");
							System.out.println("Battery : " + aecar.battery);
							System.out.println("Driving Range: " + aecar.drivingrange);
							// System.out.println("\n\n");
							aecar.testDrive();
							System.out.println("Enter 1 to Buy");
							int aec = sc.nextInt();
							switch (aec) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + aecar.hashCode());
								System.out.println("Congratulations for new " + aecar.name);
								aecar.setOwnerName(names);
								System.out.println("OwnerName :" + aecar.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 2:
							System.out.println("You have selected TataNexon");
							TataNexon tncar = new TataNexon();
							tncar.update();
							System.out.println("Segment: " + tncar.category);
							System.out.println("Subcategory: " + tncar.subcategory);
							System.out.println("Brand Name: " + tncar.brand);
							System.out.println("Model Name: " + tncar.name);
							System.out.println("Colour Available: " + tncar.color);
							System.out.println("Price is Rs: " + tncar.price + "Lakhs");
							System.out.println("Battery: " + tncar.battery);
							System.out.println("Driving Range: " + tncar.drivingrange);
							// System.out.println("\n\n");
							tncar.testDrive();
							System.out.println("Enter 1 to Buy");
							int tnc = sc.nextInt();
							switch (tnc) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + tncar.hashCode());
								System.out.println("Congratulations for new " + tncar.name);
								tncar.setOwnerName(names);
								System.out.println("OwnerName :" + tncar.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 3:
							System.out.println("You have selected MGZS");
							MGZS mgcar = new MGZS();
							mgcar.update();
							System.out.println("Segment: " + mgcar.category);
							System.out.println("Subcategory: " + mgcar.subcategory);
							System.out.println("Brand Name: " + mgcar.brand);
							System.out.println("Model Name: " + mgcar.name);
							System.out.println("Colour Available: " + mgcar.color);
							System.out.println("Price is Rs: " + mgcar.price + "Lakhs");
							System.out.println("Battery: " + mgcar.battery);
							System.out.println("Driving Range: " + mgcar.drivingrange);
							// System.out.println("\n\n");
							mgcar.testDrive();
							System.out.println("Enter 1 to Buy");
							int mgc = sc.nextInt();
							switch (mgc) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + mgcar.hashCode());
								System.out.println("Congratulations for new " + mgcar.name);
								mgcar.setOwnerName(names);
								System.out.println("OwnerName :" + mgcar.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 4:
							System.out.println("You have selected Tesla");
							Tesla tcar = new Tesla();
							tcar.update();
							System.out.println("Segment: " + tcar.category);
							System.out.println("Subcategory: " + tcar.subcategory);
							System.out.println("Brand Name: " + tcar.brand);
							System.out.println("Model Name: " + tcar.name);
							System.out.println("Colour Available: " + tcar.color);
							System.out.println("Price is Rs: " + tcar.price + "Crores");
							System.out.println("Battery: " + tcar.battery);
							System.out.println("Driving Range: " + tcar.drivingrange);
							// System.out.println("\n\n");
							tcar.testDrive();
							System.out.println("Enter 1 to Buy");
							int tc = sc.nextInt();
							switch (tc) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + tcar.hashCode());
								System.out.println("Congratulations for new " + tcar.name);
								tcar.setOwnerName(names);
								System.out.println("OwnerName :" + tcar.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						default:
							System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
						}
						break;

					default:
						System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
					}
					break;

				case 4:
					System.out.println("You have selected Six Wheeler");
					System.out.println("Select \n1.Truck \n2.Bus");
					int choice4 = sc.nextInt();

					switch (choice4) {
					case 1:
						System.out.println("You have selected Truck");
						System.out.println("Select \n1.Ashokleyland \n2.BharatBenz ");
						int truck = sc.nextInt();
						switch (truck) {
						case 1:
							System.out.println("You have selected Ashokleyland");
							Ashokleyland altruck = new Ashokleyland();
							altruck.update();
							System.out.println("Segment: " + altruck.category);
							System.out.println("Subcategory: " + altruck.subcategory);
							System.out.println("Brand Name: " + altruck.brand);
							System.out.println("Model Name: " + altruck.name);
							System.out.println("Colour Available: " + altruck.color);
							System.out.println("Price is Rs: " + altruck.price + "Lakhs");
							// System.out.println("Maxspeed: "+altruck.maxspeed+"km/hr");
							System.out.println("Fuel Capacity: " + altruck.fuel);
							// System.out.println("\n\n");
							altruck.testDrive();
							System.out.println("Enter 1 to Buy");
							int alt = sc.nextInt();
							switch (alt) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + altruck.hashCode());
								System.out.println("Congratulations for new " + altruck.name);
								altruck.setOwnerName(names);
								System.out.println("OwnerName :" + altruck.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \n Please enter valid input.");
							}
							break;

						case 2:
							System.out.println("You have selected BharatBenz");
							BharatBenz bbtruck = new BharatBenz();
							bbtruck.update();
							System.out.println("Segment: " + bbtruck.category);
							System.out.println("Subcategory: " + bbtruck.subcategory);
							System.out.println("Brand Name: " + bbtruck.brand);
							System.out.println("Model Name: " + bbtruck.name);
							System.out.println("Colour Available: " + bbtruck.color);
							System.out.println("Price is Rs: " + bbtruck.price + "Lakhs");
							// System.out.println("maxspeed: "+bbtruck.maxspeed+"km/hr");
							System.out.println("Fuel Capacity : " + bbtruck.fuel);
							// System.out.println("\n\n");
							bbtruck.testDrive();
							System.out.println("Enter 1 to Buy");
							int bbt = sc.nextInt();
							switch (bbt) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + bbtruck.hashCode());
								System.out.println("Congratulations for new " + bbtruck.name);
								bbtruck.setOwnerName(names);
								System.out.println("OwnerName :" + bbtruck.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \n Please enter valid input.");
							}
							break;

						default:
							System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
						}
						break;

					case 2:
						System.out.println("You have selected Bus");
						System.out.println("Select \n1.Volvo \n2.Eicher ");
						int bus = sc.nextInt();
						switch (bus) {
						case 1:
							System.out.println("You have selected Volvo");
							Volvo vlbus = new Volvo();
							vlbus.update();
							System.out.println("Segment: " + vlbus.category);
							System.out.println("Subcategory: " + vlbus.subcategory);
							System.out.println("Brand Name: " + vlbus.brand);
							System.out.println("Model Name: " + vlbus.name);
							System.out.println("Colour Available: " + vlbus.color);
							System.out.println("Price is Rs: " + vlbus.price + "Lakhs");
							// System.out.println("Maxspeed: "+vlbus.maxspeed+"km/hr");
							System.out.println("Fuel Capacity: " + vlbus.fuel);
							// System.out.println("\n\n");
							vlbus.testDrive();
							System.out.println("Enter 1 to Buy");
							int vlb = sc.nextInt();
							switch (vlb) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + vlbus.hashCode());
								System.out.println("Congratulations for new " + vlbus.name);
								vlbus.setOwnerName(names);
								System.out.println("OwnerName :" + vlbus.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
							}
							break;

						case 2:
							System.out.println("You have selected Eicher");
							Eicher ebus = new Eicher();
							ebus.update();
							System.out.println("Segment: " + ebus.category);
							System.out.println("Subcategory: " + ebus.subcategory);
							System.out.println("Brand Name: " + ebus.brand);
							System.out.println("Model Name: " + ebus.name);
							System.out.println("Colour Available: " + ebus.color);
							System.out.println("Price is Rs: " + ebus.price + "Lakhs");
							// System.out.println("Maxspeed: "+ebus.maxspeed+"km/hr");
							System.out.println("Fuel Capacity: " + ebus.fuel);
							// System.out.println("\n\n");
							ebus.testDrive();
							System.out.println("Enter 1 to Buy");
							int eb = sc.nextInt();
							switch (eb) {
							case 1:
								System.out.print("Debit card no :");
								long debit = sc.nextLong();
								System.out.println("Transaction is successfull");
								System.out.println("Transaction no :" + ebus.hashCode());
								System.out.println("Congratulations for new " + ebus.name);
								ebus.setOwnerName(names);
								System.out.println("OwnerName :" + ebus.getOwnerName());
								break;

							default:
								System.out.println("You have entered invalid input!!! \n Please enter valid input.");
							}
							break;

						default:
							System.out.println("You have entered invalid input!!! \n Please enter valid input.");
						}

						break;

					default:
						System.out.println("You have entered invalid input!!! \nPlease enter valid input.");
					}
					break;

				default:
					System.out.println("You have entered invalid input!!! \nPlease enter valid input");

				}

			}
		} else {
			System.out.println("Plz enter valid password");

		}

	}

}
