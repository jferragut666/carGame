package carDriveGame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.Input;
import org.newdawn.slick.Image;

public class MainGame extends BasicGameState{
  Car c;//game is 640, 480
  Enemy e;
  Image backGround;
  float scale;
  public void init(GameContainer container, StateBasedGame sbg) throws SlickException{
    scale = 1; 
    container.setTargetFrameRate(60);
    backGround = new Image("carDriveGame/background.png"); 
    c = new Car((320-64),384, new Image("carDriveGame/car.png", false, Image.FILTER_NEAREST));  
    e = new Enemy(320, 100, new Image("carDriveGame/enemy.png", false, Image.FILTER_NEAREST), "oil slick", 1); 
  }
  
  public void update(GameContainer container, StateBasedGame sbg, int delta) throws SlickException{
   if(container.getInput().isKeyDown(Input.KEY_LEFT)){
     c.setX(c.getX()-5);
   }
   if(container.getInput().isKeyDown(Input.KEY_RIGHT)){
     c.setX(c.getX()+5);
   }
   if(container.getInput().isKeyDown(Input.KEY_UP)){
     c.setY(c.getY()-5);
     scale-=.008;
   }
   if(container.getInput().isKeyDown(Input.KEY_DOWN)){
     c.setY(c.getY()+5);
     scale+=.008;
   }
   e.move();
  
  }
  public void render(GameContainer container, StateBasedGame sbg, Graphics g) throws SlickException{
    backGround.draw(0, 0);
    
    c.getImage().draw(c.getX(), c.getY(), scale);
    e.getImage().draw(e.getX(), e.getY(), e.getScale());
  }
  public int getID(){
    return 1;
  }

}

