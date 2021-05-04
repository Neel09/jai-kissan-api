package org.jai.kissan.api.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UpdateDataException extends RuntimeException {

	private final String message;
}
