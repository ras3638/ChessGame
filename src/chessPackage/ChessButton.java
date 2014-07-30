package chessPackage;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

public class ChessButton {
	
	private Color DarkBrown = new Color(153, 76, 0);
	private Color LightBrown = new Color(255, 204, 153);
	
    class LightChessButton extends JButton {

		private static final long serialVersionUID = 1L;
		private Color hoverBackgroundColor;
        private Color pressedBackgroundColor;

        public LightChessButton() {
        	this.setHoverBackgroundColor();
        	this.setPressedBackgroundColor();
        	super.setBackground(LightBrown);
        	super.setContentAreaFilled(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            if (getModel().isPressed()) {
                g.setColor(pressedBackgroundColor);
            } else if (getModel().isRollover()) {
                g.setColor(hoverBackgroundColor);
            } else {
                g.setColor(getBackground());        
            }
            
            g.fillRect(0, 0, getWidth(), getHeight());
            super.paintComponent(g);
        }

        @Override
        public void setContentAreaFilled(boolean b) {
        }
        
        public void setHoverBackgroundColor() {
            this.hoverBackgroundColor = LightBrown.darker();
        }

        public void setPressedBackgroundColor() {
            this.pressedBackgroundColor = LightBrown;
        }
    }
    class DarkChessButton extends JButton {

		private static final long serialVersionUID = 1L;
		private Color hoverBackgroundColor;
        private Color pressedBackgroundColor;
  
        public DarkChessButton() {
        	this.setHoverBackgroundColor();
        	this.setPressedBackgroundColor();
        	super.setBackground(DarkBrown);
        	super.setContentAreaFilled(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            if (getModel().isPressed()) {
                g.setColor(pressedBackgroundColor);
            } else if (getModel().isRollover()) {
                g.setColor(hoverBackgroundColor);
            } else {
                g.setColor(getBackground());
            }
            g.fillRect(0, 0, getWidth(), getHeight());
            super.paintComponent(g);
        }

        @Override
        public void setContentAreaFilled(boolean b) {
        }    

        public void setHoverBackgroundColor() {
            this.hoverBackgroundColor = DarkBrown.darker();
        }

        public void setPressedBackgroundColor() {
            this.pressedBackgroundColor = DarkBrown;
        }
    }
}
