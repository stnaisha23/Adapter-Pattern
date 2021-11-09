class KucingAdapter implements Bebek
{
	// You need to implement the interface your
	// client expects to use.
	Kucing meow;
	public KucingAdapter(Kucing meow)
	{
		// we need reference to the object we
		// are adapting
		this.meow = meow;
	}

	public void kwek()
	{
		// translate the methods appropriately
		meow.makeSound();
	}
}