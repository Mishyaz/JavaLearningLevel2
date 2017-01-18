package ex9slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wombat {
    final Logger logger = LoggerFactory.getLogger(Wombat.class);
    Integer currentTemp;
    Integer oldTemp;

    public static void main(String[] args) {
        new Wombat().setTemp(60);
    }

    public void setTemp(Integer newTemp) {
        oldTemp = currentTemp;
        currentTemp = newTemp;

        // bad example (конструирование строки происходит до вызова функции! Даже при отключении лога тратятся ресурсы в боевом режиме!
//        logger.info("Old temp was " + oldTemp + ". New temp set to " + currentTemp);

        // not so bad example in log4j
//        if (logger.isDebugEnabled()) {
//            logger.debug("Old temp was " + oldTemp + ". New temp set to " + currentTemp);
//        }


        // good example
//        System.out.printf("%s adf %d sdf", "new", 23);
        logger.info("Old temp was {}. New temp set to {}", oldTemp, currentTemp);
        logger.error("test");

        if (currentTemp > 50) {
            logger.warn("too hot...");
        }
    }
}
