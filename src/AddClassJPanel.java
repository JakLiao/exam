
import javax.swing.*;   
/**  
 *  
 * @author  drawen  
 */   
public class AddClassJPanel extends javax.swing.JPanel {   
       
    /** Creates new form AddClassJPanel */   
    public AddClassJPanel() {   
        initComponents();   
        this.input.setEnabled(false);   
    }   
       
    /** This method is called from within the constructor to  
     * initialize the form.  
     * WARNING: Do NOT modify this code. The content of this method is  
     * always regenerated by the Form Editor.  
     */   
    // <editor-fold defaultstate="collapsed" desc=" 生成的代码 ">//GEN-BEGIN:initComponents   
    private void initComponents() {   
        jPanel1 = new javax.swing.JPanel();   
        jLabel6 = new javax.swing.JLabel();   
        jLabel7 = new javax.swing.JLabel();   
        jLabel8 = new javax.swing.JLabel();   
        jLabel9 = new javax.swing.JLabel();   
        jLabel10 = new javax.swing.JLabel();   
        grade1 = new javax.swing.JTextField();   
        major1 = new javax.swing.JTextField();   
        classNumber1 = new javax.swing.JTextField();   
        studentNumber1 = new javax.swing.JTextField();   
        confirm1 = new javax.swing.JButton();   
        cancel1 = new javax.swing.JButton();   
        jLabel1 = new javax.swing.JLabel();   
        jLabel2 = new javax.swing.JLabel();   
        jLabel3 = new javax.swing.JLabel();   
        jLabel4 = new javax.swing.JLabel();   
        jLabel5 = new javax.swing.JLabel();   
        grade = new javax.swing.JTextField();   
        major = new javax.swing.JTextField();   
        classNumber = new javax.swing.JTextField();   
        studentNumber = new javax.swing.JTextField();   
        confirm = new javax.swing.JButton();   
        cancel = new javax.swing.JButton();   
        text = new javax.swing.JLabel();   
        id = new javax.swing.JTextField();   
        input = new javax.swing.JButton();   
        jLabel11 = new javax.swing.JLabel();   
        jLabel12 = new javax.swing.JLabel();   
        name = new javax.swing.JTextField();   
   
        jLabel6.setText("\u589e\u52a0\u73ed\u7ea7\u4fe1\u606f");   
   
        jLabel7.setText("\u5e74\u7ea7\uff1a");   
   
        jLabel8.setText("\u4e13\u4e1a\uff1a");   
   
        jLabel9.setText("\u73ed\u53f7\uff1a");   
   
        jLabel10.setText("\u5b66\u751f\u4eba\u6570\uff1a");   
   
        confirm1.setText("\u786e\u5b9a");   
        confirm1.addActionListener(new java.awt.event.ActionListener() {   
            public void actionPerformed(java.awt.event.ActionEvent evt) {   
                confirm1ButtonActionListener(evt);   
            }   
        });   
   
        cancel1.setText("\u53d6\u6d88");   
   
        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);   
        jPanel1.setLayout(jPanel1Layout);   
        jPanel1Layout.setHorizontalGroup(   
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)   
            .add(jPanel1Layout.createSequentialGroup()   
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)   
                    .add(jPanel1Layout.createSequentialGroup()   
                        .add(152, 152, 152)   
                        .add(jLabel6))   
                    .add(jPanel1Layout.createSequentialGroup()   
                        .add(49, 49, 49)   
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)   
                            .add(jLabel10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)   
                            .add(jLabel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)   
                            .add(jLabel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)   
                            .add(jLabel9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))   
                        .add(72, 72, 72)   
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)   
                            .add(grade1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)   
                            .add(major1)   
                            .add(classNumber1)   
                            .add(studentNumber1)))   
                    .add(jPanel1Layout.createSequentialGroup()   
                        .add(126, 126, 126)   
                        .add(confirm1)   
                        .add(30, 30, 30)   
                        .add(cancel1)))   
                .addContainerGap(30, Short.MAX_VALUE))   
        );   
        jPanel1Layout.setVerticalGroup(   
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)   
            .add(jPanel1Layout.createSequentialGroup()   
                .add(21, 21, 21)   
                .add(jLabel6)   
                .add(24, 24, 24)   
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)   
                    .add(jLabel7)   
                    .add(grade1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))   
                .add(26, 26, 26)   
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)   
                    .add(jLabel8)   
                    .add(major1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))   
                .add(21, 21, 21)   
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)   
                    .add(jLabel9)   
                    .add(classNumber1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))   
                .add(21, 21, 21)   
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)   
                    .add(jLabel10)   
                    .add(studentNumber1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))   
                .add(29, 29, 29)   
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)   
                    .add(confirm1)   
                    .add(cancel1))   
                .addContainerGap(40, Short.MAX_VALUE))   
        );   
   
        jLabel1.setText("\u589e\u52a0\u73ed\u7ea7\u4fe1\u606f");   
   
        jLabel2.setText("\u5e74\u7ea7\uff1a");   
   
        jLabel3.setText("\u4e13\u4e1a\uff1a");   
   
        jLabel4.setText("\u73ed\u53f7\uff1a");   
   
        jLabel5.setText("\u5b66\u751f\u4eba\u6570\uff1a");   
   
        grade.setText("2005");   
   
        major.setText("\u8ba1\u7b97\u673a\u79d1\u5b66\u4e0e\u6280\u672f");   
   
        classNumber.setText("3");   
   
        confirm.setText("\u786e\u5b9a");   
        confirm.addActionListener(new java.awt.event.ActionListener() {   
            public void actionPerformed(java.awt.event.ActionEvent evt) {   
                confirmButtonActionListener(evt);   
            }   
        });   
   
        cancel.setText("\u53d6\u6d88");   
        cancel.addActionListener(new java.awt.event.ActionListener() {   
            public void actionPerformed(java.awt.event.ActionEvent evt) {   
                cancelButtonActionListener(evt);   
            }   
        });   
   
        id.setEditable(false);   
   
        input.setText("\u8f93\u5165");   
        input.addActionListener(new java.awt.event.ActionListener() {   
            public void actionPerformed(java.awt.event.ActionEvent evt) {   
                inputButtonActionListener(evt);   
            }   
        });   
   
        jLabel11.setText("\u5b66\u53f7\uff1a");   
   
        jLabel12.setText("\u59d3\u540d\uff1a");   
   
        name.setEditable(false);   
   
        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);   
        this.setLayout(layout);   
        layout.setHorizontalGroup(   
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)   
            .add(layout.createSequentialGroup()   
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)   
                    .add(layout.createSequentialGroup()   
                        .add(49, 49, 49)   
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)   
                            .add(layout.createSequentialGroup()   
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)   
                                    .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)   
                                    .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)   
                                    .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))   
                                .add(15, 15, 15))   
                            .add(layout.createSequentialGroup()   
                                .add(jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)   
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))   
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)   
                            .add(studentNumber)   
                            .add(classNumber)   
                            .add(major, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)   
                            .add(grade, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))   
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)   
                            .add(layout.createSequentialGroup()   
                                .add(19, 19, 19)   
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)   
                                    .add(jLabel11)   
                                    .add(jLabel12))   
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)   
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)   
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, id)   
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, name, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)   
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, input))   
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))   
                            .add(layout.createSequentialGroup()   
                                .add(27, 27, 27)   
                                .add(text, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 142, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))   
                    .add(layout.createSequentialGroup()   
                        .add(68, 68, 68)   
                        .add(confirm)   
                        .add(40, 40, 40)   
                        .add(cancel)))   
                .add(101, 101, 101))   
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()   
                .addContainerGap(153, Short.MAX_VALUE)   
                .add(jLabel1)   
                .add(276, 276, 276))   
        );   
        layout.setVerticalGroup(   
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)   
            .add(layout.createSequentialGroup()   
                .add(21, 21, 21)   
                .add(jLabel1)   
                .add(24, 24, 24)   
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)   
                    .add(jLabel2)   
                    .add(grade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)   
                    .add(text, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))   
                .add(26, 26, 26)   
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)   
                    .add(jLabel3)   
                    .add(major, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)   
                    .add(jLabel11)   
                    .add(id, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))   
                .add(21, 21, 21)   
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)   
                    .add(jLabel4)   
                    .add(classNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)   
                    .add(jLabel12)   
                    .add(name, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))   
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)   
                    .add(layout.createSequentialGroup()   
                        .add(21, 21, 21)   
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)   
                            .add(studentNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)   
                            .add(jLabel5))   
                        .add(32, 32, 32)   
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)   
                            .add(confirm)   
                            .add(cancel)))   
                    .add(layout.createSequentialGroup()   
                        .add(47, 47, 47)   
                        .add(input)))   
                .addContainerGap(36, Short.MAX_VALUE))   
        );   
    }// </editor-fold>//GEN-END:initComponents   
   
    private void cancelButtonActionListener(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionListener   
        int i=JOptionPane.showConfirmDialog(null,"确定要取消此输入此班级的信息","确认",JOptionPane.OK_CANCEL_OPTION);   
        if(i==0)   
            reset();   
    }//GEN-LAST:event_cancelButtonActionListener   
    private void reset(){   
        this.grade.setEditable(true);   
        this.major.setEditable(true);   
        this.classNumber.setEditable(true);   
        this.studentNumber.setEditable(true);   
        this.confirm.setEnabled(true);   
        this.input.setEnabled(false);   
        this.text.setText("");   
        this.id.setText("");   
        this.name.setText("");   
        this.id.setEditable(false);   
        this.name.setEditable(false);   
    }   
    private void inputButtonActionListener(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputButtonActionListener   
        Student student;   
        try{   
            if((student=Student.queryFromFile(Long.parseLong(this.id.getText())))==null){   
                JOptionPane.showMessageDialog(null,"学生文件中没有此学生的记录\n","出错",JOptionPane.ERROR_MESSAGE);   
                return;   
            }   
            else if(!student.getName().equals(name.getText())){   
                JOptionPane.showMessageDialog(null,"学生名称与学号不一致\n","出错",JOptionPane.ERROR_MESSAGE);   
                return;   
            }   
            if(!(currentClass.addStudent(student))){   
                JOptionPane.showMessageDialog(null,"班级中已经存在此学号的学生记录\n","出错",JOptionPane.ERROR_MESSAGE);   
                return;   
            }   
            JOptionPane.showMessageDialog(null,"已经成功记录第"+currentNumber+"个学生信息","成功",JOptionPane.WARNING_MESSAGE);   
            currentNumber++;   
            if(currentNumber>number){   
                currentClass.saveToFile();   
                JOptionPane.showMessageDialog(null,"已经成功增加班级信息\n","结果",JOptionPane.WARNING_MESSAGE);   
                reset();   
                return;   
            }   
            this.text.setText("请输入第"+currentNumber+"个学生信息");   
        }catch(Exception e){   
            JOptionPane.showMessageDialog(null,"输入的学生信息格式有误\n","出错",JOptionPane.ERROR_MESSAGE);   
        }   
    }//GEN-LAST:event_inputButtonActionListener   
   
    private void confirm1ButtonActionListener(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm1ButtonActionListener   
// TODO 将在此处添加您的处理代码：   
    }//GEN-LAST:event_confirm1ButtonActionListener   
   
    private void confirmButtonActionListener(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionListener   
        int grade,classNumber;   
        String major;   
        try{   
            grade=Integer.parseInt(this.grade.getText());   
            classNumber=Integer.parseInt(this.classNumber.getText());   
            number=Integer.parseInt(this.studentNumber.getText());   
            major=this.major.getText();   
            currentClass=new Class(grade,major,classNumber,0,null);   
            if(number<=0){   
                currentClass=null;   
                JOptionPane.showMessageDialog(null,"输入班级人数非法","出错",JOptionPane.ERROR_MESSAGE);   
            }   
            else{                   
                if(Class.queryFromFile(grade,major,classNumber)!=null){   
                    currentClass=null;   
                    JOptionPane.showMessageDialog(null,"班级信息已经存在","出错",JOptionPane.ERROR_MESSAGE);   
                    return;   
                }   
                this.grade.setEditable(false);   
                this.major.setEditable(false);   
                this.classNumber.setEditable(false);   
                this.studentNumber.setEditable(false);   
                this.confirm.setEnabled(false);   
                this.input.setEnabled(true);   
                this.id.setEditable(true);   
                this.name.setEditable(true);   
                this.text.setText("请输入第1个学生信息");   
                this.currentNumber=1;   
            }   
        }catch(Exception e){   
            currentClass=null;   
            JOptionPane.showMessageDialog(null,"输入班级信息格式有误","出错",JOptionPane.ERROR_MESSAGE);               
        }   
    }//GEN-LAST:event_confirmButtonActionListener   
    private Class currentClass=null;   
    private int number;   
    private int currentNumber;   
    // 变量声明 - 不进行修改//GEN-BEGIN:variables   
    private javax.swing.JButton cancel;   
    private javax.swing.JButton cancel1;   
    private javax.swing.JTextField classNumber;   
    private javax.swing.JTextField classNumber1;   
    private javax.swing.JButton confirm;   
    private javax.swing.JButton confirm1;   
    private javax.swing.JTextField grade;   
    private javax.swing.JTextField grade1;   
    private javax.swing.JTextField id;   
    private javax.swing.JButton input;   
    private javax.swing.JLabel jLabel1;   
    private javax.swing.JLabel jLabel10;   
    private javax.swing.JLabel jLabel11;   
    private javax.swing.JLabel jLabel12;   
    private javax.swing.JLabel jLabel2;   
    private javax.swing.JLabel jLabel3;   
    private javax.swing.JLabel jLabel4;   
    private javax.swing.JLabel jLabel5;   
    private javax.swing.JLabel jLabel6;   
    private javax.swing.JLabel jLabel7;   
    private javax.swing.JLabel jLabel8;   
    private javax.swing.JLabel jLabel9;   
    private javax.swing.JPanel jPanel1;   
    private javax.swing.JTextField major;   
    private javax.swing.JTextField major1;   
    private javax.swing.JTextField name;   
    private javax.swing.JTextField studentNumber;   
    private javax.swing.JTextField studentNumber1;   
    private javax.swing.JLabel text;   
    // 变量声明结束//GEN-END:variables   
   
}  
