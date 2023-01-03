package com.workassigner;

import javax.swing.*;
import java.awt.*;
import java.time.DayOfWeek;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Locale;

class gui {
    private String aName;
    private String aMonth;
    private String aDate;

    public void mainWindow() { // Creating the main screen
        gui cGui = new gui();

        // Creating the intial gui
        JFrame mainGui = new JFrame("Classwork Organizer"); 
        mainGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainGui.setSize(1080,720);

        mainGui.getContentPane();
        mainGui.setLayout(null);
        
        // Add text input box
        // Text input box title
        JLabel inName = new JLabel("Assignment Info");
        inName.setFont(new Font("Arial", Font.PLAIN, 30));
        inName.setSize(300,30);
        inName.setLocation(30,20);
        inName.setVisible(true);
        mainGui.add(inName);

        // Assignment Name Input
        JLabel inAName = new JLabel("Assignment Name:");
        inAName.setFont(new Font("Arial", Font.PLAIN, 20));
        inAName.setSize(200,20);
        inAName.setLocation(40, 60);
        inAName.setVisible(true);
        mainGui.add(inAName);
        JTextArea inNt = new JTextArea();
        inNt.setFont(new Font("Arial", Font.PLAIN, 20));
        inNt.setSize(243,20);
        inNt.setLocation(210, 60);
        inNt.setVisible(true);
        mainGui.add(inNt);

        // Assignment Date Input
        JLabel inDate = new JLabel("Assignment Due: M#       D#       Y#");
        inDate.setFont(new Font("Arial", Font.PLAIN, 20));
        inDate.setSize(500,40);
        inDate.setLocation(40, 80);
        inDate.setVisible(true);
        mainGui.add(inDate);
        // Date Month Box
        JTextArea inDateM = new JTextArea();
        inDateM.setFont(new Font("Arial", Font.PLAIN, 20));
        inDateM.setSize(30,20);
        inDateM.setLocation(225, 90);
        inDateM.setVisible(true);
        mainGui.add(inDateM);
        // Date Day Box
        JTextArea inDateD = new JTextArea();
        inDateD.setFont(new Font("Arial", Font.PLAIN, 20));
        inDateD.setSize(30,20);
        inDateD.setLocation(295, 90);
        inDateD.setVisible(true);
        mainGui.add(inDateD);
        // Date Year Box
        JTextArea inDateY = new JTextArea();
        inDateY.setFont(new Font("Arial", Font.PLAIN, 20));
        inDateY.setSize(30,20);
        inDateY.setLocation(360, 90);
        inDateY.setVisible(true);
        mainGui.add(inDateY);
        

        // Assignment Discription
        JLabel inDisc = new JLabel("Assignment Discription:");
        inDisc.setFont(new Font("Arial", Font.PLAIN, 20));
        inDisc.setSize(250,60);
        inDisc.setLocation(40, 100);
        inDisc.setVisible(true);
        mainGui.add(inDisc);
        // Textbox
        JTextArea inDText = new JTextArea();
        inDText.setFont(new Font("Arial", Font.PLAIN, 20));
        inDText.setSize(200,60);
        inDText.setLocation(250, 120);
        inDText.setVisible(true);
        mainGui.add(inDText);

        // Create Button
        JButton submit = new JButton("Submit");
        submit.setFont(new Font("Arial", Font.PLAIN, 20));
        submit.setSize(100,40);
        submit.setLocation(50, 150);
        submit.setVisible(true);
        mainGui.add(submit);
        submit.addActionListener(e -> textInput(inDText, inDateM, inDateD, inDateY, inDText)); 

        // Starting the gui
        mainGui.setVisible(true);

    }

