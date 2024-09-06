    import javax.swing.*;
    import java.awt.event.*;             //awt- abstarct window toolkit
    import java.awt.Color;
    import java.awt.Font;
    class no_budget extends Exception{
    void show()
    {
    System.out.println("budget not sufficient! not available");
    }
    }
    class Tourist extends JFrame  implements   ActionListener
    {
        JFrame	jf=new JFrame("Tourist Site");          //jf=title
        JButton jb1,jb2;
        JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8;           
        JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14;    
        JRadioButton rb1,rb2,rb3,rb4;
        Tourist ()
        {
            
            jl1=new JLabel("Hello!! Jobers,Here you get the weekend plan & long trips plan");
            jl1.setFont(new Font("Verdana",Font.BOLD,40));
            jl1.setBounds(50,30,1800,50); 
            jf.add(jl1); 
            
            jl2=new JLabel("Our Tour Packages start from  Warangal");
            jl2.setFont(new Font("Verdana",Font.BOLD,30));
            jl2.setBounds(50,90,800,40); 
            jf.add(jl2); 
            
            jl3=new JLabel("Choose any of the below options based on your holidays");
            jl3.setFont(new Font("Verdana",Font.PLAIN,25));
            jl3.setBounds(50,150,800,40); 
            jf.add(jl3); 
            
            
            rb1=new JRadioButton("1 Day");
            rb1.setFont(new Font("Verdana",Font.PLAIN,20));
            rb1.setBounds(50,210,100,50);
            jf.add(rb1);
            rb1.addActionListener(this);
            
            rb2=new JRadioButton("2 days");
            rb2.setFont(new Font("Verdana",Font.PLAIN,20));
            rb2.setBounds(50,250,100,50);
            jf.add(rb2);
            rb2.addActionListener(this);
            
            rb3=new JRadioButton("3 Days");
            rb3.setFont(new Font("Verdana",Font.PLAIN,20));
            rb3.setBounds(50,290,100,50);
            jf.add(rb3);
            rb3.addActionListener(this);
            
            rb4=new JRadioButton( "1 week");
            rb4.setFont(new Font("Verdana",Font.PLAIN,20));
            rb4.setBounds(50,330,100,50);
            jf.add(rb4);
            rb4.addActionListener(this);
            
            ButtonGroup bg=new ButtonGroup();//if we want to chose only 1 among all radio buttons we use  Buttongroup
            bg.add(rb1);
            bg.add(rb2);
            bg.add(rb3);
            bg.add(rb4);
            
            jl4=new JLabel("enter your weekend days:Sunday,Monday,Saturday");
            jl4.setFont(new Font("Verdana",Font.PLAIN,25));
            jl4.setBounds(50,390,1800,40); 
            jf.add(jl4); 
            
            jl5=new JLabel("day 1");
            jl5.setFont(new Font("Verdana",Font.PLAIN,20));
            jl5.setBounds(20,450,180,40); 
            jf.add(jl5);  
            
            jt1=new JTextField(20);
            jt1.setBounds(180,450,120,40); 
            jf.add(jt1);
            
            jl12=new JLabel("day 2");
            jl12.setFont(new Font("Verdana",Font.PLAIN,20));
            jl12.setBounds(340,450,150,40); 
            jf.add(jl12);
            
            jt6=new JTextField(20);
            jt6.setBounds(450,450,120,40); 
            jf.add(jt6);
            
            jl14=new JLabel("day 3");
            jl14.setFont(new Font("Verdana",Font.PLAIN,20));
            jl14.setBounds(600,450,150,40); 
            jf.add(jl14);
            
            jt7=new JTextField(20);
            jt7.setBounds(690,450,120,40); 
            jf.add(jt7);
            
            jl6=new JLabel("Here the budget you mentioned is for each person");
            jl6.setFont(new Font("Verdana",Font.PLAIN,25));
            jl6.setBounds(380,510,800,40); 
            jf.add(jl6); 
            
            jl7=new JLabel(" ");
            jl7.setFont(new Font("Lucida Sans Typewriter",Font.PLAIN,25));
            jl7.setForeground(Color.blue);
            jl7.setBounds(380,570,800,40); 
            jf.add(jl7); 
            
            jl8=new JLabel("enter your budget:");
            jl8.setFont(new Font("Verdana",Font.PLAIN,20));
            jl8.setBounds(380,630,800,40); 
            jf.add(jl8); 
            
            jt2=new JTextField(20);
            jt2.setBounds(710,630,240,40); 
            jf.add(jt2);
            
            jl9=new JLabel("number of members");
            jl9.setFont(new Font("Verdana",Font.PLAIN,20));
            jl9.setBounds(380,690,350,40); 
            jf.add(jl9); 
            
            jt3=new JTextField(20);
            jt3.setBounds(710,690,240,40); 
            jf.add(jt3);
            
            jb1=new JButton("Submit");
            jb1.setFont(new Font("Verdana",Font.PLAIN,20));
            jb1.setBackground(Color.pink);
            jb1.setBounds(620,750,160,50); 
            jf.add(jb1);
            jb1.addActionListener(this);
            
            jl10=new JLabel("places to visit");
            jl10.setFont(new Font("Verdana",Font.PLAIN,20));
            jl10.setBounds(380,810,350,40); 
            jf.add(jl10); 
            
            jt5=new JTextField(20);
            jt5.setBounds(710,810,240,40); 
            jf.add(jt5);
            
            
            
            jl11=new JLabel("Total amount:");
            jl11.setFont(new Font("Verdana",Font.PLAIN,20));
            jl11.setBounds(380,870,350,40); 
            jf.add(jl11); 
            
            jt4=new JTextField(10);
            jt4.setBounds(710,870,240,40); 
            jf.add(jt4);
            
            
            jl14=new JLabel("");
            jl14.setFont(new Font("Verdana",Font.BOLD,16));
            jl14.setForeground(Color.red);
            jl14.setBounds(380,900,800,40); 
            jf.add(jl14);
            
            jl13=new JLabel("");
            jl13.setFont(new Font("Verdana",Font.BOLD,25));
            jl13.setBounds(380,930,800,40); 
            jf.add(jl13);
            
            
            
            jf.getContentPane().setBackground(Color.YELLOW);
            jf.setLayout(null);
            jf.setVisible(true);
            jf.setSize(1800,1800);
            
            
            
    }
        //args are new actionlistener
    public void actionPerformed(ActionEvent ae)
    {
        String s1="Saturday";
        String s2="Sunday";
        String s3="Monday";
        
        if(rb1.isSelected())
        {
        jl7.setText("enter your  budget in between 1000 to 2000");
        String day= jt1.getText();
        int b=Integer.parseInt(jt2.getText());
        int p=Integer.parseInt(jt3.getText());
            
                    if (day.toLowerCase().equals(s1.toLowerCase())) 
                    {
                    if(b>=1000 && b<=2000)
                    {
                    if(jb1.isSelected())
                    {
                    }
                    jt5.setText("U can visit pakal");
                    int amount=p*b;
                    
                    jt4.setText(String.valueOf(amount));
                    
                    }
                    else{
                    try{
                        throw new no_budget();
                    }
                    catch(no_budget z)
                    {
                        z.show();
                    }
                    }
                    }
                    else if(day.toLowerCase().equals(s2.toLowerCase())) {
                    if((b>=1000) && (b<=2000))
                    { 
                    if(jb1.isSelected())
                    {
                    }
                    jt5.setText("U can visit Bhogatha Waterfalls");
                    int amount=p*b;
                    
                    jt4.setText(String.valueOf(amount));}
                
                    
                    else
                    {
                    try{
                        throw new no_budget();
                    }
                    catch(no_budget z)
                    {
                        z.show();
                    }	
                    }
                    }
                    else if(day.toLowerCase().equals(s3.toLowerCase())) 
                    {
                    if((b>=1000) && (b<=1500))
                    {
                    if(jb1.isSelected())
                    {
                    }
                    jt5.setText("U can visit Bhimneni Waterfalls");
                    int amount=p*b;
                
                    jt4.setText(String.valueOf(amount));
                    }
                    
                    else
                    {
                    try{
                        throw new no_budget();
                    }
                    catch(no_budget z)
                    {
                        z.show();
                    }
                    }
                    
                    }
                    else
                    {
                    jl14.setText("enter valid data");
                    }
                    jl13.setText("Enjoy your Trip :) Visit our Page Again");
    
    }
    else if(rb2.isSelected())
    { 
    jl7.setText("enter ur budget in between 3000 to 5000");
    
            
            String day1= jt1.getText();
            String day2= jt6.getText();
            int b2=Integer.parseInt(jt2.getText());
        
            int p2=Integer.parseInt(jt3.getText());
            
            
            
            
        
        if( ((day1.toLowerCase().equals(s1.toLowerCase())) || (day1.toLowerCase().equals(s2.toLowerCase())) ) && ( (day2.toLowerCase().equals(s2.toLowerCase())) || (day2.toLowerCase().equals(s1.toLowerCase())))) 
                    {
                    
                    if((b2>=3000) && (b2<=5000))
                    { 
                    
                    if(jb1.isSelected())
                    {
                    }
                    jt5.setText("U can visit vizag\n");
                    int amount2=p2*b2;
                    jt4.setText(String.valueOf(amount2));
                    } 
                    else
                    {
                    try{
                        throw new no_budget();
                    }
                    catch(no_budget z)
                    {
                        z.show();
                    }
                    }
                    }
                    else if( ((day1.toLowerCase().equals(s2.toLowerCase())) || (day1.toLowerCase().equals(s3.toLowerCase())) ) && ( (day2.toLowerCase().equals(s2.toLowerCase())) || (day2.toLowerCase().equals(s3.toLowerCase())))) 
                    {
                    if((b2>=3000) && (b2<=5000))
                    { 
                    if(jb1.isSelected())
                    {
                    }
                    jt5.setText("U can visit Nagarjuna Sagar\n");
                    int amount2=p2*b2;
                    jt4.setText(String.valueOf(amount2));
                    }   
                    else
                    {
                    try{
                        throw new no_budget();
                    }
                    catch(no_budget z)
                    {
                        z.show();
                    }
                    }
                    }
                    else
                    {
                    jl14.setText("Please enter the valid data\n");
                    }
                    jl13.setText("Enjoy your Trip :) Visit our Page Again");
    }
    else if(rb3.isSelected())
    {
        jl7.setText("enter ur budget in between 4k to 7k");
    
            
            String day31= jt1.getText();
            String day32= jt6.getText();
            String day33= jt7.getText();
            int b3=Integer.parseInt(jt2.getText());
        
            int p3=Integer.parseInt(jt3.getText());
        
        if( ((day31.toLowerCase().equals(s1.toLowerCase())) || (day31.toLowerCase().equals(s2.toLowerCase())) || (day31.toLowerCase().equals(s3.toLowerCase())) ) && ((day32.toLowerCase().equals(s1.toLowerCase())) || (day32.toLowerCase().equals(s2.toLowerCase())) || (day32.toLowerCase().equals(s3.toLowerCase())))&& ((day33.toLowerCase().equals(s1.toLowerCase())) || (day33.toLowerCase().equals(s2.toLowerCase()))  ||  (day33.toLowerCase().equals(s3.toLowerCase())) ) )
                    {
                    if((b3>=4000) && (b3<=7000))
                    { 
                    if(jb1.isSelected())
                    {
                    }
                jt5.setText("U can visit Ooty or Shiridi or Thirupathi\n");
                    int amount3=p3*b3;
                    jt4.setText(String.valueOf(amount3));
                    } 
                    else
                    {
                    try{
                        throw new no_budget();
                    }
                    catch(no_budget z)
                    {
                        z.show();
                    }
                    }
                    }
                    else
                    {
                    jl14.setText("Please enter the valid data\n");
                    } 
                    jl13.setText("Enjoy your Trip :) Visit our Page Again");
    }
    else if(rb4.isSelected())
    {
    jl7.setText("enter your  budget between 20k to 40k" );
            jl4.setText ("u have chances of seeing Kerala,Tamil Nadu,Varanasi,Jammu,Delhi ,enter ur choice:" ); 
            jl5.setText("choose location");
            String t= jt1.getText();
            
            
            int b4=Integer.parseInt(jt2.getText());
        
            int p4=Integer.parseInt(jt3.getText());
        
                if(t.equals("kerala"))
                {
                if(jb1.isSelected())
                    {
                    }
                jl7.setText("enter your  budget between 20k to 40k" );
                    
                if(b4>=20000 && b4<=40000) 
                {
                    
                jt5.setText("places visit:munnar,thekkadi,kovalam beach");
                int amount4=p4*b4;
                jt4.setText(String.valueOf(amount4));
                }
                else
                {
                    try{
                        throw new no_budget();
                    }
                    catch(no_budget z)
                    {
                        z.show();
                    }
                }
                    }
                else if(t.toLowerCase().equals("tamil nadu")) 
                {
                jl7.setText("enter your  budget between 20k to 30k" );
                    
                if(b4>=20000 && b4<=30000)
                {
                    if(jb1.isSelected())
                    {
                    }
                jt5.setText("places visit:trivendram,chitambaram,Phalani,Kanyakumari,Madurai,Marina beach");
                int amount4=p4*b4;
                jt4.setText(String.valueOf(amount4));
                }
                else
                {
                    try{
                        throw new no_budget();
                    }
                    catch(no_budget z)
                    {
                        z.show();
                    }
                }
                }
                
                else if(t.toLowerCase().equals("varanasi"))
                {
                jl7.setText("enter your  budget between 30k to 35k" );
                    
                if(b4>=30000 && b4<=35000)
                {
                    if(jb1.isSelected())
                    {
                    }
                jt5.setText("places visit:Gaya,Prayag,Main temple,Nehru Museum,Indira Gandhi Museum");
                int amount4=p4*b4;
                jt4.setText(String.valueOf(amount4));
                    }
                    else
                    {
                    try{
                        throw new no_budget();
                    }
                    catch(no_budget z)
                    {
                        z.show();
                    }
                    }
                }
                
                else if(t.toLowerCase().equals("jammu"))
                {
                    jl7.setText("enter your  budget between 35k to 40k" );
                    
                if(b4>=35000 && b4<=40000)
                {
                    if(jb1.isSelected())
                    {
                    }
                    jt5.setText("places visit:Shimla,Ladakh" );
                    int amount4=p4*b4;
                jt4.setText(String.valueOf(amount4));
                    }
                    else
                    {
                    try{
                        throw new no_budget();
                    }
                    catch(no_budget z)
                    {
                        z.show();
                    }
                    }
                }
                
                else if(t.toLowerCase().equals("delhi")) 
                {
                    jl7.setText("enter your  budget between 20k to 30k" );
                    
                if(b4>=20000 && b4<=30000)
                {
                    if(jb1.isSelected())
                    {
                    }
                    jt5.setText("places visit:Agra=>Taj Mahal,Akshardham,Lotus temple,Janthar Manthar,Red Fort,Gateway of India");
                    int amount4=p4*b4;
                    jt4.setText(String.valueOf(amount4));
                }
                else
                {
                    try{
                        throw new no_budget();
                    }
                    catch(no_budget z)
                    {
                        z.show();
                    }
                    }
                }
                else
                    {
                    jl14.setText("Please enter the valid data");
                    }
                jl13.setText("Enjoy your Trip :) Visit our Page Again");
    }
    }

    public static void main(String args[])
        {
            new Tourist();
        }
    }