package carDriveGame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;


public class Main extends BasicGame{
  public Main(){
    super("Car Game");
  }
  public static void main(String[] args){
    try{
      AppGameContainer app = new AppGameContainer(new Main());
      app.setDisplayMode(500, 400, false);
      app.start();
    }
    catch (SlickException e){
      e.printStackTrace();
    }
  }
  public void init(GameContainer container) throws SlickException{
  }
  
  public void update(GameContainer container, int delta) throws SlickException{

  }
  public void render(GameContainer container, Graphics g) throws SlickException{
    g.drawString("Test", 50, 50);
  }
}
