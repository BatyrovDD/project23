package Laba2; //Пакет Java классов

//Импортируем библиотеки

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class subversion {
	private String text = "";
	public subversion() {
	JFrame main_GUI = new JFrame("subversion");	//Создание графического окна
	main_GUI.setTitle ("ООМиП (23 вариант)");
	main_GUI.setBounds(300,100,500,420);
	main_GUI.setResizable(false); //Фиксированный размер окна
	
    Image logo = new Image();
    
	JPanel main_panel = new JPanel(); //Панель - используется для организации компонентов в окне
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	JLabel laba_info = new JLabel("Лабораторная работа №4"); //Отображение текста или изображения
	laba_info.setBounds(150,3,150,30);
	main_panel.add(laba_info);
	JLabel usatu = new JLabel("Уфимский государственный авиационный технический университет"); //Отображение текста
	usatu.setBounds(35,15,500,30);
	main_panel.add(usatu); 
	
	JButton button_exit = new JButton("Выход"); //Добавляем кнопку на окно
	button_exit.setBounds(380, 230, 90, 40);
	ActionListener actionListener = new ListenerButton(); //Создаем слушатель
	button_exit.addActionListener(actionListener); //Добавляем слушатель к кнопке
	main_panel.add(button_exit);
	
	JButton button_info = new JButton("Информация"); // добавляем кнопку Информация
	button_info.setBounds(15,230,110,40);
	main_panel.add(button_info);
	button_info.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(main_GUI, text + "Модератор подгруппы: Батыров 15.05.21 Денис Дамирович - 19130633\n"
			+ "1-й участник подгруппы: Мингареев 15.05.21 Радмир Адикович - 19130639\n"
			+ "2-й участник подгруппы: Насыров 15.05.21 Аскар Русланович - 19130620\n"
			+ "3-й участник подгруппы: Погудина 20.05.21 Милена Константиновна - 19130635","Данные о участниках", -1); }
	});
	
	
	
	//Аскар
	
	JLabel calclable = new JLabel("Расчет параллепипида в кубических сантиметрах");
	calclable.setBounds(15, 270, 500, 40);
	main_panel.add(calclable);
	JLabel calclable2 = new JLabel("Введите стороны, затем нажмите на кнопку расчета, для вычесления:");
	calclable2.setBounds(15, 285, 500, 40);
	main_panel.add(calclable2);
	JLabel a = new JLabel("длина:");
	a.setBounds(15, 315, 50, 40);
	main_panel.add(a);
	JLabel b = new JLabel("ширина:");
	b.setBounds(155, 315, 50, 40);
	main_panel.add(b);
	JLabel c = new JLabel("высота:");
	c.setBounds(305, 315, 500, 40);
	main_panel.add(c);
	JLabel cm1 = new JLabel("см");
	cm1.setBounds(110, 315, 50, 40);
	main_panel.add(cm1);
	JLabel cm2 = new JLabel("см");
	cm2.setBounds(255, 315, 50, 40);
	main_panel.add(cm2);
	JLabel cm3 = new JLabel("см");
	cm3.setBounds(405, 315, 50, 40);	
	main_panel.add(cm3);
	
	//Были добавлены поле для ввода
	JTextArea aTextArea = new JTextArea(""); // Окно для ввода значения a
	aTextArea.setBounds(58, 330, 50, 15);
	main_panel.add(aTextArea);
	JTextArea bTextArea = new JTextArea(""); // Окно для ввода значения b
	bTextArea.setBounds(204, 330, 50, 15);
	main_panel.add(bTextArea);
	JTextArea cTextArea = new JTextArea(""); // Окно для ввода значения c
	cTextArea.setBounds(355, 330, 50, 15);
	main_panel.add(cTextArea);
	
