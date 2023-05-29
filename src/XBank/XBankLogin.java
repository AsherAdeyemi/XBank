package XBank;

import XBank.Current;
import XBank.Savings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;


public class XBankLogin implements ActionListener {
    String pinValue = "5555";
    Savings savingsAccount = new Savings();
    Current currentAccount = new Current();

    JFrame frame;

    {
        frame = new JFrame();
    }

    JLabel label = new JLabel("Welcome to X Bank");
    JLabel EnterPin = new JLabel("Enter pin");
    JTextField pin = new JTextField();
    JButton login = new JButton("Login");

    JFrame ChooseAcctType = new JFrame();
    JLabel chooseAcctType = new JLabel("Choose Account Type");
    JButton savings = new JButton("Savings");
    JButton current = new JButton("Current");

    JFrame chooseSavings = new JFrame();
    JLabel whatDoYouWant = new JLabel("What do you want?");
    JButton depositSavings = new JButton("Deposit?");
    JButton withdrawalSavings = new JButton("Withdrawal?");

    JFrame chooseCurrent = new JFrame();
    JLabel WhatDoYouWant = new JLabel("What do you want?");
    JButton depositCurrent = new JButton("Deposit?");
    JButton withdrawalCurrent = new JButton("Withdrawal?");

    JFrame DepositAmountSavings = new JFrame();
    JLabel enterDepositSavingsAmountLabel = new JLabel("Enter deposit amount");
    JLabel amountDepositSavingsLabel = new JLabel("Amount");
    JTextField amountDepositSavings = new JTextField();
    JButton depositSavingsButton = new JButton("Deposit");

    JFrame WithdrawalAmountSavings = new JFrame();
    JLabel enterWithdrawalSavingsAmountLabel = new JLabel("Enter withdrawal amount");
    JLabel amountWithdrawalSavingsLabel = new JLabel("Amount");
    JTextField amountWithdrawalSavings = new JTextField();
    JButton withdrawalSavingsButton = new JButton("Withdrawal");

    JFrame DepositAmountCurrent = new JFrame();
    JLabel enterDepositCurrentAmountLabel = new JLabel("Enter deposit amount");
    JLabel amountDepositCurrentLabel = new JLabel("Amount");
    JTextField amountDepositCurrent = new JTextField();
    JButton depositCurrentButton = new JButton("Deposit");

    JFrame WithdrawalAmountCurrent = new JFrame();
    JLabel enterWithdrawalCurrentAmountLabel = new JLabel("Enter withdrawal amount");
    JLabel amountWithdrawalCurrentLabel = new JLabel("Amount");
    JTextField amountWithdrawalCurrent = new JTextField();
    JButton withdrawalCurrentButton = new JButton("Withdrawal");

     XBankLogin(){

        label.setFont(new Font("Ubuntu",Font.BOLD,20));
        label.setBounds(45,10,250,40);

        EnterPin.setFont(new Font("Ubuntu",Font.PLAIN,19));
        EnterPin.setBounds(45,50,250,40);

        pin.setFont(new Font("Ubuntu",Font.PLAIN,19));
        pin.setBounds(45,80,250,40);

        login.setFont(new Font("Ubuntu",Font.BOLD,19));
        login.setFocusable(false);
        login.setBounds(70,140,140,40);
        login.addActionListener(this);


        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(pin);
        frame.add(label);
        frame.add(login);
        frame.add(EnterPin);
    }
    public void ChooseAccTypeWindow(){

        chooseAcctType.setFont(new Font("Ubuntu",Font.BOLD,20));
        chooseAcctType.setBounds(70,20,250,40);

        savings.setFont(new Font("Ubuntu",Font.BOLD,20));
        savings.setFocusable(false);
        savings.setBounds(10,140,150,40);
        savings.addActionListener(this);

        current.setFont(new Font("Ubuntu",Font.BOLD,20));
        current.setFocusable(false);
        current.setBounds(200,140,150,40);
        current.addActionListener(this);


        ChooseAcctType.setSize(400,400);
        ChooseAcctType.setVisible(true);
        ChooseAcctType.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChooseAcctType.setLayout(null);
        ChooseAcctType.add(chooseAcctType);
        ChooseAcctType.add(savings);
        ChooseAcctType.add(current);
    }

