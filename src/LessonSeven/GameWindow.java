package LessonSeven;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Golub Yurii
 * Date: 08.02.2022
 */
public class GameWindow extends JFrame {

    private int gameWindowWidth;
    private int gameWindowHeight;
    private int windowPositionX;
    private int windowPositionY;

    private JButton buttonStartGame;
    private JButton buttonExitGame;
    private JButton buttonClearLog;

    private JTextArea gameLog;
    private JScrollPane scrollPanel;

    private JPanel panelSettings;
    private JPanel panelControls;


    GameWindow(){
        createWindow();
        createButtons();
        createGameLog();
        createPanelControls();
        createPanelSettings();

        add(panelSettings,BorderLayout.EAST);
        add(gameLog,BorderLayout.SOUTH);

        setVisible(true);
    }


    private void createWindow(){
        this.gameWindowWidth=512;
        this.gameWindowHeight=384;
        this.windowPositionX=300;
        this.windowPositionY=150;
        setVisible(true);
        setSize(gameWindowWidth,gameWindowHeight);
        setLocation(windowPositionX,windowPositionY);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
    }

    private void createButtons(){
        buttonStartGame=new JButton("Start game");
        buttonExitGame=new JButton("Exit game");
        buttonClearLog=new JButton("Clear log");

    }
    private void createGameLog(){
        gameLog = new JTextArea();
        scrollPanel = new JScrollPane(gameLog);
        gameLog.setEditable(false);
        gameLog.setLineWrap(true);
    }

    private void createPanelControls(){
        panelControls=new JPanel();
        panelControls.setLayout(new GridLayout(3,1));
        panelControls.add(buttonStartGame);
        panelControls.add(buttonExitGame);
        panelControls.add(buttonClearLog);

    }

    private void createPanelSettings(){
        panelSettings=new JPanel();
        panelSettings.setLayout(new GridLayout(4,1));
        panelSettings.add(panelControls,gameLog);

    }

}