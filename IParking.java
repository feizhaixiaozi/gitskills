package interfacec;

import java.util.ArrayList;
import java.util.Scanner;

public interface IParking {
	public void print();
	public boolean addCar(int carType);
	public static IParams parse() throws Exception{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String e=sc.nextLine();
		int b=2;
		int a=1;
		int c=3;
		class parses  implements IParams{
			public int getBig() {
				return a;
			}
			public int getMedium() {
				return b;
			}
			public int getSmall() {
				return c;
			}
			public ArrayList<Integer> getPlanParking(){
				ArrayList<Integer> list =new ArrayList<Integer>();
				while(sc.hasNext()) {
					int d=sc.nextInt();
					list.add(d);
				}
				return list;
			}
		}
		IParams iparams=new parses();
		sc.close();
		return iparams;
	}
}
