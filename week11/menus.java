import java.awt.*;

 class menus
 {
     menus()
     {
        Frame f=new Frame("menu example");
        MenuBar mb=new MenuBar();
        Menu m=new Menu("menu");
        Menu s=new Menu("sub menu");
        MenuItem i1=new MenuItem("COA");
        MenuItem i2=new MenuItem("DSA");
        MenuItem i3=new MenuItem("PPS");
        MenuItem i4=new MenuItem("Business");
        MenuItem i5=new MenuItem("digital");
        m.add(i1);
        m.add(i2);
        m.add(i3);
        s.add(i4);
        s.add(i5);
        m.add(s);
        mb.add(m);
        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        }
        
        public static void main(String []args)
        {
          new menus();
          }
          }
