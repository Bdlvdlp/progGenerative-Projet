public class ExempleParallele {
	
	public static void main(String[] argv) {
		int a = 10;
		Calcul calc = new Calcul();
		Logger log = new Logger();

		int[] res1 = new int[1];
		int[] res2 = new int[1];
		Thread thread1 = new Thread(() -> {
			res1[0] = calc.square(a);

		});
		Thread thread2 = new Thread(() -> {
			res2[0] = calc.factorial(a);

		});
		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.printValue(res1[0]);
		log.printValue(res2[0]);

	}
}
