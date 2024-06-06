import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	static Category[] categories = new Category[100];
	static int currentIndex = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số lượng muốn thêm: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			categories[currentIndex] = new Category();
			categories[currentIndex].inputData(sc, categories, currentIndex);
			currentIndex++;
		}

		for (int i = 0; i < currentIndex; i++) {
			categories[i].displayData();
		}
		
//		Date now = new Date();
//		LocalDate date = now.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//		int year = date.getYear();
//		System.out.println(year);
	}
}