package _02_nested_loops._3_for_loop_gauntlet;

public class NestedLoops {
	public static void main(String[] args) {
		//			for (int i = 0; i< 101; i++) {
		//				System.out.println(i);
		//			}
		//			for (int i = 100; i> -1; i--) {
		//				System.out.println(i);
		//			}
		//			for (int i = 0; i < 101; i++) {
		//				if (i%2==0) {
		//					System.out.println(i);
		//				}
		//				else if (i%2==1) {
		//					System.out.println(i);
		//				}
		//			for (int i = 1; i<501; i++) {
		//				if (i%2==0) {
		//					System.out.println(i +" is even");
		//				}
		//				else {
		//					System.out.println(i +" is odd");
		//				}
		//			}
		//			for (int i =0; i < 778; i+=7) {
		//				System.out.println(i);
		//			}
		//			for (int i= 0; i< 3;i++) {
		//				for (int b= 0; b<3;b++) {
		//					System.out.println(i + " " + b);
		//				}
		//			}
		//			for (int i = 1; i< 10;i++) {
		//				if (i%3==0) {
		//					System.out.println(i);
		//				}
		//				else {
		//					System.out.print(i+" ");
		//				}
		//				}
		//			for (int i = 1 ;i< 101;i++) {
		//				if (i%10==0) {
		//					System.out.println(i);
		//				}	
		//				else {
		//					System.out.print(i +" ");
		//				}
		//				}

		//			for (int i =1; i<=3;i++) {
		//				for (int b =1; b<= 3;b++) {
		//					if (b==3) {
		//						System.out.println(b*i);
		//					}
		//					else {
		//						System.out.print(b*i + " ");
		//					}
		//					}
		for (int i = 1; i<7; i++) {
			for (int b = 0; b<i; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


