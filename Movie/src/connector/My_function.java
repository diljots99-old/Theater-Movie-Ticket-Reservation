package connector;

import java.sql.*;
import java.util.Date;

import db.Connectivity;



public class My_function {
	public static String empName;
	public static String panelName;
	public static boolean verifyUser(String user,String pass,String panel) {
		boolean status=false;
		Connection con=null;
		try {
			if(panel.equals("admin")) {
			con=db.Connectivity.dbConnect();
			String qry="select * from "+panel+" where User='"+user+"'  and Password='"+pass+"'";
			empName=user;
			panelName=panel;
			Statement st=con.createStatement();
			ResultSet rst=st.executeQuery(qry);
			status=rst.next();
			
			}
			else if(panel.equals("employee")) {
				con=db.Connectivity.dbConnect();
				String qry="select * from "+panel+" where Employee_name='"+user+"'  and Password='"+pass+"'";
				empName=user;
				panelName=panel;
				Statement st=con.createStatement();
				ResultSet rst=st.executeQuery(qry);
				status=rst.next();
				
				
			}
			} catch (Exception e) {
			// TODO: handle exception
		}
		return status;
	}


	public static boolean addMovie(String movie_name, String artist, String type, String movie_description) {
		// TODO Auto-generated method stub
		boolean status=false;
		try {
			Connection con=db.Connectivity.dbConnect();
			String qry="insert into addMovie values(?,?,?,?)";
			System.out.println(qry);
			PreparedStatement pst=con.prepareStatement(qry);
			pst.setString(1, movie_name);
			pst.setString(2, type);
			pst.setString(3, artist);
			pst.setString(4, movie_description);
			int i=pst.executeUpdate();
			if(i>0)
				 status=true;
			} catch (Exception e) {
			// TODO: handle exception
				System.out.println(e);
		}
		return status;
	}


	public static boolean price(String movie_Name, String movie_Type, String price_Gold, String price_Silver,
			String price_Eco) {
		boolean status=false;
		try {
			Connection con=Connectivity.dbConnect();
			String qry="insert into Price values(?,?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(qry);
			pst.setString(1, movie_Name);
			pst.setString(2, movie_Type);
			pst.setString(3, price_Gold);
			pst.setString(4, price_Silver);
			pst.setString(5, price_Eco);
			System.out.println(qry);
			int i=pst.executeUpdate();
			if(i>0)
				 status=true;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		// TODO Auto-generated method stub
		return status;
	}


	public static boolean newemp(String employee_Name, String email_Id, String mobile_No, String address,
			String position, String marital_Status, String gender, String dOB, String state, String salary,
			String aadhar_No,String password) {
		boolean	status=false;
		try {
			Connection con=Connectivity.dbConnect();
		String qry="insert into Employee values(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(qry);
			pst.setString(1, employee_Name);
			pst.setString(2, email_Id);
			pst.setString(3, mobile_No);
			pst.setString(4, address);
			pst.setString(5, position);
			pst.setString(6, marital_Status);
			pst.setString(7, gender);
			pst.setString(8, password);
			pst.setString(9, dOB);
			pst.setString(10, state);
			pst.setString(11, salary);
			pst.setString(12, aadhar_No);
			int i=pst.executeUpdate();
			if(i>0)
				 status=true;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}




}
