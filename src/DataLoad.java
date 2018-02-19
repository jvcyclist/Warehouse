import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DataLoad {
float stat;
String txtstat;




float getData() {

File file = new File("/home/patryk/eclipse-workspace/WareTest/src/database.txt");
Scanner read=null;
try {
	read = new Scanner(file);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
txtstat=read.nextLine();
stat=Float.parseFloat(txtstat);



read.close();
return stat;

}

void writeData(float num)
{PrintWriter write=null;
	
	try {
	write = new PrintWriter("/home/patryk/eclipse-workspace/WareTest/src/database.txt");
} catch (FileNotFoundException e) {
	e.printStackTrace();
}

write.print(num);
write.close();

}





	

	
	
}
