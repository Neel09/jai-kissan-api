package org.jai.kissan.api.exception.handler;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class HttpErrorInfo {

	public HttpErrorInfo(HttpStatus httpStatus, String path, String message) {
		timestamp = ZonedDateTime.now();
		this.httpStatus = httpStatus;
		this.path = path;
		this.message = message;
	}

	private final ZonedDateTime timestamp;
	private final String path;
	private final HttpStatus httpStatus;
	private final String message;
}
