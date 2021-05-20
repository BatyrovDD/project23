package Laba2;


public class GenerateRandomNumbers {

		public static int Rnd(){
		int a = 100; // От 100
		int b = 201; // До 200

		int randomno = a + (int) (Math.random() * (b-a)); // Создание первого элемента

		return randomno;
		}
		}

