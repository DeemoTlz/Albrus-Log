package com.deemo.tlz;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 * OFF、FATAL、ERROR、WARN、INFO、DEBUG、TRACE、 ALL
 */
public class App {
    public static void main(String[] args) {
        System.out.println("=====================其他库jar包 LOG4J 输出日志==========================");
        Logger logger = LogManager.getLogger(App.class);
        logger.fatal("FATAL LOG");
        logger.error("ERROR LOG");
        logger.warn("WARN LOG");
        logger.info("INFO LOG");
        logger.debug("DEBUG LOG");
        logger.trace("TRANCE LOG");

        System.out.println("=====================本地程序 SLF4J 输出日志==========================");
        org.slf4j.Logger logger2 = LoggerFactory.getLogger(App.class);
        logger2.error("ERROR LOG");
        logger2.warn("WARN LOG");
        logger2.info("INFO LOG");
        logger2.debug("DEBUG LOG");
        logger2.trace("TRANCE LOG");
    }
}
