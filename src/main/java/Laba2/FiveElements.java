package Laba2;

import java.awt.Component;
import java.util.Arrays;

import javax.swing.JOptionPane;

//����� ��� ������� ������������
public class FiveElements {


		public static int[] odnomerniyMassiv;

		public FiveElements() {
			odnomerniyMassiv = new int[5];

		for(int i = 0; i < 5; i++) {

			odnomerniyMassiv[i] = GenerateRandomNumbers.Rnd();
			System.out.println(odnomerniyMassiv[i]);
			Component frame = null;
			JOptionPane.showMessageDialog(frame, odnomerniyMassiv[i]); 
		}


		}

		}