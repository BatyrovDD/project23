package Laba2;


public class GenerateRandomNumbers {

		public static int Rnd(){
		int a = 100; // �� 100
		int b = 201; // �� 200

		int randomno = a + (int) (Math.random() * (b-a)); // �������� ������� ��������

		return randomno;
		}
		}

