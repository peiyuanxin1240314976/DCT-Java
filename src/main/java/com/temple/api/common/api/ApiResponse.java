package com.temple.api.common.api;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Unified HTTP JSON envelope. Field names are camelCase for API consumers (mini program / App).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record ApiResponse<T>(boolean success, String code, String message, T data) {

	public static <T> ApiResponse<T> ok(T data) {
		return new ApiResponse<>(true, "OK", null, data);
	}

	public static ApiResponse<Void> ok() {
		return new ApiResponse<>(true, "OK", null, null);
	}

	public static <T> ApiResponse<T> fail(String code, String message) {
		return new ApiResponse<>(false, code, message, null);
	}
}
