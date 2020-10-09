
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDatabaseCRUD databaseCRUDMySql= new MySql();
		dbAcces(databaseCRUDMySql);	
		
		IDatabaseCRUD databaseCRUDOracleSql= new OracleSql();
		dbAcces(databaseCRUDOracleSql);

	}
	
	static void dbAcces(IDatabaseCRUD databaseCRUD) {
		databaseCRUD.Create();
		databaseCRUD.Delete();
		databaseCRUD.Update();
	}

}
