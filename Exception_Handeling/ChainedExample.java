package Exception_Handeling;

public class ChainedExample {
    static void LowLevel() throws Exception {
        throw new Exception("low lvl ");
    }
    
    static void highLevel() throws Exception {
        try {
            LowLevel();
        } catch (Exception e) {
            throw new Exception("Highlevel " , e);
        }
    }
    
    public static void main(String[] args) {
        try {
            highLevel();
        }catch(Exception e){
            System.out.println("casue: "+e);
            System.out.println("Casue " +e.getCause());
        }finally{
        }
    }
}
