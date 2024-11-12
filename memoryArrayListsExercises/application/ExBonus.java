package application;

import java.util.Locale;
import java.util.Scanner;

import entities2.Rooms;

public class ExBonus {
	public static void main(String[] Args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input quantity rooms to be rented (maximum 10). Input name, email and room to get in: ");
		int quantity = sc.nextInt();
		Rooms[] rooms = new Rooms[10];
		
		for(int i = 0; i < quantity; i++) {
			System.out.printf("Rent #%d\n", (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			while(rooms[room-1] != null) {
				System.out.print("Room occupied, choose another: ");
				room = sc.nextInt();
				while(room < 1 || room > 10) {
					System.out.print("Choose a room from 1 to 10:  ");
					room = sc.nextInt();
				}
			}
			rooms[room-1] = new Rooms(name, email, room);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.println(rooms[i]);
			}
		}
				
		sc.close();
	}
}
