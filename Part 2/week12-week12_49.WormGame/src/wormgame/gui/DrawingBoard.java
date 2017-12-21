package wormgame.gui;

import wormgame.domain.Piece;
import wormgame.game.WormGame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Arnas on 2017.03.26.
 */
public class DrawingBoard extends JPanel implements Updatable {
    WormGame wormGame;
    int pieceLength;

    public DrawingBoard(WormGame wormGame, int pieceLength){
        this.wormGame = wormGame;
        this.pieceLength = pieceLength;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(wormGame.getApple().getX()*pieceLength, wormGame.getApple().getY()*pieceLength, this.pieceLength, this.pieceLength);
        g.setColor(Color.BLACK);
        for(Piece piece : wormGame.getWorm().getPieces()){
            g.fill3DRect(piece.getX()*pieceLength, piece.getY()*pieceLength, this.pieceLength, this.pieceLength, true);
        }
    }

    @Override
    public void update() {
        super.repaint();
    }
}
