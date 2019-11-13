package org.djog_unos.tankgame.game;

import org.djog_unos.tankgame.engine.*;

import java.util.Iterator;

public class GameView
{
	public static void drawGame(TankGame game)
	{
		game.background.draw();
		Iterator<Box> i = game.m_boxes.iterator();
		while (i.hasNext()) {
			Box box = i.next();
			box.draw();
		}
		Iterator<Tree> j = game.m_trees.iterator();
		while (j.hasNext()) {
			Tree tree = j.next();
			tree.draw();
		}
		Iterator<Bush> k = game.m_bushes.iterator();
		while (k.hasNext()) {
			Bush bush = k.next();
			bush.draw();
		}
		game.player.draw();

        Sprite shellSprite = new Sprite("shell.png", 32, 32, 0);
        for(Shell shell : game.player.getShells())
        {
            shellSprite.setPosition(shell.getX(), shell.getY());
            shellSprite.setRotation(shell.getAngle());
            shellSprite.draw();
		}
	}
}