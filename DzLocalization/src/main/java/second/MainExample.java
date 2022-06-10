package second;

import org.apache.log4j.Logger;

public class MainExample {

    final static Logger logger = Logger.getLogger(MainExample.class); //он всегда файнал статик!  создается для каждого класса свой

    public static void main(String[] args) {
        MainExample obj = new MainExample();
        obj.runMe("serg");
    }
    private void runMe(String parameter){ // это детальная настройка, она не необходима

        logger.info(parameter);

        if(logger.isDebugEnabled()){
            logger.debug("this is debug : "+parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("this is info : "+parameter);
        }

        logger.warn("this is warn : "+parameter);
        logger.error("this is error : "+parameter);
        logger.fatal("this is fatal : "+parameter);
    }
}
