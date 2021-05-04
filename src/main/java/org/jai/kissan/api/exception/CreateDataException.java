package org.jai.kissan.api.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CreateDataException extends RuntimeException {

	private final String message;

}
