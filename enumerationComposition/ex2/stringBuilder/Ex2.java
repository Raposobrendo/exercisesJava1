package ex2.stringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] Args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow, thats's awesome!");
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"),
				"Travelling to New Zealand",
				"I'm going to visit this wonderful country!",
				12				
				);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the 4th ber with you");
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"See you tomorrow",
				5
				);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p2);
	}
}
