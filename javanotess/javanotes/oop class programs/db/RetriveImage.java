import java.sql.*;  
import java.io.*;  
public class RetriveImage {  
public static void main(String[] args) {  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/latha","root","Arjun@5808");  
      
PreparedStatement ps=con.prepareStatement("select * from img");  
ResultSet rs=ps.executeQuery();  
if(rs.next()){//now on 1st row  
              
Blob b=rs.getBlob(2);//2 means 2nd column data  
byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
              
FileOutputStream fout=new FileOutputStream("D:\\rguktlogo.jpg");
fout.write(barr);  
fout.close();  
}//end of if  
System.out.println("ok");          
con.close();  
}catch (Exception e) {e.printStackTrace();  }  
}  
}  