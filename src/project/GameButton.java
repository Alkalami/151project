/*
 * Basic Mancala holes, with player and location information.
 * extends basic JButton. Use this for GUI.
 */
package project;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Wesley Eversole
 */
public class GameButton extends JButton {

    /**
     *
     */
    protected int playerId; // 1 or 2
    /**
     *
     */
    protected int buttonId; // 0-5 field 6 Mancala
    private MancalaView myView;

    GameButton(MancalaView mv, MancalaController ctlr, String iconName, int width, int height, int playerid, int button) {
        super();
        myView = mv;
        if (!iconName.isEmpty()) {
            setIcon(new ImageIcon(iconName));
        }
        if (width > 0 && height > 0) {
            setPreferredSize(new Dimension(width, height));
        }
        setBorder(null);
        setHorizontalTextPosition(JButton.CENTER);
        setVerticalTextPosition(JButton.CENTER);
        if (ctlr != null) {
            addActionListener(ctlr);
        }
        this.playerId = playerid;
        this.buttonId = button;
    }

    /**
     *Gets the view 
     * @return myView
     */
    public MancalaView getView() {
        return myView;
    }
    
    /**
     * Gets the player ID
     * @return the playerId
     */
    public int getPlayerId() {
        return playerId;
    }

    /**
     * Sets the player's ID
     * @param playerId the playerId to set
     */
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    /**
     * Gets the Button ID
     * @return the buttonId
     */
    public int getButtonId() {
        return buttonId;
    }

    /**
     * Sets the button ID
     * @param buttonId the buttonId to set
     */
    public void setButtonId(int buttonId) {
        this.buttonId = buttonId;
    }
}
