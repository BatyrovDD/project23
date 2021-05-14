package Laba2; //����� Java �������

//����������� ����������

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //���������� ��� ������� ���������
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)

public class subversion {
	private String text = "";
	public subversion() {
	JFrame main_GUI = new JFrame("subversion");	//�������� ������������ ����
	main_GUI.setTitle ("����� (23 �������)");
	main_GUI.setBounds(300,100,500,420);
	main_GUI.setResizable(false); //������������� ������ ����
	
	
    Image logo = new Image();
    
	JPanel main_panel = new JPanel(); //������ - ������������ ��� ����������� ����������� � ����
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	JLabel laba_info = new JLabel("������������ ������ �4"); //����������� ������ ��� �����������
	laba_info.setBounds(150,3,150,30);
	main_panel.add(laba_info);
	JLabel usatu = new JLabel("�������� ��������������� ����������� ����������� �����������"); //����������� ������
	usatu.setBounds(35,15,500,30);
	main_panel.add(usatu); 
	
	
	JButton button_exit = new JButton("�����"); //��������� ������ �� ����
	button_exit.setBounds(380, 230, 90, 40);
	ActionListener actionListener = new ListenerButton(); //������� ���������
	button_exit.addActionListener(actionListener); //��������� ��������� � ������
	main_panel.add(button_exit);
	
	JButton button_info = new JButton("����������"); // ��������� ������ ����������
	button_info.setBounds(15,230,110,40);
	main_panel.add(button_info);
	button_info.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(main_GUI, text + "��������� ���������: ������� 15.05.21 ����� ��������� - 19130633\n"
			+ "1-� �������� ���������: ��������� 15.05.21 ������ �������� - 19130639\n"
			+ "2-� �������� ���������: ������� 15.05.21 ����� ���������� - 19130620\n"
			+ "3-� �������� ���������: �������� ������ �������������� - 19130635","������ � ����������", -1); }
	});
	
	
	
	//�����
	
	JLabel calclable = new JLabel("������ ������������� � ���������� �����������");
	calclable.setBounds(15, 270, 500, 40);
	main_panel.add(calclable);
	JLabel calclable2 = new JLabel("������� �������, ����� ������� �� ������ �������, ��� ����������:");
	calclable2.setBounds(15, 285, 500, 40);
	main_panel.add(calclable2);
	JLabel a = new JLabel("�����:");
	a.setBounds(15, 315, 50, 40);
	main_panel.add(a);
	JLabel b = new JLabel("������:");
	b.setBounds(155, 315, 50, 40);
	main_panel.add(b);
	JLabel c = new JLabel("������:");
	c.setBounds(305, 315, 500, 40);
	main_panel.add(c);
	JLabel cm1 = new JLabel("��");
	cm1.setBounds(110, 315, 50, 40);
	main_panel.add(cm1);
	JLabel cm2 = new JLabel("��");
	cm2.setBounds(255, 315, 50, 40);
	main_panel.add(cm2);
	JLabel cm3 = new JLabel("��");
	cm3.setBounds(405, 315, 50, 40);	
	main_panel.add(cm3);
	
	//���� ��������� ���� ��� �����
	JTextArea aTextArea = new JTextArea(""); // ���� ��� ����� �������� a
	aTextArea.setBounds(58, 330, 50, 15);
	main_panel.add(aTextArea);
	JTextArea bTextArea = new JTextArea(""); // ���� ��� ����� �������� b
	bTextArea.setBounds(204, 330, 50, 15);
	main_panel.add(bTextArea);
	JTextArea cTextArea = new JTextArea(""); // ���� ��� ����� �������� c
	cTextArea.setBounds(355, 330, 50, 15);
	main_panel.add(cTextArea);
	
