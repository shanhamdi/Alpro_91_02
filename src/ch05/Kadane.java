package ch05;
class Kadane
{
	public static void main(String[] args)
	{
		int[] array = { 82, 12 };

		int nilaimax = 0;
		int maxterakhir = 0;
		for (int i: array)
		{
			maxterakhir = maxterakhir + i;
			maxterakhir = Integer.max(maxterakhir, 0);
			nilaimax = Integer.max(nilaimax, maxterakhir);
		}

		System.out.println("Nilai Maximum " +
							nilaimax);
	}
