package dao;

public class guitarFactory {
	
	private static String daoName = "sqliteDao";

	public static GuitarIDAO createGuitarDao() {
		GuitarIDAO result = null;
		try {
			Object o = Class.forName(daoName + "." + "GuitarImpl").newInstance();
			result = (GuitarIDAO)o;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
}
