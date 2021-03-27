	package Laba2;//пакет Java классов
//»мпортируем библиотеки

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ќбъ€вл€ем класс
public class Calculator implements ActionListener {
	protected static int getResult(int a, int b, int c) {
		return (a * b * c);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}		
}