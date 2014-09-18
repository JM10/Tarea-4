package Tarea4;
import java.awt.Color;
import java.awt.Graphics;

public class WallJump extends Circle {
	Color colorhoriz;
public WallJump(){
	size = 100;
	aceleracion=0.2f;
	colorhoriz = Color.RED;
}

public void DetectarPared(){
if(positionX+size > 800)
{
Rebotar();
CambiarColor();
}
}


public void Rebotar(){
velocityX = 10f;
}
public void CambiarColor()
{
colorhoriz = Color.ORANGE;
}
@Override
public void Draw (Graphics g){	
g.setColor(colorhoriz);
g.fillOval(positionX,positionY,size,size);
}

}
