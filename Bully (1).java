
import java.io.*;
import java.util.Scanner;

public class Bully {
	static int n;
	static int[] status = new int[100];
	static int[] priority = new int[100];
	static int coord;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of process");
		n = sc.nextInt();
		int i;
		for (i = 0; i < n; i++) {
			System.out.println("Enter the status for process " + (i + 1) + " :");
			status[i] = sc.nextInt();
			System.out.println("Enter the priority for process " + (i + 1) + " :");
			priority[i] = sc.nextInt();

		}

		System.out.println("Enter the process that will initiate election");
		int ele = sc.nextInt();

		electprocess(ele);
		System.out.println("The elected cordinate :" + coord);
	}

	private static void electprocess(int ele) {

		// TODO Auto-generated method stub
		
		ele = ele - 1;
		coord = ele + 1;
		for (int i = 0; i < n; i++) {
			if (priority[ele] < priority[i]) {
				System.out.println("Election message sent from " + (ele + 1) + "to" + (i + 1));
				if (status[i] == 1)
					System.out.println("Ok message sent from " + (i + 1) + "to" + (ele + 1));
				if (status[i] == 1)
					electprocess(i + 1);
			}
		}

	}
}

/*
Enter the number of process
7
Enter the status for process 1 :
1
Enter the priority for process 1 :
1
Enter the status for process 2 :
1
Enter the priority for process 2 :
2
Enter the status for process 3 :
1
Enter the priority for process 3 :
3
Enter the status for process 4 :
1
Enter the priority for process 4 :
4
Enter the status for process 5 :
1
Enter the priority for process 5 :
5
Enter the status for process 6 :
1
Enter the priority for process 6 :
6
Enter the status for process 7 :
0
Enter the priority for process 7 :
7
Enter the process that will initiate election
4
Election message sent from 4to5
Ok message sent from 5to4
Election message sent from 5to6
Ok message sent from 6to5
Election message sent from 6to7
Election message sent from 5to7
Election message sent from 4to6
Ok message sent from 6to4
Election message sent from 6to7
Election message sent from 4to7
The elected cordinate :6




*/
