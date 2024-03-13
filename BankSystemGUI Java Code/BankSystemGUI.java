
// Importing all required JAVA packages. 
import java.awt.*; // Contains all AWT components.
import javax.swing.*; // Contains all Swing components.
import java.awt.event.*;
import java.util.*; // Accessing Java Utility components.

public class BankSystemGUI implements ActionListener // Implementing ActionListener in BankGUI class
{

    // All JComponents required for GUI
    private JFrame jf;

    JPanel jp, jp1, jp2;

    JLabel jl1, DB, CN_1, C_ID_1, C_ID_3, BA_1, IB_1, PIN, PIN_1, WA_1, WD, BAmt_1,
            CR, CN_2, C_ID_2, BA_2, IB_2, C_ID_4, ExpDate, BAmt_2, CVC, Credit_Limit, Interest_Rate, Grace_Period;

    JButton jb1, jb2, Display_2, Add_a_creditcard, Clear_2, Set_Creditlimit, Switch_Debit, Display_1, Add_a_debitcard,
            Clear_1, Withdraw_1, Switch_Credit, Cancelcredit;

    JTextField Clientname_tf_1, Cardid_tf_1, Cardid_tf_3, Bankacc_tf_1, Issuerbank_tf_1,
            PIN_tf, PIN_1_tf, Amount_tf_1, BalanceAmount_tf_1, Clientname_tf_2, Cardid_tf_2, Bankacc_tf_2,
            Issuerbank_tf_2,
            Cardid_tf_4, BalanceAmount_tf_2, CVC_tf, Credit_Limit_tf, Interest_Rate_tf, Grace_Period_tf;

    JComboBox<String> c1_Y, c2_M, c3_D, c4_Y, c5_M, c6_D;

