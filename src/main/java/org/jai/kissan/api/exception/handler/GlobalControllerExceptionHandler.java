package org.jai.kissan.api.exception.handler;

import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.NOT_ACCEPTABLE;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import org.jai.kissan.api.exception.CreateDataException;
import org.jai.kissan.api.exception.DeleteDataException;
import org.jai.kissan.api.exception.ReadDataException;
import org.jai.kissan.api.exception.UpdateDataException;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class GlobalControllerExceptionHandler {

	@ResponseStatus(UNPROCESSABLE_ENTITY)
	@ExceptionHandler(UpdateDataException.class)
	public HttpErrorInfo handleUpdateException(ServerHttpRequest request, Exception ex) {
		log.error("Handling update data exception...");
		return createHttpErrorInfo(UNPROCESSABLE_ENTITY, request, ex);
	}

	@ResponseStatus(NOT_FOUND)
	@ExceptionHandler(ReadDataException.class)
	public HttpErrorInfo handleReadDataException(ServerHttpRequest request, Exception ex) {
		log.error("Handling read data exception...");
		return createHttpErrorInfo(NOT_FOUND, request, ex);
	}

	@ResponseStatus(NOT_ACCEPTABLE)
	@ExceptionHandler(CreateDataException.class)
	public HttpErrorInfo handleCreateDataException(ServerHttpRequest request, Exception ex) {
		log.error("Handling create data exception...");
		return createHttpErrorInfo(NOT_ACCEPTABLE, request, ex);
	}

	@ResponseStatus(INTERNAL_SERVER_ERROR)
	@ExceptionHandler(DeleteDataException.class)
	public HttpErrorInfo handleDeleteDataException(ServerHttpRequest request, Exception ex) {
		log.error("Handling delete data exception...");
		return createHttpErrorInfo(INTERNAL_SERVER_ERROR, request, ex);
	}

	private HttpErrorInfo createHttpErrorInfo(HttpStatus httpStatus, ServerHttpRequest request, Exception ex) {
		final String path = request.getPath().pathWithinApplication().value();
		final String message = ex.getMessage();

		log.error("Returning HTTP status: {} for path: {}, message: {}", httpStatus, path, message);
		return new HttpErrorInfo(httpStatus, path, message);
	}
}
