class Towers {
	private int Disks;
	public Towers(int Disks) {
		this.Disks = Disks;
	}
	public void solve() {
		move(Disks,1,3,2);
	}
	public void move(int n, int source, int dest, int aux) {
		if(n>0) {
			move(n-1, source, aux, dest);
			System.out.println("Move disk from " + source + "to " + dest);
			move(n-1, aux, dest, source);
		}
	}
}