// Милена
	
	JButton button_math = new JButton("Расчитать"); //Добавляем кнопку на окно
	button_math.setBounds(135, 230, 100, 40);
	main_panel.add(button_math);
	button_math.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent eror) {
		// Проверка на ввод некорректных символов и вывод ошибки пользователю 
		int a, b, c;
		try {
		a = Integer.parseInt(aTextArea.getText());
		b = Integer.parseInt(bTextArea.getText());
		c = Integer.parseInt(cTextArea.getText());
		} catch (Exception errors) {
		JOptionPane.showMessageDialog(null, "Введите корректные значения сторон!\n "
		+ "\nМинимальное значение длина: 1 см\nМаксимальное значение длина: 1290 см"
		+ "\nМинимальное значение высота: 1 см\nМаксимальное значение длина: 1290 cм"
		+ "\nМинимальное значение высота: 1 см\nМаксимальное значение высота: 1290 cм");
		}
		
		// Проверка на ввод ограничений и вывод ошибки пользователю 
		a = Integer.parseInt(aTextArea.getText());
		b = Integer.parseInt(bTextArea.getText());
		c = Integer.parseInt(cTextArea.getText());
		if (a > 1290 || a < 1 || b > 1290 || b < 1 || c > 1290 || c < 1) {
		JOptionPane.showMessageDialog(null, "Введите корректные значения сторон!\n "
		+ "\nМинимальное значение длина: 1 см\nМаксимальное значение длина: 1290 см"
		+ "\nМинимальное значение высота: 1 см\nМаксимальное значение длина: 1290 cм"
		+ "\nМинимальное значение высота: 1 см\nМаксимальное значение высота: 1290 cм");
		return;
		}
		int d = Calculator.getResult(a, b, c);
		JOptionPane.showMessageDialog(main_GUI, "Объем параллепипида: " + d + " см^3");
		}
	});	
	
	String[] transfer = { //Добавление массива
	        "Переместить логотип УГАТУ в верхний правый угол",
	        "Переместить логотип УГАТУ в середину",
	        "Переместить логотип УГАТУ в верхний левый угол",
	        "Отсортировать данные в проекте23"
	    };
	JComboBox<Object> dram = new JComboBox<Object>(transfer); //Добавление объекта комбобокса
	ActionListener dramaTransfer = new ActionListener() { //Создание слушателя
	    public void actionPerformed(ActionEvent e) {
	                String choice = (String)dram.getSelectedItem();
	                switch (choice) {
	                //Перемещение изображения
	                case "Переместить логотип УГАТУ в верхний правый угол":  logo.setLocation(270, 52);
	                break;
	                case "Переместить логотип УГАТУ в середину":  logo.setLocation(140, 52);
	                break;
	                case "Переместить логотип УГАТУ в верхний левый угол":  logo.setLocation(0, 52);
	                break;
	                case "Отсортировать данные в проекте23":
	                	FiveElements n = new FiveElements();
		                int[] u = new int[n.odnomerniyMassiv.length];
		                for (int i = 0; i < n.odnomerniyMassiv.length; i++) {
		                u[i] = n.odnomerniyMassiv[i];
		                }
		                SortBuble.sortbuble(u);
	                }
	                
	    }
	};
	        dram.addActionListener(dramaTransfer); //Добавление слушателя к комбобоксу
	        dram.setBounds(15,170,453,50); //Выставление размеров окна combobox
	        main_panel.add(dram); //Добавление combobox на панель

	    //Добавдение кнопки "Меню"
	    JMenuBar menu_bar= new JMenuBar();
        JMenu menu= new JMenu("Меню");
        menu_bar.add (menu);
        
        //Добавдение кнопки "Логотип УГАТУ" (помещает изображение на окно "Using subversion for developers")
        JMenuItem menu1=new JMenuItem("Логотип УГАТУ");
        menu1.addActionListener(new ActionListener() {
        	
        public void actionPerformed (ActionEvent event) {
        logo.setSize(500, 500);
        logo.setLocation(270, 52); //Изначальное размещение изображение
        main_panel.add(logo);
        main_panel.setVisible(false);
        main_panel.setVisible(true);
        }
        });
        menu.add(menu1);        
        
        JMenuItem menu3 = new JMenuItem("Загрузить файл в проект23");// создаем новую кнопку
        menu3.addActionListener(new ListenerButton() {
        @Override
        public void actionPerformed(ActionEvent e) {
        text = "";
        JFileChooser fileopen = new JFileChooser();
        int ret = fileopen.showDialog(null, "Открыть файл");
        if (ret == JFileChooser.APPROVE_OPTION) {
        File file = fileopen.getSelectedFile();
        FileReader fr = null;
        BufferedReader br = null;
        try {
        fr = new FileReader(file);
        br = new BufferedReader(fr);
        } catch (FileNotFoundException e1) {
        e1.printStackTrace();
        }
        String line;
        try {
        while((line = br.readLine()) != null){
        text = text + line + "\n";
        }
        } catch (IOException e1) {
        e1.printStackTrace();
        }
        try {
        br.close();
        fr.close();
        } catch (IOException e1) {
        e1.printStackTrace();
        }
        }
        }
        });
        menu.add(menu3); 
        
        //Добавдение кнопки "Выход" в верхнее меню
        JMenuItem menu2=new JMenuItem("Выход");
        ActionListener actionListener2 = new ListenerButton(); //Создаем слушатель
        menu2.addActionListener(actionListener2); //Добавляем слушатель к кнопке
        menu.add(menu2);            
        main_GUI.setJMenuBar (menu_bar);
        main_GUI.setVisible(true);
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);} //Закрытие окна JFrame и процесса Java

	public static void main(String[] args) {
		new subversion();
	}
}
