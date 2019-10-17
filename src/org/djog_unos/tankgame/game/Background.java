package org.djog_unos.tankgame.game;

import org.djog_unos.tankgame.engine.*;

public class Background
{
    private Sprite m_sprite;

    public void init()
    {
        m_sprite = new Sprite("sand.png", 1024, 1024, 0);
    }

    public void draw() 
    {
        m_sprite.draw();
    }
}