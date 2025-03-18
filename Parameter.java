package Practice;


public class Parameter {
	int studId;
	String studName;
	String studCourse;
	int studFees;
	String studGender;
	Parameter(int Id,String Name,String Course,int Fees,String Gender)
	{
		studId=Id;
		studName=Name;
		studCourse=Course;
		studFees=Fees;
	    studGender=Gender;
	}
	public static void main(String[]args) {
		Parameter myobj=new Parameter(1,"Ravi","Full stack java",40000,"Male");
		Parameter myobj1=new Parameter(2,"sanjay","Full stack java",40000,"Male");
		System.out.println(myobj.studId);
		System.out.println(myobj.studName);
		System.out.println(myobj.studCourse);
		System.out.println(myobj.studFees);
		System.out.println(myobj.studGender);
		System.out.println(myobj1.studId);
		System.out.println(myobj1.studName);
		System.out.println(myobj1.studCourse);
		System.out.println(myobj1.studFees);
		System.out.println(myobj1.studGender);
	}


}
