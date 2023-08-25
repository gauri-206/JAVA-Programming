import java.awt.*;
import java.awt.event.*;

class DemoCalculator
{
    public static void main(String Arg[])
    {
       MarvellousCalculator mobj = new MarvellousCalculator(400, 600,"Marvellous");
    }
}

class MarvellousCalculator extends WindowAdapter implements ActionListener
{
    public Frame fobj;
    public Button b1, b2, b3, b4, a, b, c, d, e, f, g, h, i, j,k;
    public TextField t1, t2;
    public Label lobj;
    public Integer No1, No2;

    public MarvellousCalculator(int width, int height, String title)
    {
        fobj = new Frame(title);
        fobj.setSize(width,height);
       
        
        fobj.addWindowListener(this);

        a = new Button("1");
        b = new Button("2");
        c = new Button("3");
        d = new Button("4");
        e = new Button("5");
        f = new Button("6");
        g = new Button("7");
        h = new Button("8");
        i = new Button("9");
        j = new Button("0");
        k = new Button("=");

        b1 = new Button("ADD");
        b2 = new Button("SUB");
        b3 = new Button("MULT");
        b4 = new Button("DIV");

        t1 =new TextField();
        t2 =new TextField();

        a.setBounds(10,280,80,40); 
        b.setBounds(70,280,80,40); 
        c.setBounds(140,280,80,40); 

        d.setBounds(10,320,80,40); 
        e.setBounds(70,320,80,40); 
        f.setBounds(140,320,80,40); 

        g.setBounds(10,360,80,40); 
        h.setBounds(70,360,80,40); 
        i.setBounds(140,360,80,40); 

        j.setBounds(10,400,80,40); 
        k.setBounds(70,400,120,40); 
        
        b1.setBounds(210,280,80,40);    //X, Y, W, H
        b2.setBounds(210,320,80,40);   //X, Y, W, H
        b3.setBounds(210,360,80,40);   //X, Y, W, H
        b4.setBounds(210,400,80,40);   //X, Y, W, H

        t1.setBounds(50,100,100,40);   //X, Y, W, H
        t2.setBounds(200,100,100,40);  //X, Y, W, H
        
        fobj.add(a);
        fobj.add(b);
        fobj.add(c);
        fobj.add(d);
        fobj.add(e);
        fobj.add(f);
        fobj.add(g);
        fobj.add(h);
        fobj.add(i);
        fobj.add(j);
        fobj.add(k);

        fobj.add(b1);
        fobj.add(b2);
        fobj.add(b3);
        fobj.add(b4);

        fobj.add(t1);
        fobj.add(t2);

        lobj = new Label();
        lobj.setBounds(150,25,200,100);   //X, Y, W, H
        fobj.add(lobj);       
        
        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        e.addActionListener(this);
        f.addActionListener(this);
        g.addActionListener(this);
        h.addActionListener(this);
        i.addActionListener(this);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        fobj.setLayout(null);
        fobj.setVisible(true);
    }
    public void windowClosing(WindowEvent obj)    //Event handler for frame
    {
        System.exit(0);
    }
    public void actionPerformed(ActionEvent aobj)   //Event handler for buttons
    {
        try
        {
           No1 = Integer.parseInt(t1.getText());
           No2 = Integer.parseInt(t2.getText());

           if(aobj.getSource() == b1)  //add
           {
               lobj.setText("Addition is: "+(No1+No2));
           }
           else if(aobj.getSource() == b2)  //sub
           {
               lobj.setText("Substraction is: "+(No1-No2));
           }
           else if(aobj.getSource() == b3)  //mul
           {
               lobj.setText("Multiplication is: "+(No1*No2));
           }
           else if(aobj.getSource() == b4)  //div
           {
               lobj.setText("Division is: "+(No1/No2));
           }
        }
        catch(Exception eobj)
        {}
    }
}