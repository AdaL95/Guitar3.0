package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GuitarIDAO;
import model.Guitar;
import model.GuitarSpec;
import model.Inventory;
import sqliteDAO.guitarIpml;

/**
 * Servlet implementation class addGuitar
 */
@WebServlet("/addGuitar")
public class addGuitar extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public addGuitar() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String  serialNumber=request.getParameter("serialNumber");
		String  price=request.getParameter("price");
		String  builder=request.getParameter("builder");
		String  model=request.getParameter("model");
		String  type=request.getParameter("type");
		String  numStrings=request.getParameter("numStrings");
		String  topwood=request.getParameter("topwood");
		String  backwood=request.getParameter("backwood");
		//用户构想的吉他规格
		 GuitarSpec whatErinLikes = new GuitarSpec(builder, model, 
			       type, Integer.parseInt(numStrings),backwood, topwood);
		 guitarIpml GuitarIDAO=new guitarIpml();
		 Guitar guitar=new Guitar(serialNumber,Double.valueOf(price),whatErinLikes);
		    try{
		    	GuitarIDAO.addGuitar(guitar);
		    }catch(Exception e){
		    	//TODO Auto-generated catch block 
		    	e.printStackTrace();
		    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
