
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Math;
public class Calculator implements ActionListener
{
    JFrame frame;
    JTextField t1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b11,add,substract,multiply,divide,root,square,ans,modulus,clear;
    double num1,num2,result;
    String s1=null;
    int l1;
    
    public Calculator()
    {
        frame = new JFrame("Calculator");
        
        JPanel p1 = new JPanel();
        
         b1 = new JButton("1");
         b2 = new JButton("2");
         b3 = new JButton("3");
         b4 = new JButton("4");
         b5 = new JButton("5");
         b6 = new JButton("6");
         b7 = new JButton("7");
         b8 = new JButton("8");
         b9 = new JButton("9");
         b0 = new JButton("0");
         b11 = new JButton(".");
         
         add = new JButton("+");
         clear = new JButton("AC");
         modulus = new JButton("%");
         root = new JButton("Sqrt");
         square = new JButton("X^2");
         substract = new JButton("-");
         multiply = new JButton("X");
         divide = new JButton("/");
         ans = new JButton("=");
         
        b1.setBackground(Color.LIGHT_GRAY);
        b2.setBackground(Color.LIGHT_GRAY);
        b3.setBackground(Color.LIGHT_GRAY);
        b4.setBackground(Color.LIGHT_GRAY);
        b5.setBackground(Color.LIGHT_GRAY);
        b6.setBackground(Color.LIGHT_GRAY);
        b7.setBackground(Color.LIGHT_GRAY);
        b8.setBackground(Color.LIGHT_GRAY);
        b9.setBackground(Color.LIGHT_GRAY);
        b0.setBackground(Color.LIGHT_GRAY);
        ans.setBackground(Color.PINK);
        
        
        t1 = new JTextField();
        t1.setEditable(false);
        Font font = new Font("Times New Roman", Font.BOLD, 20);
        t1.setFont(font);
        p1.setLayout(new GridLayout(5,4,5,5));
        
      
        p1.add(clear);p1.add(root);p1.add(square);p1.add(modulus);
        p1.add(b1);p1.add(b2);p1.add(b3);p1.add(add);
        p1.add(b4);p1.add(b5);p1.add(b6);p1.add(substract);
        p1.add(b7); p1.add(b8);p1.add(b9);p1.add(multiply);
        p1.add(b11);p1.add(b0); p1.add(ans); p1.add(divide);
        

        frame.add(t1);
        frame.add(p1);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.pack( );
        
        //1-0 buttons
        {
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(s1!=null)
                {
                s1=s1+"1";
                }
                else
                {
                    s1="1";
                }
                t1.setText(s1);
            }
        }
        );
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(s1!=null)
                {
                s1=s1+"2";
                }
                else
                {
                    s1="2";
                }
                t1.setText(s1);
            }
        }
        );
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(s1!=null)
                {
                s1=s1+"3";
                }
                else
                {
                    s1="3";
                }
                t1.setText(s1);
            }
        }
        );
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(s1!=null)
                {
                s1=s1+"4";
                }
                else
                {
                    s1="4";
                }
                t1.setText(s1);
            }
        }
        );
        b5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(s1!=null)
                {
                s1=s1+"5";
                }
                else
                {
                    s1="5";
                }
                t1.setText(s1);
            }
        }
        );
        b6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(s1!=null)
                {
                s1=s1+"6";
                }
                else
                {
                    s1="6";
                }
                t1.setText(s1);
            }
        }
        );
        b7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(s1!=null)
                {
                s1=s1+"7";
                }
                else
                {
                    s1="7";
                }
                t1.setText(s1);
            }
        }
        );
        b8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(s1!=null)
                {
                s1=s1+"8";
                }
                else
                {
                    s1="8";
                }
                t1.setText(s1);
            }
        }
        );
        b9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(s1!=null)
                {
                s1=s1+"9";
                }
                else
                {
                    s1="9";
                }
                t1.setText(s1);
            }
        }
        );
        b0.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(s1!=null)
                {
                s1=s1+"0";
                }
                else
                {
                    s1="0";
                }
                t1.setText(s1);
            }
        }
        );
        b11.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(s1!=null)
                {
                s1=s1+".";
                }
                else
                {
                    s1=".";
                }
                t1.setText(s1);
            }
        }
        );
        }
        add.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if((s1.contains("+"))||(s1.contains("-"))||(s1.contains("X"))||(s1.contains("/"))||(s1.contains("%")))
                {
                    if(s1.contains("+"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1+num2;
                        num1 = result;
                    }
                    else if(s1.contains("-"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1-num2;
                        num1 = result;
                    }
                    else if(s1.contains("X"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1*num2;
                        num1 = result;
                    }
                    else if(s1.contains("/"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1/num2;
                        num1 = result;
                    }
                    else if(s1.contains("%"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1%num2;
                        num1 = result;
                    }
                    else
                    {
                        System.out.println("Invalid");
                    }
                    s1=String.valueOf(result);
                    s1=s1+"+";
                    l1=s1.indexOf("+");
                    t1.setText(s1);
                }
                else
                {
                    s1= t1.getText(); 
                    num1 =Double.parseDouble(s1);
                    s1=s1+"+";
                    l1=s1.indexOf("+");
                    t1.setText(s1);
                } 
            }
        }
        );
        substract.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                if((s1.contains("+"))||(s1.contains("-"))||(s1.contains("X"))||(s1.contains("/"))||(s1.contains("%")))
                {
                    if(s1.contains("+"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1+num2;
                        num1 = result;
                    }
                    else if(s1.contains("-"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1-num2;
                        num1 = result;
                    }
                    else if(s1.contains("X"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1*num2;
                        num1 = result;
                    }
                    else if(s1.contains("/"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1/num2;
                        num1 = result;
                    }
                    else if((s1.contains("X^2")))
                    {
                        result = num1*num1;
                        
                    }
                    else if(s1.contains("%"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1%num2;
                        num1 = result;
                    }
                    else
                    {
                        System.out.println("Invalid");
                    }
                    s1=String.valueOf(result);
                    s1=s1+"-";
                    l1=s1.indexOf("-");
                    t1.setText(s1);
                }
                else
                {
                s1= t1.getText(); 
                num1 =Double.parseDouble(s1);
                s1=s1+"-";
                l1=s1.indexOf("-");
                t1.setText(s1);
                }
            }
        }
        );
        multiply.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                if((s1.contains("+"))||(s1.contains("-"))||(s1.contains("X"))||(s1.contains("/"))||(s1.contains("%")))
                {
                    if(s1.contains("+"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1+num2;
                        num1 = result;
                    }
                    else if(s1.contains("-"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1-num2;
                        num1 = result;
                    }
                    else if(s1.contains("X"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1*num2;
                        num1 = result;
                    }
                    else if(s1.contains("/"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1/num2;
                        num1 = result;
                    }
                    else if(s1.contains("%"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1%num2;
                        num1 = result;
                    }
                    else
                    {
                        System.out.println("Invalid");
                    }
                    s1=String.valueOf(result);
                    s1=s1+"X";
                    l1=s1.indexOf("X");
                    t1.setText(s1);
                }
                else
                {
                s1= t1.getText(); 
                num1 =Double.parseDouble(s1);
                s1=s1+"X";
                l1=s1.indexOf("X");
                t1.setText(s1);
                }
            }
        }
        );
        divide.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                if((s1.contains("+"))||(s1.contains("-"))||(s1.contains("X"))||(s1.contains("/"))||(s1.contains("%")))
                {
                    if(s1.contains("+"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1+num2;
                        num1 = result;
                    }
                    else if(s1.contains("-"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1-num2;
                        num1 = result;
                    }
                    else if(s1.contains("X"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1*num2;
                        num1 = result;
                    }
                    else if(s1.contains("/"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1/num2;
                        num1 = result;
                    }
                    else if(s1.contains("%"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1%num2;
                        num1 = result;
                    }
                    else
                    {
                        System.out.println("Invalid");
                    }
                    s1=String.valueOf(result);
                    s1=s1+"/";
                    l1=s1.indexOf("/");
                    t1.setText(s1);
                }
                else
                {
                s1= t1.getText(); 
                num1 =Double.parseDouble(s1);
                s1=s1+"/";
                l1=s1.indexOf("/");
                t1.setText(s1);
                }
                 
            }
        }
        );
        modulus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if((s1.contains("+"))||(s1.contains("-"))||(s1.contains("X"))||(s1.contains("/"))||(s1.contains("%")))  
                {
                    if(s1.contains("+"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1+num2;
                        num1 = result;
                    }
                    else if(s1.contains("-"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1-num2;
                        num1 = result;
                    }
                    else if(s1.contains("X"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1*num2;
                        num1 = result;
                    }
                    else if(s1.contains("/"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1/num2;
                        num1 = result;
                    }
                    else if(s1.contains("%"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1%num2;
                        num1 = result;
                    }
                    else
                    {
                        System.out.println("Invalid");
                    }
                    s1=String.valueOf(result);
                    s1=s1+"%";
                    l1=s1.indexOf("%");
                    t1.setText(s1);
                }
                else
                {
                    s1= t1.getText(); 
                    num1 =Double.parseDouble(s1);
                    s1=s1+"%";
                    l1=s1.indexOf("%");
                    t1.setText(s1);
                } 
            }
        }
        );
        square.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s1= t1.getText(); 
                num1 =Double.parseDouble(s1);
                result =num1*num1;
                num1=result;
                s1=String.valueOf(result);
                t1.setText(s1);
            }
        }
        );
        root.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s1= t1.getText(); 
                num1 =Double.parseDouble(s1);
                result = Math.sqrt(num1);
                num1=result;
                s1=String.valueOf(result);
                t1.setText(s1);
            }
        }
        );
        ans.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                if((s1.contains("+"))||(s1.contains("-"))||(s1.contains("X"))||(s1.contains("/"))||(s1.contains("%"))/*||(s1.contains("Sqrt"))*/)
                {
                    if(s1.contains("+"))
                    {
                    s1=s1.substring( l1+1);
                    num2= Double.parseDouble(s1);
                    result=num1+num2;
                    num1 = result;
                    s1=String.valueOf(result);
                   
                    }
                    else if(s1.contains("-"))
                    {
                        s1=s1.substring( l1+1);
                    num2= Double.parseDouble(s1);
                    result=num1-num2;
                    num1 = result;
                    s1=String.valueOf(result);
                    
                    }
                    else if(s1.contains("X"))
                    {
                        s1=s1.substring( l1+1);
                    num2= Double.parseDouble(s1);
                    result=num1*num2;
                    num1 = result;
                    s1=String.valueOf(result);
                    
                    }
                    else if(s1.contains("/"))
                    {
                        s1=s1.substring( l1+1);
                    num2= Double.parseDouble(s1);
                    result=num1/num2;
                    num1 = result;
                    s1=String.valueOf(result);
                    
                    }
                    else if(s1.contains("%"))
                    {
                        s1=s1.substring( l1+1);
                        num2= Double.parseDouble(s1);
                        result=num1%num2;
                        num1 = result;
                        s1=String.valueOf(result);
                    }
                    /*else if(s1.contains("Sqrt"))
                    {
                        s1= t1.getText(); 
                        num1 =Double.parseDouble(s1);
                        result = Math.sqrt(num1);
                        num1=result;
                        s1=String.valueOf(result);
                    }*/
                    t1.setText(s1);
                }
                
            }}
        );
        clear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s1=null;
                t1.setText(null);
            }
        }
        );
    }
 public static void main(String [] args)
 {
     new Calculator();
 }