    public void ChooseSavingsWindow(){
        whatDoYouWant.setFont(new Font("Ubuntu",Font.BOLD,20));
        whatDoYouWant.setBounds(70,20,250,40);

        depositSavings.setFont(new Font("Ubuntu",Font.BOLD,20));
        depositSavings.setFocusable(false);
        depositSavings.setBounds(70,100,150,40);
        depositSavings.addActionListener(this);

        withdrawalSavings.setFont(new Font("Ubuntu",Font.BOLD,20));
        withdrawalSavings.setFocusable(false);
        withdrawalSavings.setBounds(70,190,150,40);
        withdrawalSavings.addActionListener(this);

        chooseSavings.setSize(400,400);
        chooseSavings.setVisible(true);
        chooseSavings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chooseSavings.setLayout(null);
        chooseSavings.add(whatDoYouWant);
        chooseSavings.add(depositSavings);
        chooseSavings.add(withdrawalSavings);

    }

    public void ChooseCurrentWindow(){
        WhatDoYouWant.setFont(new Font("Ubuntu",Font.BOLD,20));
        WhatDoYouWant.setBounds(70,20,250,40);

        depositCurrent.setFont(new Font("Ubuntu",Font.BOLD,20));
        depositCurrent.setFocusable(false);
        depositCurrent.setBounds(70,100,150,40);
        depositCurrent.addActionListener(this);

        withdrawalCurrent.setFont(new Font("Ubuntu",Font.BOLD,20));
        withdrawalCurrent.setFocusable(false);
        withdrawalCurrent.setBounds(70,190,150,40);
        withdrawalCurrent.addActionListener(this);

        chooseCurrent.setSize(400,400);
        chooseCurrent.setVisible(true);
        chooseCurrent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chooseCurrent.setLayout(null);
        chooseCurrent.add(WhatDoYouWant);
        chooseCurrent.add(depositCurrent);
        chooseCurrent.add(withdrawalCurrent);

    }

    public void DepositSavingsWindow() {

        enterDepositSavingsAmountLabel.setFont(new Font("Ubuntu", Font.BOLD, 20));
        enterDepositSavingsAmountLabel.setBounds(45, 10, 250, 40);

        amountDepositSavingsLabel.setFont(new Font("Ubuntu", Font.PLAIN, 19));
        amountDepositSavingsLabel.setBounds(45, 50, 250, 40);

        amountDepositSavings.setFont(new Font("Ubuntu", Font.PLAIN, 19));
        amountDepositSavings.setBounds(45, 80, 250, 40);

        depositSavingsButton.setFont(new Font("Ubuntu", Font.BOLD, 19));
        depositSavingsButton.setFocusable(false);
        depositSavingsButton.setBounds(70, 140, 140, 40);
        depositSavingsButton.addActionListener(this);

        DepositAmountSavings.setSize(400, 400);
        DepositAmountSavings.setVisible(true);
        DepositAmountSavings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DepositAmountSavings.setLayout(null);
        DepositAmountSavings.add(enterDepositSavingsAmountLabel);
        DepositAmountSavings.add(amountDepositSavingsLabel);
        DepositAmountSavings.add(amountDepositSavings);
        DepositAmountSavings.add(depositSavingsButton);
    }

