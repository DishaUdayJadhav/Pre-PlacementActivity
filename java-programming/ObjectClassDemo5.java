class Student implements Cloneable
{
    public String Name;
    public int Rno;
    public int Marks;


    public Student(String str , int A ,int B)
    {
        System.out.println("Inside Constructor");
        this.Name = str;
        this.Rno = A;
        this.Marks = B;
    }

    //sobj1.equals(sobj2)
    public boolean equals(Student obj)
    {
        if( (this.Marks == obj.Marks) && ( (this.Name).equals(obj.Name) ) )
        {
             return true;
        }
        else
        {
            return false;
        }     
       
    }

}
class ObjectClassDemo5
{
    public static void main(String A[]) 
    {
        Student sobj1 = new Student("Sagar",11 , 89);
        Student sobj2 = new Student("Sagar",11 , 89);

        if(sobj1.equals(sobj2) == true)
        {
            System.out.println("Objects are equal");
        }
        else
        {
            System.out.println("objects are Different");
        }
    
      
    }
}
