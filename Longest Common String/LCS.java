import java.util.Scanner;

class LCS {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string of letters: ");
		String a = in.nextLine();
		System.out.println("Enter another string of letters: ");
		String b = in.nextLine();

		int M = a.length();
		int N = b.length();

		
		int [][] l = new int[M+1][N+1];
		
		for (int i = M-1; i >= 0; i--) {
			for(int j = N-1; j >= 0; j--) {
				if(a.charAt(i) == b.charAt(j))
					l[i][j] = l[i+1][j+1] + 1;
				else {
					l[i][j] = Math.max(l[i+1][j], l[i][j+1]);
				}
			}
		}
		int i = 0, j = 0;
		while(i < M && j < N) {
            if (a.charAt(i) == b.charAt(j)) {
                System.out.print(a.charAt(i));
                i++;
                j++;
            }
            else if (l[i+1][j] >= l[i][j+1]) 
            	i++;
            else  
            	j++;
        }
        System.out.println();
	}
}

