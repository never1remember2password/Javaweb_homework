package hcl208;

public class People {
	private String name;
	private int age;	
	
    public People(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    public void setage(int age)
    {
        this.age=age;
    }
    public int getage()
    {
        return age;
    }
    public String toString(){
        return "name is:"+this.name+",age is:"+this.age;
    }

}
