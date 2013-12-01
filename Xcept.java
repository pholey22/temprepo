import java.util.Scanner;

class numberRangeException extends Exception{

	String message;

	numberRangeException(){
		message = new String("Number out of range");
	}
}



class Xcept {

	public static void main(String [] args){

	Scanner test = new Scanner(System.in);
	try{
		System.out.print("Enter a number: ");

		int x =  test.nextInt();

		if(x <= 0){

			throw new numberRangeException();
		}

		System.out.print(x);

		}

	catch(numberRangeException excep){

		excep.printStackTrace();


		}

	catch(Exception excep){

		excep.printStackTrace();
	}

	}
}