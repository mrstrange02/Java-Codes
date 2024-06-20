import java.awt.*;  
class menu
{  
     menu(){  
         Frame f= new Frame("Menu and MenuItem Example");  
         MenuBar mb=new MenuBar();  
         Menu menu=new Menu("Menu");  
         Menu submenu=new Menu("Sub Menu");  
         MenuItem i1=new MenuItem("COA");  
         MenuItem i2=new MenuItem("DBMS");  
         MenuItem i3=new MenuItem("OOPS");  
         MenuItem i4=new MenuItem("Business");  
         MenuItem i5=new MenuItem("Digital");  
         menu.add(i1);  
         menu.add(i2);  
         menu.add(i3);  
         submenu.add(i4);  
         submenu.add(i5);  
         menu.add(submenu);  
         mb.add(menu);  
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);  
}  
public static void main(String args[])  
{  
new menu();  
}  
}  
