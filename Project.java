import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project extends JFrame implements ActionListener {
    Project(){
        setSize(1540,850);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
//New Information
        JMenuBar mb=new JMenuBar();
        JMenu newInformation=new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        JMenuItem facultyInfo=new JMenuItem("New Faculty Information");
        facultyInfo.setForeground(Color.BLACK);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        JMenuItem studentinfo=new JMenuItem("New Student Information");
        studentinfo.setForeground(Color.black);
        studentinfo.addActionListener(this);
        newInformation.add(studentinfo);

        setJMenuBar(mb);
//Details
        JMenu details=new JMenu(" View Details");
        details.setForeground(Color.red);
        mb.add(details);

        JMenuItem facultydetails=new JMenuItem("View Faculty Details");
        facultydetails.setForeground(Color.BLACK);
        facultydetails.addActionListener(this);
      details.add(facultydetails);

        JMenuItem studentdetails=new JMenuItem("View Student Details");
        studentdetails.setForeground(Color.black);
        studentdetails.addActionListener(this);
        details.add(studentdetails);

        setJMenuBar(mb);
//leave
        JMenu leave=new JMenu(" Apply Leave");
        leave.setForeground(Color.red);
        mb.add(leave);
        JMenuItem facultyleave=new JMenuItem("Faculty Leave ");
        facultyleave.setForeground(Color.BLACK);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);

        JMenuItem studentleave=new JMenuItem("Student Leave");
        studentleave.setForeground(Color.black);
        studentleave.addActionListener(this);
        leave.add(studentleave);
        setJMenuBar(mb);
//leave details
        JMenu leaveDetails=new JMenu(" View Leave Details");
        leaveDetails.setForeground(Color.blue);
        mb.add(leaveDetails);

        JMenuItem facultyleaveDetails=new JMenuItem("Faculty Leave Details");
        facultyleaveDetails.setForeground(Color.BLACK);
        facultyleaveDetails.addActionListener(this);
        leaveDetails.add(facultyleaveDetails);

        JMenuItem studentleaveDetails=new JMenuItem("Student Leave Details" );
        studentleaveDetails.setForeground(Color.black);
        studentleaveDetails.addActionListener(this);
        leaveDetails.add(studentleaveDetails);
        setJMenuBar(mb);

        //updateInfo
        JMenu updateinfo=new JMenu(" Update Details");
        updateinfo.setForeground(Color.blue);
        mb.add(updateinfo);

        JMenuItem updatefacultyinfo=new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setForeground(Color.BLACK);
        updatefacultyinfo.addActionListener(this);
        updateinfo.add(updatefacultyinfo);

        JMenuItem updatestudentinfo=new JMenuItem("Update Student Details" );
        updatestudentinfo.setForeground(Color.black);
        updatestudentinfo.addActionListener(this);
        updateinfo.add(updatestudentinfo);
        setJMenuBar(mb);

        //fee

        JMenu fee=new JMenu(" Fee Details");
        fee.setForeground(Color.blue);
        mb.add(fee);

        JMenuItem feestructures=new JMenuItem("Student Fee Structures");
        feestructures.setForeground(Color.BLACK);
        feestructures.addActionListener(this);
        fee.add(feestructures);

//        setJMenuBar(mb);

// utility

        JMenu utility=new JMenu(" Utility");
        utility.setForeground(Color.blue);
        mb.add(utility);
        JMenuItem notepad=new JMenuItem("NotePad");
        notepad.setForeground(Color.BLACK);
        notepad.addActionListener(this );
        utility.add(notepad);
        JMenuItem calc=new JMenuItem("Calculator" );
        calc.setForeground(Color.black);
        calc.addActionListener(this );
        utility.add(calc);
        setJMenuBar(mb);
//ABout
        JMenu about=new JMenu(" About");
        about.setForeground(Color.red);
        mb.add(about);

        JMenuItem ab=new JMenuItem("About");
        ab.setForeground(Color.BLACK);
        ab.addActionListener(this );
        about.add(ab);

        //exit

        JMenu exit=new JMenu(" Exit");
        exit.setForeground(Color.blue);
        mb.add(exit);
        JMenuItem ex=new JMenuItem("Exit");
        ex.setForeground(Color.BLACK);
        ex.addActionListener(this );
        exit.add(ex);

        setJMenuBar(mb);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String msg=ae.getActionCommand();
        if(msg.equals("Exit")){
            setVisible(false);
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){

            }
        }else if (msg.equals("NotePad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e){

            }
        } else if (msg.equals("New Faculty Information")) {
            new AddTeacher();

        }else if (msg.equals("New Student Information")){
            new AddStudent();

        }else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();

        }else if (msg.equals("View Student Details")){
            new StudentDetails();

            }else if (msg.equals("Faculty Leave ")){
            new TeacherLeave();

        }else if (msg.equals("Student Leave")){
            new StudentLeave();

        }else if (msg.equals("Faculty Leave Details")){
            new TeacherLeaveDetails();

        }else if (msg.equals("Student Leave Details")){
            new StudentLeaveDetails();
        }else if (msg.equals("Update Faculty Details")){
            new UpdateTeacher();

        }else if (msg.equals("Update Student Details")){
            new UpdateStudent();
        }else if (msg.equals("Student Fee Structures")){
            new FeeStructure();
        }else if (msg.equals("About")){
            new About();
        }
    }


    public static void main(String[] args) {

        new  Project();
    }
}