    public void WithdrawalSavingsWindow() {

        enterWithdrawalSavingsAmountLabel.setFont(new Font("Ubuntu", Font.BOLD, 20));
        enterWithdrawalSavingsAmountLabel.setBounds(45, 10, 250, 40);

        amountWithdrawalSavingsLabel.setFont(new Font("Ubuntu", Font.PLAIN, 19));
        amountWithdrawalSavingsLabel.setBounds(45, 50, 250, 40);

        amountWithdrawalSavings.setFont(new Font("Ubuntu", Font.PLAIN, 19));
        amountWithdrawalSavings.setBounds(45, 80, 250, 40);

        withdrawalSavingsButton.setFont(new Font("Ubuntu", Font.BOLD, 19));
        withdrawalSavingsButton.setFocusable(false);
        withdrawalSavingsButton.setBounds(70, 140, 140, 40);
        withdrawalSavingsButton.addActionListener(this);

        WithdrawalAmountSavings.setSize(400, 400);
        WithdrawalAmountSavings.setVisible(true);
        WithdrawalAmountSavings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WithdrawalAmountSavings.setLayout(null);
        WithdrawalAmountSavings.add(enterWithdrawalSavingsAmountLabel);
        WithdrawalAmountSavings.add(amountWithdrawalSavings);
        WithdrawalAmountSavings.add(amountWithdrawalSavings);
        WithdrawalAmountSavings.add(withdrawalSavingsButton);
    }

    public void DepositCurrentWindow() {

        enterDepositCurrentAmountLabel.setFont(new Font("Ubuntu", Font.BOLD, 20));
        enterDepositCurrentAmountLabel.setBounds(45, 10, 250, 40);

        amountDepositCurrentLabel.setFont(new Font("Ubuntu", Font.PLAIN, 19));
        amountDepositCurrent.setBounds(45, 50, 250, 40);

        amountDepositCurrent.setFont(new Font("Ubuntu", Font.PLAIN, 19));
        amountDepositCurrent.setBounds(45, 80, 250, 40);

        depositCurrentButton.setFont(new Font("Ubuntu", Font.BOLD, 19));
        depositCurrentButton.setFocusable(false);
        depositCurrentButton.setBounds(70, 140, 140, 40);
        depositCurrentButton.addActionListener(this);

        DepositAmountCurrent.setSize(400, 400);
        DepositAmountCurrent.setVisible(true);
        DepositAmountCurrent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DepositAmountCurrent.setLayout(null);
        DepositAmountCurrent.add(enterDepositCurrentAmountLabel);
        DepositAmountCurrent.add(amountDepositCurrentLabel);
        DepositAmountCurrent.add(amountDepositCurrent);
        DepositAmountCurrent.add(depositCurrentButton);
    }

    public void WithdrawalCurrentWindow() {

        enterWithdrawalCurrentAmountLabel.setFont(new Font("Ubuntu", Font.BOLD, 20));
        enterWithdrawalCurrentAmountLabel.setBounds(45, 10, 250, 40);

        amountWithdrawalCurrentLabel.setFont(new Font("Ubuntu", Font.PLAIN, 19));
        amountWithdrawalCurrentLabel.setBounds(45, 50, 250, 40);

        amountWithdrawalCurrent.setFont(new Font("Ubuntu", Font.PLAIN, 19));
        amountWithdrawalCurrent.setBounds(45, 80, 250, 40);

        withdrawalCurrentButton.setFont(new Font("Ubuntu", Font.BOLD, 19));
        withdrawalCurrentButton.setFocusable(false);
        withdrawalCurrentButton.setBounds(70, 140, 140, 40);
        withdrawalCurrentButton.addActionListener(this);

        WithdrawalAmountCurrent.setSize(400, 400);
        WithdrawalAmountCurrent.setVisible(true);
        WithdrawalAmountCurrent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WithdrawalAmountCurrent.setLayout(null);
        WithdrawalAmountCurrent.add(enterWithdrawalCurrentAmountLabel);
        WithdrawalAmountCurrent.add(amountWithdrawalCurrent);
        WithdrawalAmountCurrent.add(amountWithdrawalCurrent);
        WithdrawalAmountCurrent.add(withdrawalCurrentButton);
    }


    public  void depositSavingsFile(float amount){
        try {
            FileWriter fileWriter = new FileWriter("SavingFile.txt");
            fileWriter.write("Date: "+new Date()+"\n"+"Amount: "+savingsAccount.DepositS(amount));
            JOptionPane.showMessageDialog(null,"Transaction Complete");
            fileWriter.close();
        }catch(IOException e){
            System.out.println("Cannot write to this file");
        }
    }

