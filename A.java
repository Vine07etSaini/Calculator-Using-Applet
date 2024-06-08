import java.util.jar.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class A extends Applet  implements ActionListener

{
GridLayout f1,f2;
Panel p1,p2;
TextField t1,t2;Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
boolean flag=false,flag1=true,flag3=false,flag4=false,flag5=true; int i=0;Font f3,f4;int k=0;
String s="",m="",num1="",num2="";  StringBuffer sb = new StringBuffer(s);
String oper[]={ "","+","-","*","/"}; 
public void init()
{
p1=new Panel(){ public void paint(Graphics g)
{         super.paint(g);
     f3=new Font("Arabic",Font.BOLD,50);
     g.setFont(f3);
   //g.setColor(Color.black);
   g.drawString(s, 200,180);
    
 }};
p2=new Panel();
f4=new Font("Arabic",Font.BOLD,30);
p2.setFont(f4);
t1= new TextField();
p1.setBackground(Color.black);p1.setForeground(Color.white);
t1.setFont(f4);
f1=new GridLayout(2,1);
setLayout(f1);
p1.setLayout(null);
t1.setBounds(200,200,200,50);
f2=new GridLayout(3,3);
p2.setLayout(f2);
add(p1);
add(p2);
p1.add(t1);
b1=new Button("CLEAR");
b1.addActionListener(this);
p2.add(b1);
b2=new Button("1");
b2.addActionListener(this);
p2.add(b2);
b3=new Button("2");
b3.addActionListener(this);
p2.add(b3);
b4=new Button("3");
b4.addActionListener(this);
p2.add(b4);
b5=new Button("4");
b5.addActionListener(this);
p2.add(b5);
b6=new Button("5");
b6.addActionListener(this);
p2.add(b6);
b7=new Button("+");
b7.addActionListener(this);
p2.add(b7);
b8=new Button("6");
b8.addActionListener(this);
p2.add(b8);
b9=new Button("7");
b9.addActionListener(this);
p2.add(b9);
b10=new Button("8");
b10.addActionListener(this);
p2.add(b10);
b11=new Button("9");
b11.addActionListener(this);
p2.add(b11);
b12=new Button("0");
b12.addActionListener(this);
p2.add(b12);
b13=new Button("-");
b13.addActionListener(this);
p2.add(b13);
b14=new Button("*");
b14.addActionListener(this);
p2.add(b14);
b15=new Button("/");
b15.addActionListener(this);
p2.add(b15);
b16=new Button("pow");
b16.addActionListener(this);
p2.add(b16);
b17= new Button(".");
b17.addActionListener(this);
p2.add(b17);
b18= new Button("=");
b18.addActionListener(this);
p2.add(b18);
}
  public void actionPerformed(ActionEvent  e)
{
     if(e.getActionCommand().equals("1"))
        {     t1.setText("1");
               sb.append(t1.getText());
                 s=sb.toString();
                   flag=true;
                     
         }
   else if(e.getActionCommand().equals("2"))
          {              t1.setText("2");
                     sb.append(t1.getText());
                       s=sb.toString();
                            flag=true;   
            }   
  else if(e.getActionCommand().equals("3"))
           {t1.setText("3");  
         sb.append(t1.getText());
               s=sb.toString();   
                  flag=true;
          }
  else if(e.getActionCommand().equals("4"))
           {t1.setText("4");  sb.append(t1.getText());
               s=sb.toString();  
                       flag=true;

                 }
  else if(e.getActionCommand().equals("5"))
           {t1.setText("5"); 
           sb.append(t1.getText());
              s=sb.toString();
                   flag=true;   
                }
  else if(e.getActionCommand().equals("6"))
           {t1.setText("6");  sb.append(t1.getText());
                     s=sb.toString();
                         flag=true;  
              }
  else if(e.getActionCommand().equals("7"))
           {t1.setText("7");  sb.append(t1.getText());
        
               s=sb.toString();
                        flag=true;
  
            }
 else  if(e.getActionCommand().equals("8"))
           {t1.setText("8");  sb.append(t1.getText());
          
               s=sb.toString();
                      flag=true;
                          
            }
  else if(e.getActionCommand().equals("9"))
           {t1.setText("9");  sb.append(t1.getText());
           
               s=sb.toString();
              flag=true;
                        
            }
 else if(e.getActionCommand().equals("0"))
           {    t1.setText("0");
                sb.append(t1.getText());
                 s=sb.toString();
                    flag=true;   

           }
 else if(e.getActionCommand().equals("."))
{
                  t1.setText(".");
                  if(s.length()==0)
                  {  if(!s.contains("."))
                   { sb.append("0.");
                   s=sb.toString();
                    flag=false;     }   
               }  
              else
                { 
                   if(s.indexOf("+")==s.length()-1||s.indexOf("-")==s.length()-1||s.indexOf("/")==s.length()-1||s.indexOf("*")==s.length()-1||s.indexOf("^")==s.length()-1)
                   {
                    sb.append("0.");
                    s=sb.toString();
                    flag=false;
                      flag3=true;
                    } 
                else if(flag && (!s.contains("+")|| !s.contains("*")|| !s.contains("/")|| !s.contains("-")||!s.contains("^"))&&!flag3){  
                   
                    sb.append(".");
                    s=sb.toString();
                    flag=false;flag3=true;
                    
                    }
                else if(flag && (s.contains("+")||s.contains("*")||s.contains("/")||s.contains("-"))&&!flag4)
                 {  
                       sb.append(".");
                      s=sb.toString();
                      flag=false;flag4=true;
                    
                   }
                 }
 }
 else if(e.getActionCommand().equals("+"))
           {            t1.setText(oper[1] );  i=1;
                    if(!s.contains(oper[1])&&flag){
                        if(!s.contains("/")&&!s.contains("*") && flag){
                          sb.append(oper[1]);//to store value in string
                             s=sb.toString();
                       
                            flag=false;
                         }
                     }
            }
 else if(e.getActionCommand().equals("-"))
           {          t1.setText(oper[2] );
                       i=2;
                      if(!s.contains("+") && !s.contains("-")&&!s.contains("/")&&!s.contains("^")){
                                         
                               sb.append(oper[2]);//to store value in string
                                     s=sb.toString();
                                       if(!Character.isDigit(s.charAt(0)) && s.length()==1)
                                       { 
                                              flag1=false;    
                                      }
                                  }
                     else   if(!flag1 ){
                                           
                        if(!s.contains("+") &&!s.contains("/") &&!m.contains("-")&&!s.contains("^")&&!s.contains("*")&& flag){
                                   m=oper[2];
                               sb.append(oper[2]);//to store value in string
                               s=sb.toString();
                                flag1=true;
                            }
                   
                       else  if(!s.contains("+") &&!s.contains("/") &&!m.contains("-")&&s.contains("*")){
                                   m=oper[2];
                               sb.append(oper[2]);//to store value in string
                               s=sb.toString();
                                flag1=true; 
                            }
                         }
                       flag=false;  
            }
 else if(e.getActionCommand().equals("*"))
           {          t1.setText(oper[3]);i=3;
                    if(!s.contains(oper[3])&& flag&&!s.contains("+")&&!s.contains("/")&&s.contains("-"))
                    {          sb.append(oper[3]);//to store value in string
                             s=sb.toString();
                     }     
                   else if(!s.contains(oper[3])&& flag&&!s.contains("+")&&!s.contains("/"))
                    {    sb.append(oper[3]);//to store value in string
                        s=sb.toString();
                    }
                 flag=false;
           }
 else if(e.getActionCommand().equals("/"))
           {            t1.setText(oper[4]);i=4;
                   if(!s.contains(oper[4])&& flag)
                   {  
                          if(!s.contains("+")&&!s.contains("-")&&!s.contains("*") && flag){
                                  sb.append(oper[4]);//to store value in string
                                   s=sb.toString();
                                   flag=false;
                          }
                    }          
        } 
  else if(e.getActionCommand().equals("pow"))
{
                       t1.setText("^");
                   if(!s.contains("^")&& flag)
                   {  
                       if(!s.contains("+")&&!s.contains("-")&&!s.contains("*") && flag &&!s.contains("/")){
                          sb.append("^");//to store value in string
                        s=sb.toString();
                          flag=false;
                          }
                    }
                     
}
 else if(e.getActionCommand().equals("="))
  {        
                   if(s.contains("+"))
                {        
                          
                           num1=s.substring(0,s.indexOf("+"));
                            num2= s.substring(s.indexOf("+")+1,s.length());
                         
                        if(!num1.contains(".") &&!num2.contains("."))
                        { 
                              Integer l= Integer.parseInt(num1)+Integer.parseInt(num2);
                              s=l.toString();

                        }
                       
                       else if(num1.contains(".") || num2.contains("."))
                        { 
                              Double d= Double.parseDouble(num1)+Double.parseDouble(num2);
                              s=d.toString();

                        }
                 }
               else  if(s.contains("-") && !s.contains("*") &&!s.contains("^"))
                {        
                            num2=s.substring(s.lastIndexOf("-"),s.length());
                            num1= s.substring(0,s.lastIndexOf("-"));
                         
                        if(!num1.contains(".") && !num2.contains("."))
                        { 
                              Integer l= Integer.parseInt(num1)+Integer.parseInt(num2);
                              s=l.toString();

                        }
                       
                       else if(num1.contains(".") || num2.contains("."))
                        { 
                              Double d= Double.parseDouble(num1)+Double.parseDouble(num2);
                              s=d.toString();

                        }
                                 
                 }
                  else  if(s.contains("*"))
                {        
                          
                             num1=s.substring(0,s.indexOf("*"));
                            num2= s.substring(s.indexOf("*")+1,s.length());
                         
                        if(!num1.contains(".") && !num2.contains("."))
                        { 
                              Integer l= Integer.parseInt(num1)*Integer.parseInt(num2);
                              s=l.toString();

                        }
                       
                       else if(num1.contains(".") || num2.contains("."))
                        { 
                              Double d= Double.parseDouble(num1)*Double.parseDouble(num2);
                              s=d.toString();

                        }
                 }
                 
                  else  if(s.contains("/"))
                {        
                          
                           num1=s.substring(0,s.indexOf("/"));
                           num2= s.substring(s.indexOf("/")+1,s.length());
                        if(Double.parseDouble(num2)==0)
                       {          
                                  s="Undefined";
                             
                       }
                      else
                     {
                        if(!num1.contains(".") && !num2.contains("."))
                        { 
                            
                               Double l= Double.parseDouble(num1)/Double.parseDouble(num2);
                              s=l.toString();
                 
                        }
                        else if(num1.contains(".") ||num2.contains("."))
                       { 
                              Double d= Double.parseDouble(num1)/Double.parseDouble(num2);
                              s=d.toString();
                       }
                    
                   }
             }   
                else  if(s.contains("^"))
                {        
                           if(!s.contains("-"))
                             {num1=s.substring(0,s.indexOf("^"));
                            num2= s.substring(s.indexOf("^")+1,s.length());
                            double D=  Math.pow(Double.parseDouble(num1),Double.parseDouble(num2));
                           Double d = new Double(D);
                              s=d.toString();
                         }
                        
                       else  if(s.contains("-"))
                         {num1=s.substring(0,s.indexOf("^"));
                            num2= s.substring(s.indexOf("^")+1,s.length());
                            double D=  Math.pow(Double.parseDouble(num1),Double.parseDouble(num2));
                           Double d = new Double(D);
                              s=d.toString();
                         }
                }
                    t1.setText(" ");
    } 
 else if(e.getActionCommand().equals("CLEAR"))
           {       t1.setText("");
                 sb=new StringBuffer();
                   k=1;i=0;
                 s=sb.toString();
                m= new String();
             flag=false; flag5=true;flag1=true;
             flag3=false;flag4=false;
            }
 p1.repaint();
        
}
   }
//<applet code="A"width=800 height=800 ></applet>