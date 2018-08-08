   import org.apache.log4j.Logger;

    public class App {
        final static Logger logger = Logger.getLogger(App.class);

        public void logMessages() {
            logger.debug("debug"); // all
            logger.info("info"); // except debug
            logger.warn("warn"); // except debug and info
            logger.error("error"); // except debug, info and warn
            logger.fatal("fatal"); // only fatal
            try {
                throw new Exception("test exception");
            } catch (Exception e) {
                logger.error("exception", e);
            }
        }
    }