    public void textInput(JTextArea inANt, JTextArea inDateM, JTextArea inDateD, JTextArea inDateY, JTextArea inDText) {

        String assignmentN = inANt.getText();
        String assignmentD = inDText.getText();

        // Determine the day 
        // int theYear = convert(inDateY.getText());
        // int theMonth = convert(inDateM.getText());
        // int theDay = convert(inDateD.getText());

        // Move to the day list to put on calender
        ArrayList<String> Monday = new ArrayList<String>();
        ArrayList<String> Tuesday = new ArrayList<String>();
        ArrayList<String> Wensday = new ArrayList<String>();
        ArrayList<String> Thursday = new ArrayList<String>();
        ArrayList<String> Friday = new ArrayList<String>();
        ArrayList<String> Saturday = new ArrayList<String>();
        ArrayList<String> Sunday = new ArrayList<String>();

        String theDay;
        String theMonth;
        String theYear = inDateY.getText();

        if (inDateD.getText().length() < 2) {
            theDay = "0" + inDateD.getText();
        } else {
            theDay = inDateD.getText();
        }

        if (inDateM.getText().length() < 2) {
            theMonth = "0" + inDateM.getText();
        } else {
            theMonth = inDateM.getText();
        }

        String dateinput = theDay + "-" + theMonth + "-" + theYear;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-M-u", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(dateinput, dtf);
        DayOfWeek dow = date.getDayOfWeek();
        String strDay = dow.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        String st = dow.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
        System.out.println(strDay);

        if (strDay == "Monday") {
            String workname = assignmentN + " , " + assignmentD + " , " + dateinput;
            System.out.println(7);
            Monday.add(workname);
            System.out.println(Monday);
        } else if (strDay == "Tuesday") {
            String workname = assignmentN + " , " + assignmentD + " , " + dateinput;
            System.out.println(6);
            Tuesday.add(workname);
            System.out.println(Tuesday);
        } else if (strDay == "Wednesday") {
            String workname = assignmentN + " , " + assignmentD + " , " + dateinput;
            System.out.println(5);
            Wensday.add(workname);
            System.out.println(Wensday);
        } else if (strDay == "Thursday") {
            String workname = assignmentN + " , " + assignmentD + " , " + dateinput;
            System.out.println(4);
            Thursday.add(workname);
            System.out.println(Thursday);
        } else if (strDay == "Friday") {
            String workname = assignmentN + " , " + assignmentD + " , " + dateinput;
            System.out.println(3);
            Friday.add(workname);
            System.out.println(Friday);
        } else if (strDay == "Saturday") {
            String workname = assignmentN + " , " + assignmentD + " , " + dateinput;
            System.out.println(2);
            Saturday.add(workname);
            System.out.println(Saturday);
        } else if (strDay == "Sunday") {
            String workname = assignmentN + " , " + assignmentD + " , " + dateinput;
            System.out.println(1);
            Sunday.add(workname);
            System.out.println(Sunday);
        }   
        
    }    
        /*ArrayList<String> Names = new ArrayList<String>();
        ArrayList<String> Month = new ArrayList<String>();
        ArrayList<String> Day = new ArrayList<String>();
        ArrayList<String> Year = new ArrayList<String>();
        ArrayList<String> Disc = new ArrayList<String>();

        Names.add(inANt.getText());
        Month.add(inDateM.getText());
        Day.add(inDateD.getText());
        Year.add(inDateY.getText());
        Disc.add(inDText.getText());

        int arLen = Month.size(); 

        wdit(arLen, Month, Day, Year);
    }
    
    private void wdit(int arLen, ArrayList<java.lang.String> Month, ArrayList<java.lang.String> Day, ArrayList<java.lang.String> Year) {
        // Get position of item, determine date, have calender refer to dow and print

        ArrayList<String> Monday = new ArrayList<String>();
        ArrayList<String> Tuesday = new ArrayList<String>();
        ArrayList<String> Wensday = new ArrayList<String>();
        ArrayList<String> Thursday = new ArrayList<String>();
        ArrayList<String> Friday = new ArrayList<String>();
        ArrayList<String> Saturday = new ArrayList<String>();
        ArrayList<String> Sunday = new ArrayList<String>();

        int theYear = convert(Year);
        int theMonth = convert(Month);
        int theDay = convert(Day);

        LocalDate.of(theYear, theMonth, theDay);
        // remove from list once done
    } */

    

    public void calenderWindow(String aName, String aMonth,String aDate){ // Creating calender
        JFrame calGui = new JFrame("Classwork Calender");
        calGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calGui.setSize(1080,720);
        calGui.setVisible(true);        
        
    }
}
