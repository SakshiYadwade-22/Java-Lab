	class Mobile
	{
		String brand;
		int price;
		static String name;
	void show()
		{
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Name: "+name);
		}
	}
	class Demo
	{	
		public static void main(String[]args)
	{
	Mobile m1=new Mobile();
	Mobile m2=new Mobile();
	m1.brand="apple";
	m1.price=100000;
	m1.name="iphone";
	
	m2.brand="samsung";
	m2.price=75000;
	m2.name="android";

	m1.name="Smartphone";
	m1.show();
	m2.show();
}
}
