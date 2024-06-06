import java.util.Scanner;

public class Category {
	private int id;
	private String name;
	
	public Category() {
	}
	
	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void inputData(Scanner scanner, Category[] categories, int currentIndex) {
		idAutoIncrement(categories, currentIndex);
	}
	
	public void idAutoIncrement(Category[] categories, int currentIndex) {
		// [1,2,...]
		int maxId = 0;
		for (int i = 0; i < currentIndex; i++) {
			if (maxId < categories[i].getId()) {
				maxId = categories[i].getId();
			}
		}
		this.id = maxId + 1;
	}
	
	public void displayData() {
		System.out.println("[ID: " + this.id + " | Name: " + this.name + " ]");
	}
}
