package kr.s19.object.array;

public class Book {
	//은닉화
	private String category;
	private String name;
	private int price;
	private double discount;
	
	public Book(){}   //얘를 통해서 들어오면 set,get 메서드가 필요하다. 
	//set과 get메서드가 표준화되어 있어 지원해줌..
	public Book(String category, String name,int price, double discount) {
		this.category=category;
		this.name=name;
		this.price=price;
		this.discount=discount;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
