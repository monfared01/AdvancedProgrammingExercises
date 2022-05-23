
public class Singleton {
    private static final Singleton obj = new Singleton();
     
      private Singleton() {
          
      }
          
      public static Singleton getInstance() {
        return obj;
      }
}
