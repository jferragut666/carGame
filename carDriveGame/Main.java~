package carDriveGame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Main extends StateBasedGame{
  public Main(){
    super("Car Game");
  }
  public static void main(String[] args){
    try{
      AppGameContainer app = new AppGameContainer(new Main());
      app.setDisplayMode(640, 480, false);
      app.start();
    }
    catch (SlickException e){
      e.printStackTrace();
    }
  }
  public void initStatesList(GameContainer container) throws SlickException {
    this.addState(new StartGame());
    this.addState(new MainGame());
  }
}
