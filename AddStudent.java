import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class AddStudent extends JFrame implements ActionListener {
        JTextField tfname,tffname,tfaddress,tfphone,tfemail,tfx,tfxii,tfcitizenshipcardno;
        JLabel labelrollno;
        JDateChooser dcdob;
        JComboBox cbcourse,cbbranch;
        JButton submit,cancel;
        Random ran =new Random();
       //Generating random number for roll number
        long first4= Math.abs((ran.nextLong() % 9000L)+1000L);
     AddStudent(){
        setSize(900,700);
        setLocation(350,50);
        setLayout(null);

        JLabel heading =new JLabel("New Student Details");
        heading.setBounds(310,30,500,50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);

        JLabel lblname =new JLabel("Name");
        lblname.setBounds(50,150,100,30);
        lblname.setFont(new Font("serif",Font.BOLD,20));
        add(lblname);

        tfname =new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);

        JLabel lblfname =new JLabel("Father's Name");
        lblfname.setBounds(400,150,200,30);
        lblfname.setFont(new Font("serif",Font.BOLD,20));
        add(lblfname);

        tffname =new JTextField();
        tffname.setBounds(600,150,150,30);
        add(tffname);

        JLabel lblrollno =new JLabel("Roll Number:");
        lblrollno.setBounds(50,200,200,30);
        lblrollno.setFont(new Font("serif",Font.BOLD,20));
        add(lblrollno);

        labelrollno =new JLabel(" 2023BSE03"+first4);
        labelrollno.setBounds(200,200,200,30);
        labelrollno.setFont(new Font("serif",Font.BOLD,20));
        add(labelrollno);


        JLabel lbldob =new JLabel(" Date Of Birth");
        lbldob.setBounds(400,200,200,30);
        lbldob.setFont(new Font("serif",Font.BOLD,20));
        add(lbldob);

        dcdob=new JDateChooser();
        dcdob.setBounds(600,200,150,30);
        add(dcdob);

        JLabel lbladdress =new JLabel("Address:");
        lbladdress.setBounds(50,250,200,30);
        lbladdress.setFont(new Font("serif",Font.BOLD,20));
        add(lbladdress);

        tfaddress =new JTextField();
        tfaddress.setBounds(200,250,150,30);
        add(tfaddress);

        JLabel lblphone =new JLabel("Phone number:");
        lblphone.setBounds(400,250,200,30);
        lblphone.setFont(new Font("serif",Font.BOLD,20));
        add(lblphone);

        tfphone =new JTextField();
        tfphone.setBounds(600,250,150,30);
        add(tfphone);


        JLabel lblemail =new JLabel("Email Id:");
        lblemail.setBounds(50,300,200,30);
        lblemail.setFont(new Font("serif",Font.BOLD,20));
        add(lblemail);

        tfemail =new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);

        JLabel lblx =new JLabel("Class 10 GPA");
        lblx.setBounds(400,300,200,30);
        lblx.setFont(new Font("serif",Font.BOLD,20));
        add(lblx);

        tfx =new JTextField();
        tfx.setBounds(600,300,150,30);
        add(tfx);

        JLabel lblxii =new JLabel("Class 12 GPA");
        lblxii.setBounds(50,350,200,30);
        lblxii.setFont(new Font("serif",Font.BOLD,20));
        add(lblxii);

        tfxii =new JTextField();
        tfxii.setBounds(200,350,150,30);
        add(tfxii);

        JLabel lblcitizenshipcardno =new JLabel("Citizenship Number:");
        lblcitizenshipcardno.setBounds(400,350,200,30);
        lblcitizenshipcardno.setFont(new Font("serif",Font.BOLD,20));
        add(lblcitizenshipcardno);

        tfcitizenshipcardno =new JTextField();
        tfcitizenshipcardno.setBounds(600,350,150,30);
        add(tfcitizenshipcardno);

        JLabel lblcourse =new JLabel("Course");
        lblcourse.setBounds(50,400,200,30);
        lblcourse.setFont(new Font("serif",Font.BOLD,20));
        add(lblcourse);

       String course[]={"B.Tech","BBA","BCA","BSE","BEE","MSE"};

        cbcourse =new JComboBox(course);
        cbcourse.setBounds(200,400,150,30);
        cbcourse.setBackground(Color.white);
        add(cbcourse);

        JLabel lblbranch =new JLabel("Branch");
        lblbranch.setBounds(400,400,200,30);
        lblbranch.setFont(new Font("serif",Font.BOLD,20));
        add(lblbranch);

        String branch[]={"Computer Science","Electrical","Mechanicial","Civil","IT"};
        cbbranch =new JComboBox(branch);
        cbbranch.setBounds(600,400,150,30);
        cbbranch.setBackground(Color.white);
        add(cbbranch);

        submit=new JButton("Submit");
        submit.setBounds(250,550,120,30);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma",Font.BOLD,16));
        add(submit);

        cancel=new JButton("Cancel");
        cancel.setBounds(450,550,120,30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma",Font.BOLD,16));
        add(cancel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String name = tfname.getText();
            String fname = tffname.getText();
            String rollno = labelrollno.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String class_x = tfx.getText();
            String class_xii = tfxii.getText();
            String citizenshipcardno = tfcitizenshipcardno.getText();
            String course = (String) cbcourse.getSelectedItem();
            String branch = (String) cbbranch.getSelectedItem();

            try {
                    String query = "INSERT INTO student VALUES('" + name + "' , '" + fname + "' , '"+rollno+"', '" + dob + "' , '" + address + "' , '" + phone + "' , '" + email + "' , '" + class_x + "' , '" + class_xii + "' , '" + citizenshipcardno + "' , '" + course + "' , '" + branch + "' )";
                    Conn con = new Conn();
                    con.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Student Details inserted Successfully!!");
                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }


    public static void main(String[] args) {
        new AddStudent();
    }
}