    public  void withdrawalSavingsFile(float amount){
        try {
            FileWriter fileWriter = new FileWriter("SavingFile.txt");
            if(savingsAccount.WithdrawalS(amount) == 0){
                JOptionPane.showMessageDialog(null,"Cannot withdraw over 10,000","Deposit too high",JOptionPane.ERROR_MESSAGE);
            }else{
                fileWriter.write("Date: "+new Date()+"\n"+"Amount: "+savingsAccount.WithdrawalS(amount));
                JOptionPane.showMessageDialog(null,"Transaction Complete");
            }
            fileWriter.close();
        }catch(IOException e){
            System.out.println("Cannot write to this file");
        }
    }

    public  void depositCurrentFile(float amount){
        try {
            FileWriter fileWriter = new FileWriter("CurrentFile.txt");
            fileWriter.write("Date: "+new Date()+"\n"+"Amount: "+currentAccount.DepositC(amount));
            JOptionPane.showMessageDialog(null,"Transaction Complete");
            fileWriter.close();
        }catch(IOException e){
            System.out.println("Cannot write to this file");
        }
    }

    public  void withdrawalCurrentFile(float amount){
        try {
            FileWriter fileWriter = new FileWriter("CurrentFile.txt");
            fileWriter.write("Date: "+new Date()+"\n"+"Amount: "+savingsAccount.DepositC(amount));
            JOptionPane.showMessageDialog(null,"Transaction Complete");
            fileWriter.close();
        }catch(IOException e){
            System.out.println("Cannot write to this file");
        }
    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource() == login){
            if(pin.getText().equals(pinValue)){
                ChooseAccTypeWindow();
                frame.dispose();
            }else{JOptionPane.showMessageDialog(null,"Pin is incorrect","Incorrect pin",JOptionPane.ERROR_MESSAGE);}
        }else if(e.getSource() == savings) {
            ChooseSavingsWindow();
            ChooseAcctType.dispose();
        }else if(e.getSource() == current){
            ChooseCurrentWindow();
            ChooseAcctType.dispose();
        }else if(e.getSource() == depositSavings) {
            DepositSavingsWindow();
            chooseSavings.dispose();
        }else if(e.getSource() == withdrawalSavings) {
            WithdrawalSavingsWindow();
            chooseSavings.dispose();
        } else if (e.getSource() == depositCurrent) {
            DepositCurrentWindow();
            chooseCurrent.dispose();
        } else if (e.getSource() == withdrawalCurrent) {
            WithdrawalCurrentWindow();
            chooseCurrent.dispose();
        } else if (e.getSource() == depositSavingsButton) {
            try{depositSavingsFile(Float.parseFloat(amountDepositSavings.getText()));}
            catch (Exception f){JOptionPane.showMessageDialog(null,"Use only numbers","Error",JOptionPane.ERROR_MESSAGE);}
        }else if (e.getSource() == withdrawalSavingsButton) {
            try{withdrawalSavingsFile(Float.parseFloat(amountWithdrawalSavings.getText()));}
            catch (Exception f){JOptionPane.showMessageDialog(null,"Use only numbers","Error",JOptionPane.ERROR_MESSAGE);}
        }else if(e.getSource() == depositCurrentButton){
            try{depositCurrentFile(Float.parseFloat(amountDepositCurrent.getText()));}
            catch (Exception f){JOptionPane.showMessageDialog(null,"Use only numbers","Error",JOptionPane.ERROR_MESSAGE);}
        } else if (e.getSource() == withdrawalCurrentButton) {
            try{withdrawalCurrentFile(Float.parseFloat(amountWithdrawalCurrent.getText()));}
            catch (Exception f){JOptionPane.showMessageDialog(null,"Use only numbers","Error",JOptionPane.ERROR_MESSAGE);}
        }
    }

}
