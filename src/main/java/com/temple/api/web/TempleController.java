package com.temple.api.web;

import com.temple.api.common.api.ApiResponse;
import com.temple.api.temple.TempleService;
import com.temple.api.web.dto.TempleListData;
import com.temple.api.web.dto.TempleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/temples")
public class TempleController {

	private final TempleService templeService;

	public TempleController(TempleService templeService) {
		this.templeService = templeService;
	}

	@GetMapping
	public ApiResponse<TempleListData> list() {
		return ApiResponse.ok(new TempleListData(templeService.listTemples()));
	}

	@GetMapping("/list")
	public ApiResponse<TempleListData> listCompat() {
		return list();
	}

	@GetMapping("/{id}")
	public ApiResponse<TempleResponse> get(@PathVariable("id") Long id) {
		return templeService.findById(id)
			.map(ApiResponse::ok)
			.orElseGet(() -> ApiResponse.fail("NOT_FOUND", "Temple not found"));
	}
}
