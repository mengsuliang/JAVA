package bbo;

public class goldTower {

	public static void main(String[] args) {
		int lay = 4;
		int i,j;
		
		for(i = 1;i <= lay;i++) {
			for(j=1;j <= i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
