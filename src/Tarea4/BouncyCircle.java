package Tarea4;

import java.awt.Color;
import java.awt.Graphics;
public class BouncyCircle extends Circle{
Color color;
public BouncyCircle(){
size = 100;
gravity = 0.2f;
color = Color.RED;
}

@Override
public void DetectarSuelo()
{
if(positionY+size > 600)
{
Saltar();
CambiarColor();
}
}
public void Saltar(){
velocityY = 10f;
}
public void CambiarColor()
{
color = Color.blue;
}
@Override
public void Draw (Graphics g){	
g.setColor(color);
g.fillOval(positionX,positionY,size,size);
}
}
