//package com.sgs.vision.api.handler;
//
//import java.util.Arrays;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//import com.sgs.vision.common.ErrorBuilder;
//import com.sgs.vision.common.constants.IssuePriorityEnum;
//import com.sgs.vision.common.constants.IssueStatusEnum;
//import com.sgs.vision.common.constants.IssueTypeEnum;
//import com.sgs.vision.common.constants.ItemStatusEnum;
//import com.sgs.vision.common.constants.ZoneTypeEnum;
//import com.sgs.vision.common.dto.ErrorsList;
//import com.sgs.vision.common.exceptions.ConstraintException;
//import com.sgs.vision.common.exceptions.DuplicateRecordException;
//import com.sgs.vision.common.exceptions.DuplicatedUserException;
//import com.sgs.vision.common.exceptions.ExpiredTokenException;
//import com.sgs.vision.common.exceptions.InvalidDataException;
//import com.sgs.vision.common.exceptions.InvalidIssuePriorityException;
//import com.sgs.vision.common.exceptions.InvalidIssueStatusException;
//import com.sgs.vision.common.exceptions.InvalidIssueTypeException;
//import com.sgs.vision.common.exceptions.InvalidItemStatusException;
//import com.sgs.vision.common.exceptions.InvalidZoneTypeException;
//import com.sgs.vision.common.exceptions.IssueNotFoundException;
//import com.sgs.vision.common.exceptions.ItemNotFoundException;
//import com.sgs.vision.common.exceptions.NotSupportedException;
//import com.sgs.vision.common.exceptions.NotValidTokenException;
//import com.sgs.vision.common.exceptions.ObjectNotFoundException;
//import com.sgs.vision.common.exceptions.SkuNotFoundException;
//import com.sgs.vision.common.exceptions.UserNotFoundException;
//import com.sgs.vision.common.exceptions.ZoneNotFoundException;
//
//@ControllerAdvice
//@RestController
//public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
// 
//	private static final Logger logger = LogManager.getLogger(GlobalExceptionHandler.class);
//	
//	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(value = Exception.class)
//    protected ErrorsList handleConflict(Exception ex, WebRequest request) {
//        String message = "Unexpected error";
//        logger.error(ex.getMessage());
//        return ErrorBuilder.buildError(ex, message, logger);
//    }
//	
//	@ResponseStatus(HttpStatus.UNAUTHORIZED)
//    @ExceptionHandler(value = NotValidTokenException.class)
//    protected ErrorsList handleConflict(NotValidTokenException ex, WebRequest request) {
//        return ErrorBuilder.buildError(ex, "Access denied", logger);
//    }
//	
//	@ResponseStatus(HttpStatus.UNAUTHORIZED)
//    @ExceptionHandler(value = ExpiredTokenException.class)
//    protected ErrorsList handleConflict(ExpiredTokenException ex, WebRequest request) {
//        return ErrorBuilder.buildError(ex, "Access denied", logger);
//    }
//	
//	@ExceptionHandler(SkuNotFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//	public ErrorsList errorResponse(SkuNotFoundException ex){
//		String message = String.format("sku %s was not found", ex.getSku());
//		return ErrorBuilder.buildError(ex, message, logger);
//	}
//	
//	@ExceptionHandler(ZoneNotFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//	public ErrorsList errorResponse(ZoneNotFoundException ex){
//		String message = String.format("zone %s was not found", ex.getZoneId());
//		return ErrorBuilder.buildError(ex, message, logger);
//	}
//	
//	@ExceptionHandler(IssueNotFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//	public ErrorsList errorResponse(IssueNotFoundException ex){
//		String message = String.format(String.format("issue with id: %d was not found", ex.getId()));
//		return ErrorBuilder.buildError(ex, message, logger);
//	}
//	
//	@ExceptionHandler(ItemNotFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//	public ErrorsList errorResponse(ItemNotFoundException ex){
//		String message = String.format(String.format("item with tag: %d was not found", ex.getId()));
//		return ErrorBuilder.buildError(ex, message, logger);
//	}
//	
//	@ExceptionHandler(InvalidIssueStatusException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//	public ErrorsList errorResponse(InvalidIssueStatusException ex){
//		String message = String.format("Provided status: %s, possible values: %s", ex.getStatus(), Arrays.asList(IssueStatusEnum.values()));
//		return ErrorBuilder.buildError(ex, message, logger);
//	}
//	
//	@ExceptionHandler(InvalidIssueTypeException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//	public ErrorsList errorResponse(InvalidIssueTypeException ex){
//		String message = String.format("Provided type: %s, possible values: %s", ex.getType(), Arrays.asList(IssueTypeEnum.values()));
//		return ErrorBuilder.buildError(ex, message, logger);
//	}
//	
//	@ExceptionHandler(InvalidIssuePriorityException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//	public ErrorsList errorResponse(InvalidIssuePriorityException ex){
//		String message = String.format("Provided priority: %s, possible values: %s", ex.getPriority(), Arrays.asList(IssuePriorityEnum.values()));
//		return ErrorBuilder.buildError(ex, message, logger);
//	}
//	
//	@ExceptionHandler(InvalidZoneTypeException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//	public ErrorsList errorResponse(InvalidZoneTypeException ex){
//		String message = String.format("Provided type: %s, possible values: %s", ex.getZoneType(), Arrays.asList(ZoneTypeEnum.values()));
//		return ErrorBuilder.buildError(ex, message, logger);
//	}
//	
//	@ExceptionHandler(InvalidItemStatusException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//	public ErrorsList errorResponse(InvalidItemStatusException ex){
//		String message = String.format("Provided status: %s, possible values: %s", ex.getStatus(), Arrays.asList(ItemStatusEnum.values()));
//		return ErrorBuilder.buildError(ex, message, logger);
//	}
//	
//	@ExceptionHandler(UserNotFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//	public ErrorsList errorResponse(UserNotFoundException ex){
//		String message = String.format("User not found");
//		return ErrorBuilder.buildError(ex, message, logger);
//	}
//	
//	@ExceptionHandler(DuplicatedUserException.class)
//    @ResponseStatus(HttpStatus.CONFLICT)
//	public ErrorsList errorResponse(DuplicatedUserException ex){
//		String message = String.format("User %s already exists", ex.getUsername());
//		return ErrorBuilder.buildError(ex, message, logger);
//	}
//	
//	@ExceptionHandler(DuplicateRecordException.class)
//    @ResponseStatus(HttpStatus.CONFLICT)
//	public ErrorsList errorResponse(DuplicateRecordException ex){
//		try{
//			String message = String.format("Record %s already exists", ex.getName());
//			return ErrorBuilder.buildError(ex, message, logger);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		return ErrorBuilder.buildError(ex, "", logger);
//	}
//	
//	@ExceptionHandler(ObjectNotFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//	public ErrorsList errorResponse(ObjectNotFoundException ex){
//		String message = String.format("%s not found", ex.getMsg());
//		return ErrorBuilder.buildError(ex, message, logger);
//	}
//	
//	@ExceptionHandler(NotSupportedException.class)
//    @ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
//	public ErrorsList errorResponse(NotSupportedException ex){
//		String message = String.format("%s", ex.getMsg());
//		return ErrorBuilder.buildError(ex, message, logger);
//	}
//	
//	@ExceptionHandler(InvalidDataException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//	public ErrorsList errorResponse(InvalidDataException ex){
//		String message = String.format("%s", ex.getMsg());
//		return ErrorBuilder.buildError(ex, message, logger);
//	}
//	
//	@ExceptionHandler(ConstraintException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//	public ErrorsList errorResponse(ConstraintException ex){
//		String message = String.format("%s", ex.getMsg());
//		return ErrorBuilder.buildError(ex, message, logger);
//	}
//	
//	@ResponseStatus(HttpStatus.CONFLICT)
//    @ExceptionHandler(value = RuntimeException.class)
//    protected ErrorsList runtimeError(RuntimeException ex, WebRequest request) {
//        String message = "Unexpected error";
//        try{
//
//        }catch(Exception e){
//        }
//        logger.error(ex.getMessage());
//        return ErrorBuilder.buildError(ex, message , logger);
//    }
//}