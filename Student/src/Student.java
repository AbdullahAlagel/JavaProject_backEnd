
public class Student {

	private String name ;  //Name Of Student
	private int id ;    //id insert to the Student 
	private String major ;  
	private int age; 
	private float GPA;  // GPA in float Number 
	
	public Student() 
	{   this.id=0;
		this.name="None";
		this.major="None";
		this.age=0;
		this.GPA=0.0f;
		
	}
	
	 /*
	  * p : which mean Parameter 
	  * id= pid ,name=pname ,major=pmajor,age=page,GPA=pGPA.
	  */
	public Student (String pname ,int pid , String pmajor , int page ,float pGPA)
	{
		this.name =pname ; 
		this.id = pid;
		this.major = pmajor ;
		this.age=page;
		this.GPA=pGPA;
	}
	
	public Student (String pname) {
		this.id=0;
		this.name=pname;
		this.major ="None";
		this.age=0;
		this.GPA=0;
		
		
	}
	/*
	 * Change Student ID 
	 *  pid : Student ID 
     */
	public void setID(int pid)
	{
		this.id=pid ;
	}
	/*
	 * Get the current Student ID
	 */
	public int getID()
	{
		return this.id;
	}
	/*
	 * Change Student Name  
	 * pname : Student Name */
	public void setName(String pname)
	{
		this.name=pname;
	}
	/*
	 * Get the current Name of Student 
	 *  */
	public String getName()
	{
		return this.name;
	}
	public void setAge(int page)
	{
		 this.age=page;
	}
	public int getAge()
	{
		return this.age;
	}
	
	public void setMajor(String pmajor)
	{
		this.major=pmajor;
	}
	public String getMajor()
	{
		return this.major;
	}
	
	public void setGPA(int pGPA)
	{
		 this.GPA=pGPA;
	}
	public float getGPA()
	{
		return this.GPA;
	}
	
	
	public void printStudentInfo() 
	{ 
		System.out.println("\n  --- Information  --- \n ( ID : " + this.id  + ")" +"Name is : " + this.name.toUpperCase()  );
		System.out.println("Age is :" +this.age);
		System.out.println("The Major is :" + this.major);
		System.out.println("The GPA is :"  + this.GPA);
	}
}