    // Creating Array for JComboBox
    String[] year = { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011",
            "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
            "2020", "2021", "2022", "2023" };
    String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
            "November", "December" };
    String[] date = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
            "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };

    // Array List stores data entered in GUI
    ArrayList<BankCard> Bankdata = new ArrayList<BankCard>(); // Arraylist Intialization of BankCard class

    // Constructor ;of the BankGUI class
    public BankSystemGUI() {

        /**
         * Main Frame
         * Contains whole components of inside all JPanels
         */

        jf = new JFrame("Sacar Bank"); // Jframe object.
        jf.setBounds(270, 100, 900, 800); // Setting Frame Bounds.
        jf.setLayout(null); // Has now no layout at all and user can customize where to keep Jcomponents and
                            // ultimately GUI.
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(new Color(230, 230, 230));

        /**
         * Panel 1
         * This panel contains Welcome Interface
         */

        jp = new JPanel();
        jp.setBounds(0, 0, 900, 800);
        jp.setLayout(null);
        jf.add(jp);

        Font f = new Font(Font.SANS_SERIF, Font.BOLD, 30);

        jl1 = new JLabel("Welcome to our Sacar Bank");
        jp.add(jl1);
        jl1.setBounds(240, 150, 480, 66);
        jl1.setFont(f);

        // Creating Color object
        Color c1 = new Color(51, 204, 255);
        Color c2 = new Color(247, 167, 0);

        // Button Objects for Panel 1
        jb1 = new JButton("Debit Card"); // Debit card button
        jb2 = new JButton("Credit Card"); // Credit card button
        jp.add(jb1);
        jp.add(jb2);

        // Setting custom fonts in Panel 1
        jb1.setFont(new Font("SANS_SERIF", Font.PLAIN, 17));
        jb2.setFont(new Font("SANS_SERIF", Font.PLAIN, 17));

        jb1.setBackground(c2); // Setting Background of respective color object
        jb2.setBackground(c2);

        // For Aesthetic Layout of buttons in Panel 1
        // Setting only Border color in Buttons of Panel 1
        jb1.setBorderPainted(false);
        jb2.setBorderPainted(false);

        // Setting bounds of JButtons
        jb1.setBounds(300, 280, 300, 72);
        jb2.setBounds(300, 420, 300, 72);

        // Event Handling
        // Switching between First, Second and Third Panel of the JFrame

        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jp.setVisible(false);
                jp1.setVisible(true);
                jp2.setVisible(false);
            }
        });
        jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jp.setVisible(false);
                jp1.setVisible(false);
                jp2.setVisible(true);
            }
        });

        /**
         * Panel 2
         * Panel for Debit Card GUI
         */

        jp1 = new JPanel();
        jp1.setBounds(0, 0, 900, 800);
        jp1.setBackground(new Color(185, 233, 252));
        jp1.setLayout(null);
        jp1.setVisible(false);

        // Creating JLabel objects Debit Card Panel
        DB = new JLabel("Debit Card");
        CN_1 = new JLabel("Client Name :");
        C_ID_1 = new JLabel("Card ID :");
        C_ID_3 = new JLabel("Card ID :");
        BA_1 = new JLabel("Bank Account :");
        IB_1 = new JLabel("Issuer Bank :");
        PIN = new JLabel("PIN Number");
        PIN_1 = new JLabel("PIN Number:");

        WA_1 = new JLabel("Withdrawal Amount");
        WD = new JLabel("Withdrawal Date");
        BAmt_1 = new JLabel("Balance Amount");

        // Creating JTextField objects Debit Card Panel
        Clientname_tf_1 = new JTextField();
        Cardid_tf_1 = new JTextField();
        Cardid_tf_3 = new JTextField();
        Bankacc_tf_1 = new JTextField();
        Issuerbank_tf_1 = new JTextField();
        PIN_tf = new JTextField();
        PIN_1_tf = new JTextField();
        Amount_tf_1 = new JTextField();
        BalanceAmount_tf_1 = new JTextField();

        // Creating JButton objects Debit Card Panel
        Display_1 = new JButton("DISPLAY");
        Add_a_debitcard = new JButton("ADD A DEBIT CARD");
        Clear_1 = new JButton("CLEAR");
        Withdraw_1 = new JButton("WITHDRAW");
        Switch_Credit = new JButton("SWITCH TO CREDIT CARD");

        // Creating JComboBox objects Debit Card Panel
        c1_Y = new JComboBox<String>(year);
        c2_M = new JComboBox<String>(month);
        c3_D = new JComboBox<String>(date);

        // Customized Font Size and Style
        DB.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        Font f1 = new Font(Font.SANS_SERIF, Font.PLAIN, 17);

        // Adding Jlabels to Debit Card JPanel
        jp1.add(DB);
        jp1.add(CN_1);
        jp1.add(C_ID_1);
        jp1.add(C_ID_3);
        jp1.add(BA_1);
        jp1.add(IB_1);
        jp1.add(PIN);
        jp1.add(PIN_1);
        jp1.add(WA_1);
        jp1.add(WD);
        jp1.add(BAmt_1);

        // Adding JTextFields to Debit Card JPanel
        jp1.add(Clientname_tf_1);
        jp1.add(Cardid_tf_1);
        jp1.add(Cardid_tf_3);
        jp1.add(Bankacc_tf_1);
        jp1.add(Issuerbank_tf_1);
        jp1.add(PIN_tf);
        jp1.add(PIN_1_tf);
        jp1.add(Amount_tf_1);
        jp1.add(BalanceAmount_tf_1);

        // Adding JButtons to Debit Card JPanel
        jp1.add(Display_1);
        jp1.add(Add_a_debitcard);
        jp1.add(Clear_1);
        jp1.add(Withdraw_1);
        jp1.add(Switch_Credit);

        // Adding JComboBoxes to Debit Card JPanel
        jp1.add(c1_Y);
        jp1.add(c2_M);
        jp1.add(c3_D);

        // Adding Debit Card Panel to JFrame
        jf.add(jp1);

        // Setting Bounds for JLabels of Debit Card Panel
        DB.setBounds(380, 10, 140, 30);
        CN_1.setBounds(90, 100, 140, 30);
        C_ID_1.setBounds(90, 160, 140, 30);
        C_ID_3.setBounds(200, 410, 140, 30);
        BA_1.setBounds(480, 95, 140, 30);
        IB_1.setBounds(480, 160, 140, 30);
        PIN.setBounds(320, 220, 140, 30);
        PIN_1.setBounds(480, 410, 140, 30);
        WA_1.setBounds(270, 470, 170, 30);
        WD.setBounds(480, 470, 140, 30);
        BAmt_1.setBounds(480, 220, 140, 30);

        // Setting Fonts for JLabels of Debit Card Panel
        CN_1.setFont(f1);
        C_ID_1.setFont(f1);
        C_ID_3.setFont(f1);
        BA_1.setFont(f1);
        IB_1.setFont(f1);
        PIN.setFont(f1);
        PIN_1.setFont(f1);
        WA_1.setFont(f1);
        WD.setFont(f1);
        BAmt_1.setFont(f1);

        // Setting Bounds for JButtons of Debit Card Panel
        Display_1.setBounds(190, 610, 160, 50);
        Add_a_debitcard.setBounds(500, 320, 320, 50);
        Clear_1.setBounds(580, 610, 160, 50);
        Withdraw_1.setBounds(385, 610, 160, 50);
        Switch_Credit.setBounds(380, 710, 180, 50);

        // Setting Bounds for JTextFields of Debit Card Panel
        Clientname_tf_1.setBounds(220, 95, 220, 38);
        Cardid_tf_1.setBounds(220, 160, 220, 38);
        Cardid_tf_3.setBounds(290, 410, 150, 38);
        Bankacc_tf_1.setBounds(620, 95, 220, 38);
        Issuerbank_tf_1.setBounds(620, 160, 220, 38);
        PIN_tf.setBounds(300, 260, 150, 38);
        PIN_1_tf.setBounds(600, 410, 150, 38);
        Amount_tf_1.setBounds(280, 500, 150, 38);
        BalanceAmount_tf_1.setBounds(475, 260, 150, 38);

        // Setting Bounds for JComoBox of Debit Card Panel
        c1_Y.setBounds(500, 505, 85, 30);
        c2_M.setBounds(575, 505, 120, 30);
        c3_D.setBounds(685, 505, 70, 30);

        // Event Handling
        // Adding Action Listener to JButtons

        // Clear Button of Debit Card Panel
        Clear_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                Clientname_tf_1.setText("");
                Cardid_tf_1.setText("");
                Cardid_tf_3.setText("");
                PIN_1_tf.setText("");
                Bankacc_tf_1.setText("");
                Issuerbank_tf_1.setText("");
                PIN_tf.setText("");
                Amount_tf_1.setText("");
                BalanceAmount_tf_1.setText("");

                JOptionPane.showMessageDialog(jp1, "All TextField of Debit Card has been cleared", "Info",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        });

        // Switching to Credit Card panel from Debit Card Panel
        Switch_Credit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                jp.setVisible(false);
                jp1.setVisible(false);
                jp2.setVisible(true);
            }
        });

        // Adding JButtons of Debit Card Panel
        Add_a_debitcard.addActionListener(this);
        Withdraw_1.addActionListener(this);
        Display_1.addActionListener(this);

        /**
         * Panel 3
         * This Panel contains Credit Card GUI
         */

        jp2 = new JPanel();
        jp2.setBounds(0, 0, 900, 800);
        jp2.setBackground(new Color(185, 233, 252)); // Background color for Panel 3
        jp2.setLayout(null);
        jp2.setVisible(false);

        Font f2 = new Font(Font.SANS_SERIF, Font.PLAIN, 17); // Customized Font Size and Style

        // Creating JLabel objects for Credit Card Panel
        CR = new JLabel("Credit Card");
        CN_2 = new JLabel("Client Name :");
        C_ID_2 = new JLabel("Card ID :");
        BA_2 = new JLabel("Bank Account :");
        IB_2 = new JLabel("Issuer Bank :");
        C_ID_4 = new JLabel("Card ID");
        ExpDate = new JLabel("Expiration Date");
        BAmt_2 = new JLabel("Balance Amount");
        CVC = new JLabel("CVC Number");
        Credit_Limit = new JLabel("Credit Limit");
        Interest_Rate = new JLabel("Interest Rate");
        Grace_Period = new JLabel("Grace Period");

        // Creating JTextField objects for Credit Card Panel
        Clientname_tf_2 = new JTextField();
        Cardid_tf_2 = new JTextField();
        Bankacc_tf_2 = new JTextField();
        Issuerbank_tf_2 = new JTextField();
        Cardid_tf_4 = new JTextField();
        BalanceAmount_tf_2 = new JTextField();
        CVC_tf = new JTextField();
        Credit_Limit_tf = new JTextField();
        Interest_Rate_tf = new JTextField();
        Grace_Period_tf = new JTextField();

        // Creating JButton objects for Credit Card Panel
        Display_2 = new JButton("DISPLAY");
        Add_a_creditcard = new JButton("ADD A CREDIT CARD");
        Clear_2 = new JButton("CLEAR");
        Set_Creditlimit = new JButton("SET CREDIT LIMIT");
        Switch_Debit = new JButton("SWITCH TO DEBIT CARD");
        Cancelcredit = new JButton("CANCEL CREDIT CARD");

        // Creating JComboBox objects for Credit Card Panel
        c4_Y = new JComboBox<String>(year);
        c5_M = new JComboBox<String>(month);
        c6_D = new JComboBox<String>(date);

        // Adding Jlabels to Credit Card JPanel
        jp2.add(CR);
        jp2.add(CN_2);
        jp2.add(C_ID_2);
        jp2.add(BA_2);
        jp2.add(IB_2);
        jp2.add(C_ID_4);
        jp2.add(ExpDate);
        jp2.add(BAmt_2);
        jp2.add(CVC);
        jp2.add(Credit_Limit);
        jp2.add(Interest_Rate);
        jp2.add(Grace_Period);

        // Adding JTextFields to Credit Card JPanel
        jp2.add(Clientname_tf_2);
        jp2.add(Cardid_tf_2);
        jp2.add(Bankacc_tf_2);
        jp2.add(Issuerbank_tf_2);
        jp2.add(Cardid_tf_4);
        jp2.add(BalanceAmount_tf_2);
        jp2.add(CVC_tf);
        jp2.add(Credit_Limit_tf);
        jp2.add(Interest_Rate_tf);
        jp2.add(Grace_Period_tf);

        // Adding JButtons to Credit Card JPanel
        jp2.add(Display_2);
        jp2.add(Add_a_creditcard);
        jp2.add(Clear_2);
        jp2.add(Set_Creditlimit);
        jp2.add(Switch_Debit);
        jp2.add(Cancelcredit);

        // Adding JComboBoxes to Credit Card JPanel
        jp2.add(c4_Y);
        jp2.add(c5_M);
        jp2.add(c6_D);

        // Adding Credit Card Panel to JFrame
        jf.add(jp2);

        // Setting Bounds for JLabels of Credit Card Panel
        CR.setBounds(380, 10, 140, 30);
        CN_2.setBounds(90, 100, 140, 30);
        C_ID_2.setBounds(90, 160, 140, 30);
        BA_2.setBounds(480, 95, 140, 30);
        IB_2.setBounds(480, 160, 140, 30);
        C_ID_4.setBounds(90, 300, 170, 30);
        ExpDate.setBounds(630, 225, 140, 30);
        BAmt_2.setBounds(420, 225, 140, 30);
        CVC.setBounds(420, 310, 140, 30);
        Credit_Limit.setBounds(90, 380, 170, 30);
        Grace_Period.setBounds(90, 460, 170, 30);
        Interest_Rate.setBounds(630, 310, 140, 30);

        // Setting Fonts for JLabels of Credit Card Panel
        CN_2.setFont(f2);
        C_ID_2.setFont(f2);
        BA_2.setFont(f2);
        IB_2.setFont(f2);
        C_ID_4.setFont(f2);
        ExpDate.setFont(f2);
        BAmt_2.setFont(f2);
        CVC.setFont(f2);
        Grace_Period.setFont(f2);
        Credit_Limit.setFont(f2);
        Interest_Rate.setFont(f2);

        // Setting Bounds for JButtons of Credit Card Panel
        Display_2.setBounds(250, 630, 220, 50);
        Set_Creditlimit.setBounds(60, 540, 280, 50);
        Clear_2.setBounds(485, 630, 220, 50);
        Add_a_creditcard.setBounds(530, 420, 320, 50);
        Switch_Debit.setBounds(380, 710, 180, 50);
        Cancelcredit.setBounds(530, 490, 320, 50);

        // Setting Bounds for JTextFields of Credit Card Panel
        Clientname_tf_2.setBounds(220, 95, 220, 38);
        Cardid_tf_2.setBounds(220, 160, 220, 38);
        Bankacc_tf_2.setBounds(620, 95, 220, 38);
        Issuerbank_tf_2.setBounds(620, 160, 220, 38);
        Cardid_tf_4.setBounds(90, 330, 150, 38);
        BalanceAmount_tf_2.setBounds(415, 260, 150, 38);
        CVC_tf.setBounds(415, 340, 150, 38);
        Credit_Limit_tf.setBounds(90, 410, 150, 38);
        Grace_Period_tf.setBounds(90, 490, 180, 38);
        Interest_Rate_tf.setBounds(630, 340, 180, 38);

        // Setting Bounds for JCombooBoxes of Credit Card Panel
        c4_Y.setBounds(600, 265, 85, 30);
        c5_M.setBounds(675, 265, 120, 30);
        c6_D.setBounds(785, 265, 70, 30);

        CR.setFont(new Font("Times New Roman", Font.PLAIN, 28)); // Customized Font

        // Event Handling
        // Adding Jbuttons with Action Listener

        // Clear Button of Credit Card Panel
        Clear_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                Clientname_tf_2.setText("");
                Cardid_tf_2.setText("");
                Cardid_tf_4.setText("");
                Bankacc_tf_2.setText("");
                Issuerbank_tf_2.setText("");
                BalanceAmount_tf_2.setText("");
                CVC_tf.setText("");
                Credit_Limit_tf.setText("");
                Interest_Rate_tf.setText("");
                Grace_Period_tf.setText("");
                JOptionPane.showMessageDialog(jp2, "All TextField of Credit Card has been cleared", "Info",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        });

        // Switching to Debit Card Panel from Credit Card Panel
        Switch_Debit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                jp.setVisible(false);
                jp1.setVisible(true);
                jp2.setVisible(false);
            }

        });

        // Adding Jbuttons of Credit Card Panel with Action Listener
        Add_a_creditcard.addActionListener(this);
        Set_Creditlimit.addActionListener(this);
        Cancelcredit.addActionListener(this);
        Display_2.addActionListener(this);

    }

    // Action Performed Method for Event Handling
    public void actionPerformed(ActionEvent a) {
        // Event Handling

        // Event Handling of Add a Debit Card Button
        if (a.getSource() == Add_a_debitcard) // When Event Source is Add Debit Card Button.
        {
            // Checking whether the text fields are empty or not while adding debit card.
            if (Cardid_tf_1.getText().isEmpty() || Clientname_tf_1.getText().isEmpty()
                    || Bankacc_tf_1.getText().isEmpty() || Issuerbank_tf_1.getText().isEmpty()
                    || PIN_tf.getText().isEmpty() || BalanceAmount_tf_1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(jp1, "Please fill all the required Details.", "Alert!!",
                        JOptionPane.ERROR_MESSAGE);
            }

            else {
                try {
                    // Getting Textfields value and storing in respective variables.
                    int CardID = Integer.parseInt(Cardid_tf_1.getText());
                    String ClientName = Clientname_tf_1.getText();
                    int PIN_Number = Integer.parseInt(PIN_tf.getText());
                    String IssuerBank = Issuerbank_tf_1.getText();
                    String BankAccount = Bankacc_tf_1.getText();
                    int BalanceAmount = Integer.parseInt(BalanceAmount_tf_1.getText());
                    // Boolean value to Check if the card ID already exists
                    boolean debitCardExists = false;

                    for (BankCard D_ID : Bankdata) // loop to check if Bankdata arraylist contains CardID or not
                    {
                        if (D_ID.getCardID() == CardID) {
                            debitCardExists = true;
                            break;
                        }

                    }

                    if (debitCardExists) // Case of Card ID already in Arraylist so no further operations allowed
                    {
                        JOptionPane.showMessageDialog(jp1,
                                "Such Debit Card with this Card ID already exists. Try Entering another CardID",
                                "Alert", JOptionPane.ERROR_MESSAGE);
                    }

                    else {
                        // Creating a new DebitCard Object to call DebitCard constructor
                        DebitCard DC = new DebitCard(ClientName, PIN_Number, BankAccount, IssuerBank, BalanceAmount,
                                CardID);

                        Bankdata.add(DC); // Adding the above Debit Card Object to Bank Card arrayList

                        // Displaying a message to let the user know the Information was sucessfully
                        // added
                        JOptionPane.showMessageDialog(jp1, "Your Debit Card was added successfully.", "Info!!",
                                JOptionPane.INFORMATION_MESSAGE);

                    }

                }

                catch (NumberFormatException n) // Invoked when input in textfield has wrong Data type.
                {
                    JOptionPane.showMessageDialog(jp1, "Incorrect Input Field Format. Please Enter in correct Format! ",
                            "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        // Withdrawing form Debit Card
        else if (a.getSource() == Withdraw_1) // When the event trigger is Withdraw button
        {
            if (Cardid_tf_3.getText().isEmpty() || Amount_tf_1.getText().isEmpty() || PIN_1_tf.getText().isEmpty()) {
                // Displays Error message if the text fields are empty.
                JOptionPane.showMessageDialog(jp1, "Please fill in all fields.", "Alert", JOptionPane.ERROR_MESSAGE);
            }

            else {
                // Adding a try Catch block in order to prevent the data being entered in wrong
                // format
                try {
                    // Getting the input values from the text fields of Debit Card
                    int CardID = Integer.parseInt(Cardid_tf_3.getText());
                    int PIN_Number = Integer.parseInt(PIN_1_tf.getText());
                    int WithdrawalAmount = Integer.parseInt(Amount_tf_1.getText());

                    // Retreving date from combobox
                    String year = (String) c1_Y.getSelectedItem();
                    String month = (String) c2_M.getSelectedItem();
                    String day = (String) c3_D.getSelectedItem();
                    // Combining all the combobox for date
                    String DateofWithdrawal = day + " " + month + "," + year;

                    boolean Debitcard_check = false; // For loop iterator

                    for (BankCard Debit_id : Bankdata) {
                        // Downcasting to so get withdraw Method and checking card id mathces or not
                        if (Debit_id.getCardID() == CardID && Debit_id instanceof DebitCard) {

                            // If the card exists then,
                            Debitcard_check = true; // For loop iterator

                            // Casting the Debit_id to CreditCard class
                            DebitCard Debitcard = (DebitCard) Debit_id;

                            if (Debitcard.getPIN_Number() == PIN_Number) // Checking the correct pin number
                            {
                                if (Debitcard.getBalanceAmount() < Debitcard.getWithdrawalAmount()) // Checking if
                                                                                                    // Balance amount
                                                                                                    // more or less than
                                                                                                    // Withdrawal Amount
                                {
                                    JOptionPane.showMessageDialog(jp1,
                                            "Insufficient Balance.\n Card ID: " + CardID + ".", "Alert",
                                            JOptionPane.INFORMATION_MESSAGE);

                                } else // Withdrawal Amount < Balance Amount
                                {
                                    // Calling the Withdraw method from Credit Card class
                                    Debitcard.Withdraw(WithdrawalAmount, DateofWithdrawal, PIN_Number);

                                    JOptionPane.showMessageDialog(jp1,
                                            "You have successfully withdrawn money from your Debit Card Account with CardID "
                                                    + CardID + ".",
                                            "Thank You", JOptionPane.INFORMATION_MESSAGE);

                                }
                            } else {
                                JOptionPane.showMessageDialog(jp1, "Incorrect PIN. Please Check and enter a valid PIN.",
                                        "Alert", JOptionPane.ERROR_MESSAGE);
                            }
                        }

                        else {
                            JOptionPane.showMessageDialog(jp1,
                                    "The Debit Card with Card Id " + CardID
                                            + " does not exist. Please enter a valid Card Id.",
                                    "Alert", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }

                catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(jp1, "Incorrect Format. Please input valid details", "Alert",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        // Display Debit Card
        else if (a.getSource() == Display_1) {
            for (BankCard Info : Bankdata) // For loop checking in arraylist for details of Debit card stored.
            {
                if (Info instanceof DebitCard) {
                    DebitCard Debitcard = (DebitCard) Info;
                    Debitcard.display(); // Calling Display method of DebitCard class

                }
            }
        }

        // Add a Credit Card Button
        else if (a.getSource() == Add_a_creditcard) {
            if (Cardid_tf_2.getText().isEmpty() || Clientname_tf_2.getText().isEmpty()
                    || Bankacc_tf_2.getText().isEmpty() || Issuerbank_tf_2.getText().isEmpty()
                    || BalanceAmount_tf_2.getText().isEmpty() || CVC_tf.getText().isEmpty()
                    || Interest_Rate_tf.getText().isEmpty()) {
                // Displays Error message if the text field is empty
                JOptionPane.showMessageDialog(jp2, "Please fill in all fields.", "Alert", JOptionPane.ERROR_MESSAGE);
            } else {
                // Adding a try Catch block in order to prevent the data being entered in wrong
                // format
                try {
                    // Getting the input values from the text fields of Debit Card
                    int CardID = Integer.parseInt(Cardid_tf_2.getText());
                    String ClientName = Clientname_tf_2.getText();
                    String BankAccount = Bankacc_tf_2.getText();
                    String IssuerBank = Issuerbank_tf_2.getText();
                    int BalanceAmount = Integer.parseInt(BalanceAmount_tf_2.getText());
                    int CVC_Number = Integer.parseInt(CVC_tf.getText());
                    double InterestRate = Double.parseDouble(Interest_Rate_tf.getText());
                    // Retreving date from combobox
                    String year = (String) c6_D.getSelectedItem();
                    String month = (String) c5_M.getSelectedItem();
                    String day = (String) c4_Y.getSelectedItem();

                    String ExpirationDate = year + "/" + month + "/" + day;

                    boolean Creditcard_exist = false;

                    // For each loop
                    for (BankCard C_ID : Bankdata) // loop to check whether the given card id exist or not
                    {
                        // For each loop to check existing Card ID
                        if (C_ID.getCardID() == CardID) {
                            Creditcard_exist = true;
                            break;
                        }
                    }

                    if (Creditcard_exist) {
                        JOptionPane.showMessageDialog(jp2, "Card with the same Id already exists.", "Alert",
                                JOptionPane.ERROR_MESSAGE);
                    } else {

                        // Create a new CreditCard Object and call constructor of credit card class
                        CreditCard credit = new CreditCard(BalanceAmount, ClientName, IssuerBank, BankAccount, CardID,
                                CVC_Number, InterestRate, ExpirationDate);
                        // Adding the above Debit Card Object to Bank Card arrayList
                        Bankdata.add(credit);

                        // Displaying a message to let the user know the Information was sucessfully
                        // added
                        JOptionPane.showMessageDialog(jp2, "Credit Card was sucessfully Added", "Alert",
                                JOptionPane.INFORMATION_MESSAGE);

                    }
                }

                catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(jp2, "Incorrect Format. Please input valid details", "Alert",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        // Set Credit Limit Button
        else if (a.getSource() == Set_Creditlimit) // if event trigger is Set Credit limit button
        {
            try {
                // Getting all the values from textfields and storing them in respective
                // variables.
                int CardID = Integer.parseInt(Cardid_tf_4.getText());
                double CreditLimit = Double.parseDouble(Credit_Limit_tf.getText());
                int GracePeriod = Integer.parseInt(Grace_Period_tf.getText());
                // Using a flag to keep track of whether a credit card with the specified ID was
                // found or not
                boolean cardFound = false;

                if (Cardid_tf_4.getText().isEmpty() || Credit_Limit_tf.getText().isEmpty()
                        || Grace_Period_tf.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(jp2, "Please enter all information.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

                else {
                    for (BankCard card : Bankdata) {

                        if (card instanceof CreditCard && card.getCardID() == CardID) {
                            CreditCard creditcard = (CreditCard) card; // Downcasting card object to new CreditCard
                                                                       // object named creditcard
                            creditcard.setCreditLimit(CreditLimit, GracePeriod);

                            cardFound = true;
                            break;

                        }

                    }

                    if (!cardFound) {
                        JOptionPane.showMessageDialog(jp2, "Invalid card ID. This Credit Card doesn't exist.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }

                    else {
                        JOptionPane.showMessageDialog(jp2, "Credit limit set successfully", "Message",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }

            catch (NumberFormatException ef) {
                JOptionPane.showMessageDialog(jp2, "Invalid input. Enter in Correct Format.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        // Display Button of Credit Card Panel
        else if (a.getSource() == Display_2) // If event trigger is Display button of Credit Card.
        {
            if (Bankdata.isEmpty() == false) {
                for (BankCard Infodetails : Bankdata) {
                    if (Infodetails instanceof CreditCard) {
                        CreditCard creditCard = (CreditCard) Infodetails; // Downcasting InfoDetails of CreditCard class
                                                                          // to new object named creditCard
                        creditCard.display(); // Calling Display method of CreditCard class
                    }
                }
            }

            else {
                JOptionPane.showMessageDialog(jp2, "No Credit Card exists. First Add Credit Card", "Alert",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        }

        // Cancel Credit Card Button
        else if (a.getSource() == Cancelcredit) // If event trigger is Cancel Credit Card Button
        {
            if (Bankdata.isEmpty() == false) {
                for (BankCard Credit_cancel : Bankdata) {
                    if (Credit_cancel instanceof CreditCard) {
                        CreditCard remove = (CreditCard) Credit_cancel;
                        remove.cancelCreditCard();
                        // Bankdata.remove(Credit_cancel);
                        JOptionPane.showMessageDialog(jp2, "Credit Card is Cancelled. Thanks for using the service.",
                                "Info!!", JOptionPane.INFORMATION_MESSAGE);

                    }
                }
            }

            else // If There is no Credit card in Bankdata ArrayList
            {
                JOptionPane.showMessageDialog(jp2, "Please First Add the Credit Card", "Alert",
                        JOptionPane.WARNING_MESSAGE);
            }
        }

    }

    // Main Method to call the Constructor of the respective Class
    public static void main(String[] args) {
        new BankSystemGUI();
    }

}
