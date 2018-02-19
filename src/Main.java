import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choose=0;
		float value=0;
		Scanner scanner  =  new Scanner(System.in);
		DataLoad data = new DataLoad();
		
		
		Magazyn mag=new Magazyn(30,data.getData());
		
		
		while(choose!=4) {
		printMenu();
		
		choose = scanner.nextInt();
		
		switch (choose) {
		
		case 1:
		System.out.println("--Add ware-- Write number");
		value=scanner.nextFloat();
		mag.addTow(value);
		break;
		

		case 2:
		System.out.println("--Show number of ware in warehouse--");	
		mag.showStat();
		break;

		
		case 3:
		System.out.println("--Take ware to the shop--Write number");		
		value=scanner.nextFloat();
		mag.getTow(value);
		break;

		
		case 4:
		System.out.println("--Exit--");	
		data.writeData(mag.tow);
		break;
		
		default:
		System.out.println("Wrong command");
		break;
		}}
		scanner.close();
	}
		

	public static void printMenu() {
		System.out.println("Menu");
		System.out.println("1 - Add ware to the warehouse");
		System.out.println("2 - Show warehouse stats");
		System.out.println("3 - Take ware to the shop");
		System.out.println("4 - Exit");
	}
	
	

}
