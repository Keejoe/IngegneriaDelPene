package model;

import java.sql.*;

import view.Terminal;

public class Model {

	private Statement sta = null;
	private Connection con = null;
	private Terminal terminal;
	
	public Model(Terminal terminal){		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.terminal = terminal;
	}
	
	private Connection connect(){
		try {
			con = DriverManager.getConnection("jdbc:postgresql://dbserver.scienze.univr.it:5432/db050", "user050", "2821");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return con;
	}
	
	private void state(){
		if(sta == null){
			if(con == null)
				connect();
			try {
				sta = connect().createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				
		}
	}
	
	private void doSomething(String str){
		state();
		String rs = "";
		ResultSet result;
		try {
			result = sta.executeQuery(str);
			while(result.next()){
				for(int a = 1; a <= result.getMetaData().getColumnCount(); a++)
					rs += String.format("%-18s", result.getString(a));
				rs += '\n';
			}
		} catch (SQLException e) {
			rs = "Errore nella query";
		}
		terminal.setTerminal(rs);
	}

	public void select(int select, String from, boolean isWhere, String where, String ... parametriSE ){
		String str = "SELECT ";
		if (select > 0){
			str += parametriSE[0];
			for (int p = 1; p < select; p++)
				str = str + ", " + parametriSE[p];
		}else
			str += "*";
		
		str = str + " FROM " + from;
		
		if (isWhere)
			str = str + " WHERE " + where;
		
		doSomething(str);
	}
	
	
	public void select( int select, String from, String ... parametriSE){
		select( select, from, false, null, parametriSE );
	}
	
	public void select( String from ){
		select( 0, from, false, null);
	}
	
}
