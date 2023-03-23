package eserWeek2Day3;

public class ArrayCalculator implements Runnable {
	
	private int[] array;
	
	private int tot = 0;
	
	public ArrayCalculator(int[] a) {
		this.array = a;
	}

	@Override
	public void run() {
		this.totale();
	}
	
	private void totale() {
		int tot = 0;
		for(int i = 0; i < array.length; i++) {
			tot += array[i];
		}
		
		this.tot = tot;
//		return tot;
	}
	
	public int getTotale() {
		return this.tot;
	}

}