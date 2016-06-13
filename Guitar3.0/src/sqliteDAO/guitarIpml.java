package sqliteDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBconnection.DBconn;
import dao.GuitarIDAO;
import model.Guitar;

public class guitarIpml implements GuitarIDAO{
	
	Connection conn=null;
	Statement statement=null;
	ResultSet result=null;
	SQLException ex=null;
	List<Guitar> guitars=null;
	@Override
	public void addGuitar(Guitar guitar) {
		// TODO Auto-generated method stub
			Connection connection = DBconn.getConnection();
			PreparedStatement stmt = null;
			try {
				stmt = connection.prepareStatement("Insert Into Guitar(serialNumber,price,builder,model,type,numStrings,topwood,backwood) Values(?,?,?,?,?,?,?,?)");	
				
				stmt.setString(1, guitar.getSerialNumber());
				stmt.setDouble(2, guitar.getPrice());
				stmt.setString(3, guitar.getbuilder());
				stmt.setString(4, guitar.getmodel());
				stmt.setString(5, guitar.gettype());
				stmt.setString(6, guitar.getnumStrings());
				stmt.setString(7, guitar.gettopwood());
				stmt.setString(8, guitar.getbackwood());
				
				stmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	@Override
	public void deleteGuitar(Guitar guitar) {
		// TODO Auto-generated method stub
		Connection connection = DBconn.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement("Delete from Guitar where serialNumber=?");
			stmt.setString(1, guitar.getSerialNumber());
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public void selectGuitar() {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement statement=null;
		ResultSet result=null;
		SQLException ex=null;
		Guitar guitar=null;
		List<Guitar> guitars=null;
		
		try{
            
            conn=DBconn.open();
			statement =conn.createStatement();
			result=statement.executeQuery("SELECT * FROM Guitar");
			guitars=new ArrayList<Guitar>();
			
			while (result.next()){
				 guitar=new Guitar();
				guitar.getSpec().setType(result.getString(1));
				guitar.setPrice(result.getDouble(2));
				guitar.getSpec().setBuilder(result.getString(3));
				guitar.getSpec().setBackWood(result.getString(4));
				guitar.getSpec().setTopWood(result.getString(5));
				guitars.add(guitar);
			}
			}catch (SQLException e){
				ex=e;
			}finally{				
				if (statement!= null){
					try{
						statement.close();
					}
					catch(SQLException e){
						if(ex==null){
							ex=e;
						}
					}
					
				}
				if (conn!=null){
					try{
						conn.close();
					}
					catch(SQLException e){
						if(ex==null){
							ex=e;
						}
					}
				}
				if(ex!=null){
					throw new RuntimeException(ex);
				}
				
			}
		
	}
	
	    
}
