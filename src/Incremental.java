public class Incremental 
{

    private static final Incremental singleInstance = new Incremental();
	
	private Incremental()
	{}
	
	public static Incremental getInstance() {
		return singleInstance;
	}
    private static int count = 0;
    private int numero;
    
    public void IncrementalN(int n){
        for(int i = 0; i< n; i++){
        numero = ++count;
        System.out.println("Incremental " + numero);
        }
    }
}