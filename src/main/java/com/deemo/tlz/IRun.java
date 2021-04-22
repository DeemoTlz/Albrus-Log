package com.deemo.tlz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @ClassName IRun
 *
 * @author Deemo(qi_jiahu)
 * @date 2021/4/22 17:56
 *
 * @version 0.1
 */
public interface IRun {
	default void run() {
		Logger logger = LoggerFactory.getLogger(this.getClass());

		logger.error("ERROR LOG");
		logger.warn("WARN LOG");
		logger.info("INFO LOG");
		logger.debug("DEBUG LOG");
		logger.trace("TRANCE LOG");
	}
}
