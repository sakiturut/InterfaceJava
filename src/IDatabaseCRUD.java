
public interface IDatabaseCRUD {
	void Create();
	
	void Delete();
	
	void Update();
	
	default void displayMsg() {
		System.out.println("Java 8 den sonra default metod kullanilabilir.");
	}
	
	static void info(){
		System.out.println("Java 8 den sonra static metod kullanilabilir.");
	}

}
