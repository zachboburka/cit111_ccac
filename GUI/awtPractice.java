/*
 * MIT License

Copyright (c) [2019] [Zach Boburka]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author zachary.boburka
 */
public class awtPractice {
    private static Frame mainFrame;
    private static Panel topPanel;
    private static Panel bottomPanel;
    private static Button button1;
    private static Button button2;
    private static Label instructionLabel;
    private static Label pushedButton1;
    private static Label pushedButton2;
    private static FlowLayout centeredText;
    private static Font labelFont;

    public static void main(String[] args) {
        GUImaker();

    }//main

    public static void GUImaker() {
        //create priject Frame
        mainFrame = new Frame("AWT Sample Demo");

        //Get mainFrame Layout
        mainFrame.setLayout(new GridLayout(1,2));

        //Set mainFrame Size
        mainFrame.setSize(500,250);

        //Set mainFrame visability
        mainFrame.setVisible(true);

        //Program the exit button
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }//windowClosing
        }//windowAdapter
        );

        //create top & bottom Panels
        centeredText = new FlowLayout(FlowLayout.CENTER, 35, 35);
        topPanel = new Panel(centeredText);
        bottomPanel = new Panel(centeredText);

        //add Panels to mainFrame
        mainFrame.add(topPanel, BorderLayout.NORTH);
        mainFrame.add(bottomPanel, BorderLayout.SOUTH);

        //create Buttons
        button1 = new Button("Button 1");
        button2 = new Button("Button 2");

        //add Buttons to Panel
        topPanel.add(button1);
        topPanel.add(button2);

        //adjust the size of the Buttons
        Dimension buttonSize = new Dimension(175, 55);
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);

        //change the font of the buttons
        Font buttonFont = new Font("", Font.PLAIN, 30);
        button1.setFont(buttonFont);
        button2.setFont(buttonFont);

        //create Labels
        instructionLabel = new Label("Push A Button");
        pushedButton1 = new Label("You pushed Button 1");
        pushedButton2 = new Label("You pushed Button 2");

        //add instructons to bottomPanel
        bottomPanel.add(instructionLabel);

        //create and set Label Font
        labelFont = new Font("", Font.PLAIN, 25);
        instructionLabel.setFont(labelFont);
        pushedButton1.setFont(labelFont);
        pushedButton2.setFont(labelFont);

        //make label text green
        pushedButton1.setForeground(Color.GREEN);
        pushedButton2.setForeground(Color.GREEN);

    }//GUImaker

    public static void eventHandlers() {
        //Event Handler button 1
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bottomPanel.removeAll();
                bottomPanel.add(pushedButton1);
                mainFrame.setVisible(true);
            }//action Performed
        });//button1.actionListener

        //Event Handler button 1
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bottomPanel.removeAll();
                bottomPanel.add(pushedButton2);
                mainFrame.setVisible(true);
            }//action Performed
        });//button1.actionListener
    }//eventHandlers
}//GUI