public void actionPerformed(ActionEvent e)
{
    
}
}


//import java.util.*;
//import java.awt.*;
//import javax.swing.*;
//import java.awt.event.*;
//import java.lang.Math;
//public class Calculator implements ActionListener
//{
//    JFrame frame;
//    JTextField t1;
//    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b11,add,substract,multiply,divide,root,square,ans,modulus,clear;
//    double num1,num2,result;
//    String s1=null;
//    int l1;
//    
//    public Calculator()
//    {
//        frame = new JFrame("Calculator");
//        
//        JPanel p1 = new JPanel();
//        
//         b1 = new JButton("1");
//         b2 = new JButton("2");
//         b3 = new JButton("3");
//         b4 = new JButton("4");
//         b5 = new JButton("5");
//         b6 = new JButton("6");
//         b7 = new JButton("7");
//         b8 = new JButton("8");
//         b9 = new JButton("9");
//         b0 = new JButton("0");
//         b11 = new JButton(".");
//         
//         add = new JButton("+");
//         clear = new JButton("AC");
//         modulus = new JButton("%");
//         root = new JButton("Sqrt");
//         square = new JButton("X^2");
//         substract = new JButton("-");
//         multiply = new JButton("X");
//         divide = new JButton("/");
//         ans = new JButton("=");
//         
//        b1.setBackground(Color.LIGHT_GRAY);
//        b2.setBackground(Color.LIGHT_GRAY);
//        b3.setBackground(Color.LIGHT_GRAY);
//        b4.setBackground(Color.LIGHT_GRAY);
//        b5.setBackground(Color.LIGHT_GRAY);
//        b6.setBackground(Color.LIGHT_GRAY);
//        b7.setBackground(Color.LIGHT_GRAY);
//        b8.setBackground(Color.LIGHT_GRAY);
//        b9.setBackground(Color.LIGHT_GRAY);
//        b0.setBackground(Color.LIGHT_GRAY);
//        ans.setBackground(Color.CYAN);
//        
//        
//        t1 = new JTextField();
//        t1.setEditable(false);
//        Font font = new Font("Times New Roman", Font.BOLD, 20);
//        t1.setFont(font);
//        p1.setLayout(new GridLayout(4,3,5,5));
//        
//      
//        p1.add(clear);p1.add(root);p1.add(square);p1.add(modulus);
//        p1.add(b1);p1.add(b2);p1.add(b3);p1.add(add);
//        p1.add(b4);p1.add(b5);p1.add(b6);p1.add(substract);
//        p1.add(b7); p1.add(b8);p1.add(b9);p1.add(multiply);
//        p1.add(b11);p1.add(b0); p1.add(ans); p1.add(divide);
//        
//
//        frame.add(t1);
//        frame.add(p1);
//        frame.setVisible(true);
//        frame.setLayout(new GridLayout(2,1));
//        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
//        frame.pack( );
//        
//        //1-0 buttons
//        {
//        b1.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if(s1!=null)
//                {
//                s1=s1+"1";
//                }
//                else
//                {
//                    s1="1";
//                }
//                t1.setText(s1);
//            }
//        }
//        );
//        b2.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if(s1!=null)
//                {
//                s1=s1+"2";
//                }
//                else
//                {
//                    s1="2";
//                }
//                t1.setText(s1);
//            }
//        }
//        );
//        b3.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if(s1!=null)
//                {
//                s1=s1+"3";
//                }
//                else
//                {
//                    s1="3";
//                }
//                t1.setText(s1);
//            }
//        }
//        );
//        b4.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if(s1!=null)
//                {
//                s1=s1+"4";
//                }
//                else
//                {
//                    s1="4";
//                }
//                t1.setText(s1);
//            }
//        }
//        );
//        b5.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if(s1!=null)
//                {
//                s1=s1+"5";
//                }
//                else
//                {
//                    s1="5";
//                }
//                t1.setText(s1);
//            }
//        }
//        );
//        b6.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if(s1!=null)
//                {
//                s1=s1+"6";
//                }
//                else
//                {
//                    s1="6";
//                }
//                t1.setText(s1);
//            }
//        }
//        );
//        b7.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if(s1!=null)
//                {
//                s1=s1+"7";
//                }
//                else
//                {
//                    s1="7";
//                }
//                t1.setText(s1);
//            }
//        }
//        );
//        b8.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if(s1!=null)
//                {
//                s1=s1+"8";
//                }
//                else
//                {
//                    s1="8";
//                }
//                t1.setText(s1);
//            }
//        }
//        );
//        b9.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if(s1!=null)
//                {
//                s1=s1+"9";
//                }
//                else
//                {
//                    s1="9";
//                }
//                t1.setText(s1);
//            }
//        }
//        );
//        b0.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if(s1!=null)
//                {
//                s1=s1+"0";
//                }
//                else
//                {
//                    s1="0";
//                }
//                t1.setText(s1);
//            }
//        }
//        );
//        b11.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if(s1!=null)
//                {
//                s1=s1+".";
//                }
//                else
//                {
//                    s1=".";
//                }
//                t1.setText(s1);
//            }
//        }
//        );
//        }
//        add.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if((s1.contains("+"))||(s1.contains("-"))||(s1.contains("X"))||(s1.contains("/"))||(s1.contains("%")))
//                {
//                    if(s1.contains("+"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1+num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("-"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1-num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("X"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1*num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("/"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1/num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("%"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1%num2;
//                        num1 = result;
//                    }
//                    else
//                    {
//                        System.out.println("Invalid");
//                    }
//                    s1=String.valueOf(result);
//                    s1=s1+"+";
//                    l1=s1.indexOf("+");
//                    t1.setText(s1);
//                }
//                else
//                {
//                    s1= t1.getText(); 
//                    num1 =Double.parseDouble(s1);
//                    s1=s1+"+";
//                    l1=s1.indexOf("+");
//                    t1.setText(s1);
//                } 
//            }
//        }
//        );
//        substract.addActionListener(new ActionListener ()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if((s1.contains("+"))||(s1.contains("-"))||(s1.contains("X"))||(s1.contains("/"))||(s1.contains("%")))
//                {
//                    if(s1.contains("+"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1+num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("-"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1-num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("X"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1*num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("/"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1/num2;
//                        num1 = result;
//                    }
//                    else if((s1.contains("X^2")))
//                    {
//                        result = num1*num1;
//                        
//                    }
//                    else if(s1.contains("%"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1%num2;
//                        num1 = result;
//                    }
//                    else
//                    {
//                        System.out.println("Invalid");
//                    }
//                    s1=String.valueOf(result);
//                    s1=s1+"-";
//                    l1=s1.indexOf("-");
//                    t1.setText(s1);
//                }
//                else
//                {
//                s1= t1.getText(); 
//                num1 =Double.parseDouble(s1);
//                s1=s1+"-";
//                l1=s1.indexOf("-");
//                t1.setText(s1);
//                }
//            }
//        }
//        );
//        multiply.addActionListener(new ActionListener ()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if((s1.contains("+"))||(s1.contains("-"))||(s1.contains("X"))||(s1.contains("/"))||(s1.contains("%")))
//                {
//                    if(s1.contains("+"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1+num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("-"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1-num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("X"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1*num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("/"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1/num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("%"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1%num2;
//                        num1 = result;
//                    }
//                    else
//                    {
//                        System.out.println("Invalid");
//                    }
//                    s1=String.valueOf(result);
//                    s1=s1+"X";
//                    l1=s1.indexOf("X");
//                    t1.setText(s1);
//                }
//                else
//                {
//                s1= t1.getText(); 
//                num1 =Double.parseDouble(s1);
//                s1=s1+"X";
//                l1=s1.indexOf("X");
//                t1.setText(s1);
//                }
//            }
//        }
//        );
//        divide.addActionListener(new ActionListener ()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if((s1.contains("+"))||(s1.contains("-"))||(s1.contains("X"))||(s1.contains("/"))||(s1.contains("%")))
//                {
//                    if(s1.contains("+"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1+num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("-"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1-num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("X"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1*num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("/"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1/num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("%"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1%num2;
//                        num1 = result;
//                    }
//                    else
//                    {
//                        System.out.println("Invalid");
//                    }
//                    s1=String.valueOf(result);
//                    s1=s1+"/";
//                    l1=s1.indexOf("/");
//                    t1.setText(s1);
//                }
//                else
//                {
//                s1= t1.getText(); 
//                num1 =Double.parseDouble(s1);
//                s1=s1+"/";
//                l1=s1.indexOf("/");
//                t1.setText(s1);
//                }
//                 
//            }
//        }
//        );
//        modulus.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if((s1.contains("+"))||(s1.contains("-"))||(s1.contains("X"))||(s1.contains("/"))||(s1.contains("%")))  
//                {
//                    if(s1.contains("+"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1+num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("-"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1-num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("X"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1*num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("/"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1/num2;
//                        num1 = result;
//                    }
//                    else if(s1.contains("%"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1%num2;
//                        num1 = result;
//                    }
//                    else
//                    {
//                        System.out.println("Invalid");
//                    }
//                    s1=String.valueOf(result);
//                    s1=s1+"%";
//                    l1=s1.indexOf("%");
//                    t1.setText(s1);
//                }
//                else
//                {
//                    s1= t1.getText(); 
//                    num1 =Double.parseDouble(s1);
//                    s1=s1+"%";
//                    l1=s1.indexOf("%");
//                    t1.setText(s1);
//                } 
//            }
//        }
//        );
//        square.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                s1= t1.getText(); 
//                num1 =Double.parseDouble(s1);
//                result =num1*num1;
//                num1=result;
//                s1=String.valueOf(result);
//                t1.setText(s1);
//            }
//        }
//        );
//        root.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                s1= t1.getText(); 
//                num1 =Double.parseDouble(s1);
//                result = Math.sqrt(num1);
//                num1=result;
//                s1=String.valueOf(result);
//                t1.setText(s1);
//            }
//        }
//        );
//        ans.addActionListener(new ActionListener ()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                if((s1.contains("+"))||(s1.contains("-"))||(s1.contains("X"))||(s1.contains("/"))||(s1.contains("%"))/*||(s1.contains("Sqrt"))*/)
//                {
//                    if(s1.contains("+"))
//                    {
//                    s1=s1.substring( l1+1);
//                    num2= Double.parseDouble(s1);
//                    result=num1+num2;
//                    num1 = result;
//                    s1=String.valueOf(result);
//                   
//                    }
//                    else if(s1.contains("-"))
//                    {
//                        s1=s1.substring( l1+1);
//                    num2= Double.parseDouble(s1);
//                    result=num1-num2;
//                    num1 = result;
//                    s1=String.valueOf(result);
//                    
//                    }
//                    else if(s1.contains("X"))
//                    {
//                        s1=s1.substring( l1+1);
//                    num2= Double.parseDouble(s1);
//                    result=num1*num2;
//                    num1 = result;
//                    s1=String.valueOf(result);
//                    
//                    }
//                    else if(s1.contains("/"))
//                    {
//                        s1=s1.substring( l1+1);
//                    num2= Double.parseDouble(s1);
//                    result=num1/num2;
//                    num1 = result;
//                    s1=String.valueOf(result);
//                    
//                    }
//                    else if(s1.contains("%"))
//                    {
//                        s1=s1.substring( l1+1);
//                        num2= Double.parseDouble(s1);
//                        result=num1%num2;
//                        num1 = result;
//                        s1=String.valueOf(result);
//                    }
//                    /*else if(s1.contains("Sqrt"))
//                    {
//                        s1= t1.getText(); 
//                        num1 =Double.parseDouble(s1);
//                        result = Math.sqrt(num1);
//                        num1=result;
//                        s1=String.valueOf(result);
//                    }*/
//                    t1.setText(s1);
//                }
//                
//            }}
//        );
//        clear.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                s1=null;
//                t1.setText(null);
//            }
//        }
//        );
//    }
// public static void main(String [] args)
// {
//     new Calculator();
// }
//public void actionPerformed(ActionEvent e)
//{
//    
//}
//}
