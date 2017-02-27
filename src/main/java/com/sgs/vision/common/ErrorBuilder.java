package com.sgs.vision.common;



import org.apache.logging.log4j.Logger;

import com.sgs.vision.common.dto.ErrorsList;



public class ErrorBuilder {

	public static ErrorsList buildError(Exception ex, String message, Logger logger){
		ErrorsList errors = new ErrorsList();
		String code = ex.getClass().getSimpleName();
		ErrorsList.Error e = new ErrorsList.Error(code, message);
		errors.getErrors().add(e);
		logger.error(e);
		return errors;
	}
	
}
