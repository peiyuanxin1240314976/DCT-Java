package com.temple.api.web.dto;

/**
 * API DTO — fields are camelCase and match mini program types.
 */
public record TempleResponse(
	Long id,
	String name,
	String province,
	String city,
	String summary,
	String coverImageUrl
) {
}
