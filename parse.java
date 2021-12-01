package ook;

import java.util.ArrayList;
import java.util.Scanner;

import interfacec.IParams;

public class parse {
	public static IParams parse() throws Exception{
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int a=sc.nextInt();
		int c=sc.nextInt();
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
