package second;

import org.apache.log4j.Logger;

public class BlaBla {

    final static Logger logger = Logger.getLogger(BlaBla.class);
    public static void main(String[] args) {

        BlaBla obj = new BlaBla();

        try {
            obj.divide();
        }catch (ArithmeticException ex){
            logger.error("Sorry, something...",ex);
        }
        System.out.println("something next");
    }
    private  void divide(){
        int i =10/0;
    }
}
