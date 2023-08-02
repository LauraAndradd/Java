public class ci {
        
    public static String sayHello(String name) {
      
        if(length(name) != 0){
          return "Hello, " + name + "!";
        }
      else{
         return "Hello there!";
      }         
    }

    private static int length(String name) {
        return 0;
    }
}

