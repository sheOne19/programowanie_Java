package przyk³ad;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.io.Reader;
import java.io.StringReader;

import javax.swing.text.StyleConstants.FontConstants;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.BorderFactory;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JTextArea;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JTextField;

public class Main {
	/**public static int value = 0;
	public static class BasicCSVReader {
	    private static final String SAMPLE_CSV_FILE_PATH = "./users.csv";
	    **/
	public static void main(String[] args) throws FileNotFoundException {
		JFrame frame = new  JFrame();
		frame.setSize(new Dimension(1500, 1000));
		JPanel jPanel=new JPanel();
		frame.add(jPanel); 
		
		   JPanel Panel = new JPanel();
		   GridBagLayout gbPanel0 = new GridBagLayout();
		   GridBagConstraints gbcPanel0 = new GridBagConstraints();
		   Panel.setLayout( gbPanel0 );
	

		   JTextArea taDatabase = new JTextArea(2,10);
		   gbcPanel0.gridx = 12;
		   gbcPanel0.gridy = 0;
		   gbcPanel0.gridwidth = 8;
		   gbcPanel0.gridheight = 16;
		   gbcPanel0.fill = GridBagConstraints.BOTH;
		   gbcPanel0.weightx = 1;
		   gbcPanel0.weighty = 1;
		   gbcPanel0.anchor = GridBagConstraints.NORTH;
		   gbPanel0.setConstraints( taDatabase, gbcPanel0 );
		   Panel.add( taDatabase );
		   
		   
	    
		   

		   JButton btUpload_button = new JButton( "Upload database"  );
		   gbcPanel0.gridx = 15;
		   gbcPanel0.gridy = 17;
		   gbcPanel0.gridwidth = 4;
		   gbcPanel0.gridheight = 2;
		   gbcPanel0.fill = GridBagConstraints.BOTH;
		   gbcPanel0.weightx = 1;
		   gbcPanel0.weighty = 0;
		   gbcPanel0.anchor = GridBagConstraints.NORTH;
		   
		   gbPanel0.setConstraints( btUpload_button, gbcPanel0 );
		   Panel.add( btUpload_button );

		   JButton btAdd_button = new JButton( "add new member"  );
		   gbcPanel0.gridx = 1;
		   gbcPanel0.gridy = 4;
		   gbcPanel0.gridwidth = 7;
		   gbcPanel0.gridheight = 2;
		   gbcPanel0.fill = GridBagConstraints.BOTH;
		   gbcPanel0.weightx = 1;
		   gbcPanel0.weighty = 0;
		   gbcPanel0.anchor = GridBagConstraints.NORTH;
		   gbPanel0.setConstraints( btAdd_button, gbcPanel0 );
		   Panel.add( btAdd_button );

		   JTextField tfInput = new JTextField( );
		   gbcPanel0.gridx = 1;
		   gbcPanel0.gridy = 1;
		   gbcPanel0.gridwidth = 7;
		   gbcPanel0.gridheight = 2;
		   gbcPanel0.fill = GridBagConstraints.BOTH;
		   gbcPanel0.weightx = 1;
		   gbcPanel0.weighty = 0;
		   gbcPanel0.anchor = GridBagConstraints.NORTH;
		   gbPanel0.setConstraints( tfInput, gbcPanel0 );
		   Panel.add( tfInput );

		   JButton btDelete_member = new JButton( "`delete last member"  );
		   gbcPanel0.gridx = 1;
		   gbcPanel0.gridy = 9;
		   gbcPanel0.gridwidth = 7;
		   gbcPanel0.gridheight = 2;
		   gbcPanel0.fill = GridBagConstraints.BOTH;
		   gbcPanel0.weightx = 1;
		   gbcPanel0.weighty = 0;
		   gbcPanel0.anchor = GridBagConstraints.NORTH;
		   gbPanel0.setConstraints( btDelete_member, gbcPanel0 );
		   Panel.add( btDelete_member );
		
		
		 
		
		
		   frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		   frame.setContentPane( Panel );
		   frame.pack();
		   frame.setVisible( true );
	}
}
		     

		 
		
		
		
		
		/*
		

		
		Scanner scanner = new Scanner(new File("/shelukhov/file.csv"));
        scanner.useDelimiter(";");
        while(scanner.hasNext()){
            System.out.print(scanner.next()+"|");
        }
        scanner.close(); */
	    
		
		
		


