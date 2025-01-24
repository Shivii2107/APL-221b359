public class LE0
{
	public static class Car
    	{
        	private int speed;
        	private String name;
        	public void set_speed(int s)
        	{
            		speed = s;
        	}
        	public void set_name(String n)
        	{
            		this.name = n;
        	}
        	public void get_speed()
        	{
            		if(speed<120)
                		System.out.println("Drive fast!! This is a no speed limit zone!!");
            		else
                		System.out.println("Speed of the car is " + speed + " Kmph.");
        	}
        	public void get_name()
        	{
            		System.out.println("Name of the car is " + name + ".");
        	}
        }
    	public static void main(String[] args) 
	{
    	    Car c1 = new Car();
    	    c1.set_speed(338);
    	    c1.set_name("BMW M4 Competition");
    	    c1.get_name();
    	    c1.get_speed();
	}
}