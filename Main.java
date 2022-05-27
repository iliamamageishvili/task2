
public class Main {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle();
		Rectangle rec3 = null;
//	System.out.println(rec3.area()); აბრუნებს nullpointexceptions;
		
//	System.out.println(rec1.getHeight()); აბრუნებს 0.0ს ფლოატის შემთხვევაში;
		
	System.out.println(rec1 == rec2); // აბრუნებს flase რადგან ობიექტები მეხსიერების სხვადასხვა ადგილებში არიან;
	rec1=rec2;
	System.out.println(rec1 == rec2); // ამ შემთხვევაში აბრუნებს trues რადგან ობიექტები მხსიერების ერთ ადგილზე არიან;
	rec1.setHeight(12);	
	
	System.out.println(rec2.getHeight());
// როგორც ვიცით თავიდან rec2 ის სიმაღლე იყო 0,0 და როდესაც rec1 ის სიმაღლე გახდა 12 შესაბამისად rec2 ის სიმაღლეც გახდა 12;	
		
	}

}
