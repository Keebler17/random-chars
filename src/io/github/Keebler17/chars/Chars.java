package io.github.Keebler17.chars;

import java.util.Random;

public class Chars {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Generates random characters, in range of ASCII 33-127 (Not sure if 127 works).\nUsage: chars [int]");
			System.exit(0);
		} else {
			try {
				Random r = new Random();
				int length = Integer.valueOf(args[0]);
				char chars[] = new char[length];
				
				int random = 0;

				for(int i = length-1; i >= 0; i--) {
					// Generate random number in range of ASCII numbers
					while(random < 33 && random != 127) {
						random = r.nextInt(127);
					}
					
					chars[i] = (char)random;
					random = 0;
				}
				System.out.println(chars);
				System.exit(0);
				
				System.exit(0);
			} catch(Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
		}
	}
}
;