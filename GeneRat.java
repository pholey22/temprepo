import java.util.Random;
class GeneRat {

	public static void main(String [] args){

	Random	MyInt = new Random();


	for(int i = 0; i <= 10; i++){
	System.out.println(1+MyInt.nextInt(10));
	}
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");

	for(int i = 0; i <= 10; i++){
	System.out.println(MyInt.nextInt(20-3+1)+3);
	}

	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");

	for(int i = 0; i <= 10; i++){
	System.out.println(MyInt.nextInt(60-40+1)+40);
	}


	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");

	for(int i = 0; i <= 10; i++){
	System.out.println(MyInt.nextInt(70-7+1)+7);
	}


	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");


	for(int i = 0; i <= 10; i++){
	System.out.println(MyInt.nextInt(20-11+1)+11);
	}

	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");

	for(int i = 0; i <= 10; i++){
	System.out.println(MyInt.nextInt(900-90+1)+90);
	}

	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");

	for(int i = 0; i <= 10; i++){
	System.out.println(MyInt.nextInt(150-100+1)+100);
	}

	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");

	for(int i = 0; i <= 10; i++){
	System.out.println(MyInt.nextInt(500-300+1)+300);
	}

	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");

	for(int i = 0; i <= 10; i++){
	System.out.println(MyInt.nextInt(113-9+1)+9);
	}

	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");

	for(int i = 0; i <= 10; i++){
	System.out.println(MyInt.nextInt(8-(-8)+1)+(-8));
	}


	}
}