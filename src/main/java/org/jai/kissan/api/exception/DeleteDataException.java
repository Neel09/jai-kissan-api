package org.jai.kissan.api.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class DeleteDataException extends RuntimeException {

	private final String message;
}
