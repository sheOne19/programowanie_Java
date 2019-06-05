package shelukhov_java_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Gl�wny extends javax.swing.JFrame {


    public Gl�wny() {
        initComponents();
        Show_Users_In_JTable();
    }
    
   public Connection getConnection()
   {
       Connection con;
       try {
           con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?user=root?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root","12345678");
          // jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=EU

           return con;
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
   }
        

   public ArrayList<User> getUsersList()
   {
       ArrayList<User> usersList = new ArrayList<User>();
       Connection connection = getConnection();
       
       String query = "SELECT * FROM  users ";
       Statement st;
       ResultSet rs;
       
       try {
           st = connection.createStatement();
           rs = st.executeQuery(query);
           User user;
           while(rs.next())
           {
               user = new User(rs.getInt("id"),rs.getString("fname"),rs.getString("lname"),rs.getInt("age"));
               usersList.add(user);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       return usersList;
   }
   
   
   public void Show_Users_In_JTable()
   {
       ArrayList<User> list = getUsersList();
       DefaultTableModel model = (DefaultTableModel)jTable_Display_Users.getModel();
       Object[] row = new Object[4];
       for(int i = 0; i < list.size(); i++)
       {
           row[0] = list.get(i).getId();
           row[1] = list.get(i).getFirstName();
           row[2] = list.get(i).getLastNAme();
           row[3] = list.get(i).getAge();
           
           model.addRow(row);
       }
    }
        
   public void executeSQlQuery(String query, String message)
   {
       Connection con = getConnection();
       Statement st;
       try{
           st = con.createStatement();
           if((st.executeUpdate(query)) == 1)
           {
               
               DefaultTableModel model = (DefaultTableModel)jTable_Display_Users.getModel();
               model.setRowCount(0);
               Show_Users_In_JTable();
               
               JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
           }else{
               JOptionPane.showMessageDialog(null, "Data Not "+message);
           }
       }catch(Exception ex){
           ex.printStackTrace();
       }
   }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jTextField_FirstName = new javax.swing.JTextField();
        jTextField_LastName = new javax.swing.JTextField();
        jTextField_Age = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Users = new javax.swing.JTable();
        jButton_Insert = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("First Name:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Age:");

        jTextField_Id.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jTextField_FirstName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FirstNameActionPerformed(evt);
            }
        });

        jTextField_LastName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LastNameActionPerformed(evt);
            }
        });

        jTextField_Age.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AgeActionPerformed(evt);
            }
        });

        jTable_Display_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Age"
            }
        ));
        jTable_Display_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_UsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_Users);
        int value;

        jButton_Insert.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton_Insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/add.png"))); // NOI18N
        jButton_Insert.setText("Insert" );
        jButton_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InsertActionPerformed(evt);
            }
        });

        jButton_Update.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/refresh.png"))); // NOI18N
        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.Action
Event evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Delete.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/delete.png"))); // NOI18N
        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_Insert)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jButton_Delete)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(192, 192, 192))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    

    private void jTextField_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void jTextField_LastNameActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void jTextField_AgeActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

 // show jtable row data in jtextfields in the mouse clicked event
    private void jTable_Display_UsersMouseClicked(java.awt.event.MouseEvent evt) {                                                  
        // Get The Index Of The Slected Row
        int i = jTable_Display_Users.getSelectedRow();

        TableModel model = jTable_Display_Users.getModel();
        
         // Display Slected Row In JTexteFields
        jTextField_Id.setText(model.getValueAt(i,0).toString());

        jTextField_FirstName.setText(model.getValueAt(i,1).toString());
   jTextField_LastName.setText(model.getValueAt(i,2).toString());

        jTextField_Age.setText(model.getValueAt(i,3).toString());
    }                                                 

 // Button Insert
    private void jButton_InsertActionPerformed(java.awt.event.ActionEvent evt) {                                               
        String query = "INSERT INTO `users`(`Id`,`fname`, `lname`, `age`) VALUES ('"+jTextField_Id.getText()+"','"+jTextField_FirstName.getText()+"','"+jTextField_LastName.getText()+"',"+jTextField_Age.getText()+")";

        jButton_Insert.setText("GGWP" );
        executeSQlQuery(query, "Inserted");
    }


 //Button Update
    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {                                               
       String query = "UPDATE `users` SET `fname`='"+jTextField_FirstName.getText()+"',`lname`='"+jTextField_LastName.getText()+"',`age`="+jTextField_Age.getText()+" WHERE `id` = "+jTextField_Id.getText();
       executeSQlQuery(query, "Updated");
    }                                              


//Button Delete
    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {                                               
        String query = "DELETE FROM `users` WHERE id = "+jTextField_Id.getText();
         executeSQlQuery(query, "Deleted");
    }                                              

   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(java_insert_update_delete_display_tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(java_insert_update_delete_display_tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(java_insert_update_delete_display_tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(java_insert_update_delete_display_tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new java_insert_update_delete_display_tutorial().setVisible(true);
            }
                            
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Insert;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Users;
    private javax.swing.JTextField jTextField_Age;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_LastName;  
        }
    }
    }
}