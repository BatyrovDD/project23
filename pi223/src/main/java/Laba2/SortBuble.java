package Laba2;
import java.awt.Component;
import java.util.Arrays;

import javax.swing.JOptionPane;
//создала класс для третьего разработчика
public class SortBuble {

		 public static void sortbuble(int[] mas) {
		       
		
		        boolean isSorted = false;
		        int bub;
		        while(!isSorted) {
		            isSorted = true;
		            for (int i = 0; i < mas.length-1; i++) {
		                if(mas[i] > mas[i+1]){
		                    isSorted = false;
		 
		                    bub = mas[i];
		                    mas[i] = mas[i+1];
		                    mas[i+1] = bub;
		                }
		            }
		        }
		        System.out.println(Arrays.toString(mas));
		        Component frame = null;
				JOptionPane.showMessageDialog(frame, Arrays.toString(mas)); 
		        
		    }
		}