package Laba2; //����� Java �������

//����������� ����������
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JComponent;


//��������� �����
public class Image extends JComponent{
    BufferedImage image;
    
    public Image(){
        try{
            image= ImageIO.read(new URL("http://xn--e1afhkfagivn.xn--p1ai/media/foto/logo.jpg")); //������������ ����������� �������� �����
        }
        catch (IOException ugatu) {
            ugatu.printStackTrace();
        }
    }
   
    public void paint(Graphics ugatu2){
   	 if(image==null) return;
        ugatu2.drawImage(image,0, 0,210,110, null);
    }
}