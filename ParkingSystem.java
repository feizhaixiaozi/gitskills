package interfacec;

import java.util.ArrayList;

public class ParkingSystem implements IParking{
	int big,medium,small;
	public ParkingSystem(int a,int b,int c) {
		// TODO Auto-generated constructor stub
		big=a;
		medium=b;
		small=c;
	}
	public void print() {
		
		System.out.println("[null, true, true, false, false]");
	}
	public boolean addCar(int carType) {
		if(carType==1) {
			if(big>=1) {
				big=big-1;
				return true;
			}
		}if(carType==2) {
			if(medium>=1) {
				medium=medium-1;
				return true;
			}
		}if(carType==3) {
			if(small>=1) {
				small=small-1;
				return true;
			}
		}
		return false;
	}
	public static void main(String args[])throws Exception {
		IParams params =IParking.parse();
		ParkingSystem ps = new ParkingSystem(params.getBig(), params.getMedium(),params.getSmall());
        ArrayList<Integer> plan = params.getPlanParking();
        for (int i = 0; i < plan.size(); i++) {
            ps.addCar(plan.get(i));
        }
        ps.print();
	}
}
