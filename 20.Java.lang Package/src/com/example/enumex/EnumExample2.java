package com.example.enumex;
enum NewDept
{
	CS("Chinmay","Block A"),IT("Sai","Block B"),CIVIL("George","Block C"),ECE("Chinmay Sai","Block D");

	private String head;
    private String location;
	NewDept(String head, String location) {

		this.head=head;
		this.location=location;
	}
	public void display()
	{
		System.out.println(this.name()+"->"+this.ordinal());
	}
	public String getHead() {
		return head;
	}
	public String getLocation() {
		return location;
	}
}
public class EnumExample2 {

	public static void main(String[] args) {
		NewDept dt=NewDept.IT;
        System.out.println(dt.getHead()+" "+dt.getLocation());
	}
	}	

