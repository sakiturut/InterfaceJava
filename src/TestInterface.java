
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDatabaseCRUD databaseCRUD;
		
		databaseCRUD= new MySql();
		dbAcces(databaseCRUD);	
		
		databaseCRUD= new OracleSql();
		dbAcces(databaseCRUD);

	}
	
	static void dbAcces(IDatabaseCRUD databaseCRUD) {
		databaseCRUD.Create();
		databaseCRUD.Delete();
		databaseCRUD.Update();
	}

}
