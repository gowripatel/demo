package firstt;

public class DemoPattern {

	void patternStar(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		DemoPattern d=new DemoPattern();
		
		d.patternStar(5);

	}

}
