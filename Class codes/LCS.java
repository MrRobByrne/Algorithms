class LCS {
	public static void main(String[] args) {
		String a = new String("robert");
		String b = new String("byrne");
		System.out.println("LCS: " + LCS(a,b));
	}
	public static int LCS(String a, String b) {
		int m = a.length();
		int n = b.length();
		int [][] l = new int[m+1][n+1];
		for(int i = 0; i<=m; i++)
			l[i][0] = 0;
		for(int j = 0; j<=n; j++)
			l[0][j] = 0;
		for (int i = 0; i<m; i++) {
			for(int j = 0; j<n; j++) {
				if(a.charAt(i) == b.charAt(j))
					l[i+1][j+1] = 1+l[i][j];
			else {
				l[i+1][j+1] = max(l[i+1][j], l[i][j+1]);
			}
			}
		}
		return l[m][n];
	}
	public static int max(int x, int y) {
		if(x>y)
			return x;
		else
			return y;
	}
}