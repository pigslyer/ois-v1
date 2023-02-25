public class Gravitacija
{
	private static final double M = 5.972E24;
	private static final double R = 6.371E6;
	private static final double G = 6.674E-11; 


	public static void main(String[] args)
	{
		
		System.out.println("OIS je zakon!");
	}

	private static double pospesek(double visina){
		return G*M/((R+visina)*(R+visina));
	}


}