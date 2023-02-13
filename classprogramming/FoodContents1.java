package classprogramming;

import java.util.Scanner;

import java.util.Scanner;

class Food {
	public String foodName;
	public String content1;
	public int w1;

	Food(String foodName, String content1, int w1) {
		this.foodName = foodName;
		this.content1 = content1;
		this.w1 = w1;
	}

	void addContent(String content2, int w2) {
		content1 += " " + content2;
		w1 += w2;
	}

	void printInfo() {
		System.out.println(foodName);
		System.out.println(w1);
		System.out.println(content1);
	}
}

public class FoodContents1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String foodName = scan.next();
		String content1 = scan.next();
		int w1 = scan.nextInt();
		Food f = new Food(foodName, content1, w1);

		int q = scan.nextInt();

		while (q != 0) {
			if (q == 1) {
				f.printInfo();
			} else if (q == 2) {
				content1 = scan.next();
				w1 = scan.nextInt();
				f.addContent(content1, w1);
			}
			q = scan.nextInt();
		}
	}
}
