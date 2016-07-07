package carDriveGame;
import org.newdawn.slick.Image;

public class Enemy{
   
  int x,y; 
  Image enemySprite;
  String name;
  float scale;

  public Enemy(int x, int y, Image enemySprite, String name, float scale){
    this.x = x;
    this.y = y;
    this.enemySprite = enemySprite;
    this.name = name;
    this.scale = scale;
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
  public void setX(int x){
    this.x = x; 
  }
  public void setY(int y){
    this.y = y;
  }
  public Image getImage(){
    return enemySprite;
  }
  public float getScale(){
    return scale;
  }
  public void move(){
    y+=5;
    scale-=.008;
  }
}