// ������
	
	JButton button_math = new JButton("���������"); //��������� ������ �� ����
	button_math.setBounds(135, 230, 100, 40);
	main_panel.add(button_math);
	button_math.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent eror) {
		// �������� �� ���� ������������ �������� � ����� ������ ������������ 
		int a, b, c;
		try {
		a = Integer.parseInt(aTextArea.getText());
		b = Integer.parseInt(bTextArea.getText());
		c = Integer.parseInt(cTextArea.getText());
		} catch (Exception errors) {
		JOptionPane.showMessageDialog(null, "������� ���������� �������� ������!\n "
		+ "\n����������� �������� �����: 1 ��\n������������ �������� �����: 1290 ��"
		+ "\n����������� �������� ������: 1 ��\n������������ �������� �����: 1290 c�"
		+ "\n����������� �������� ������: 1 ��\n������������ �������� ������: 1290 c�");
		}
		
		// �������� �� ���� ����������� � ����� ������ ������������ 
		a = Integer.parseInt(aTextArea.getText());
		b = Integer.parseInt(bTextArea.getText());
		c = Integer.parseInt(cTextArea.getText());
		if (a > 1290 || a < 1 || b > 1290 || b < 1 || c > 1290 || c < 1) {
		JOptionPane.showMessageDialog(null, "������� ���������� �������� ������!\n "
		+ "\n����������� �������� �����: 1 ��\n������������ �������� �����: 1290 ��"
		+ "\n����������� �������� ������: 1 ��\n������������ �������� �����: 1290 c�"
		+ "\n����������� �������� ������: 1 ��\n������������ �������� ������: 1290 c�");
		return;
		}
		int d = Calculator.getResult(a, b, c);
		JOptionPane.showMessageDialog(main_GUI, "����� �������������: " + d + " ��^3");
		}
	});	
	
	String[] transfer = { //���������� �������
	        "����������� ������� ����� � ������� ������ ����",
	        "����������� ������� ����� � ��������",
	        "����������� ������� ����� � ������� ����� ����",
	        "������������� ������ � �������23"
	    };
	JComboBox<Object> dram = new JComboBox<Object>(transfer); //���������� ������� ����������
	ActionListener dramaTransfer = new ActionListener() { //�������� ���������
	    public void actionPerformed(ActionEvent e) {
	                String choice = (String)dram.getSelectedItem();
	                switch (choice) {
	                //����������� �����������
	                case "����������� ������� ����� � ������� ������ ����":  logo.setLocation(270, 52);
	                break;
	                case "����������� ������� ����� � ��������":  logo.setLocation(140, 52);
	                break;
	                case "����������� ������� ����� � ������� ����� ����":  logo.setLocation(0, 52);
	                break;
	                case "������������� ������ � �������23":
	                	FiveElements n = new FiveElements();
		                int[] u = new int[n.odnomerniyMassiv.length];
		                for (int i = 0; i < n.odnomerniyMassiv.length; i++) {
		                u[i] = n.odnomerniyMassiv[i];
		                }
		                SortBuble.sortbuble(u);
	                }
	                
	    }
	};
	        dram.addActionListener(dramaTransfer); //���������� ��������� � ����������
	        dram.setBounds(15,170,453,50); //����������� �������� ���� combobox
	        main_panel.add(dram); //���������� combobox �� ������

	    //���������� ������ "����"
	    JMenuBar menu_bar= new JMenuBar();
        JMenu menu= new JMenu("����");
        menu_bar.add (menu);
        
        //���������� ������ "������� �����" (�������� ����������� �� ���� "Using subversion for developers")
        JMenuItem menu1=new JMenuItem("������� �����");
        menu1.addActionListener(new ActionListener() {
        	
        public void actionPerformed (ActionEvent event) {
        logo.setSize(500, 500);
        logo.setLocation(270, 52); //����������� ���������� �����������
        main_panel.add(logo);
        main_panel.setVisible(false);
        main_panel.setVisible(true);
        }
        });
        menu.add(menu1);        
        
        JMenuItem menu3 = new JMenuItem("��������� ���� � ������23");// ������� ����� ������
        menu3.addActionListener(new ListenerButton() {
        @Override
        public void actionPerformed(ActionEvent e) {
        text = "";
        JFileChooser fileopen = new JFileChooser();
        int ret = fileopen.showDialog(null, "������� ����");
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
        
        //���������� ������ "�����" � ������� ����
        JMenuItem menu2=new JMenuItem("�����");
        ActionListener actionListener2 = new ListenerButton(); //������� ���������
        menu2.addActionListener(actionListener2); //��������� ��������� � ������
        menu.add(menu2);            
        main_GUI.setJMenuBar (menu_bar);
        main_GUI.setVisible(true);
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);} //�������� ���� JFrame � �������� Java

	public static void main(String[] args) {
		new subversion();
	}
}
