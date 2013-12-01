import java.util.Random;
class ArrayRunner {

	public static void main(String []args){




		double x = Math.abs(7.5);// returns 7.5
		double y = Math.floor(7.5); // returns just 7
		double z = Math.ceil(7.5); //returns 0.0
		double x1 = Math.abs(-6.4); //returns 6.4  which is the absolute value
		double y1 = Math.ceil(-6.4);// returns -6.0 the next highest integral
		double fin = Math.ceil( -Math.abs( -8 + Math.floor( -5.5 ) ) ); //-14 like it should


		System.out.print(x+ " "+y +" "+z+" "+x1+" "+y1 +" "+fin);

		Random maker = new Random();

		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("1 <= n <=2: "+ (maker.nextFloat() + 1));
		System.out.println("1 <= n <=100: "+(maker.nextInt(100 -1 +1)+1));
		System.out.println("0 <= n <=9: "+ (maker.nextInt(9)));
		System.out.println("1000 <= n <= 1112: "+(maker.nextInt(1112-1000+1)+1000));
		System.out.println("-3 <= n <= 11: " + (maker.nextInt(11 - (-3) + 1) + (-3)));



	}

}