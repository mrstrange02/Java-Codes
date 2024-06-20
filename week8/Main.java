package mains;

import dept.*;

public class Main
{
  public static void main(String [] args)
  {
     CSE cse=new CSE();
     ECE ece=new ECE();
     ME me=new ME();
     CE ce=new CE();
     
     cse.display();
     ece.display();
     me.display();
     ce.display();
     }
}
