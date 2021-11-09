// Java implementation of Adapter pattern
class Main
{
	public static void main(String args[])
	{
		Anggora agr = new Anggora();
		Bebek bebek = new BebekPutih();

		Bebek KucingAdapter = new KucingAdapter(agr);

		System.out.print("\nKucing Anggora : ");
		agr.makeSound();

		System.out.print("Bebek          : ");
		bebek.kwek();

		// Suara Bebek diubah menjadi suara Kucing
		System.out.print("Suara bebek menjadi : ");
		KucingAdapter.kwek();
        System.out.println("");
	}
}
