/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pantallacarga;

import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class PantallaCargandoMain {

  PantallaCargando screen;

  public PantallaCargandoMain() {
    inicioPantalla();
	screen.velocidadDeCarga();
  }

  private void inicioPantalla() {
//    ImageIcon myImage = new ImageIcon("imagen/java.gif");
    ImageIcon myImage = new ImageIcon("src/img/Portada.png");
    screen = new PantallaCargando(myImage);
    screen.setLocationRelativeTo(null);
    screen.setProgresoMax(100);
    screen.setVisible(true);
  }

  public static void main(String[] args)
  {
    new PantallaCargandoMain();
  }
}
