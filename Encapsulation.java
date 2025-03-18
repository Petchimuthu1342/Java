package Practice;
class Programmer {

	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
		private int age;
		public int getage()
		{
			return age;
		}
		public void setage(int age) {
			this.age=age;
		}
}
public class Encapsulation {

	public static void main(String[] args) {
		Programmer p=new Programmer();
		p.setName("Bairavaa");
		p.setage(22);
		System.out.println("Name is "+" "+p.getName());
		System.out.println("Age is "+" "+p.getage());
	}

}

