package sqliteDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;



import DBconnection.DBconn;
import model.Builder;
import model.Type;
import model.Wood;
import model.Guitar;
import model.GuitarSpec;
import model.Inventory;


public class InventoryImpl implements dao.InventoryIDAO{
	/*public  List<Guitar> searchGuitar() throws Exception {
		return null;
	}*/
	/*@Override
	public List<Guitar> searchGuitar(Guitar Guitar) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override*/
	public Inventory getInventorys() throws Exception {
		// TODO Auto-generated method stub
		String sql = "select * from Guitar ";
		Connection conn=DBconn.getConnection();
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ResultSet rs = ptmt.executeQuery();
		Inventory inventory=new Inventory();
		while (rs.next()) {
			System.out.println(rs.getDouble("price"));
				inventory.addGuitar(rs.getString("serialNumber"),rs.getDouble("price"), 
					new GuitarSpec(rs.getString("builder"), rs.getString("model"), rs.getString("type"),rs.getInt("numStrings"), 
				                    rs.getString("backwood"), rs.getString("topwood"))
										);
					}if(rs !=null){
						rs.close();
					}
		ptmt.close();
		conn.close();
		return inventory;
	
	}

}
