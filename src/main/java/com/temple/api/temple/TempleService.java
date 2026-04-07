package com.temple.api.temple;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.temple.api.web.dto.TempleResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TempleService {

	private final TempleMapper templeMapper;

	public TempleService(TempleMapper templeMapper) {
		this.templeMapper = templeMapper;
	}

	public List<TempleResponse> listTemples() {
		return templeMapper.selectList(Wrappers.<Temple>lambdaQuery()
				.orderByAsc(Temple::getId)
				.last("LIMIT 100"))
			.stream()
			.map(this::toResponse)
			.toList();
	}

	public Optional<TempleResponse> findById(Long id) {
		Temple row = templeMapper.selectById(id);
		return row == null ? Optional.empty() : Optional.of(toResponse(row));
	}

	private TempleResponse toResponse(Temple t) {
		return new TempleResponse(
			t.getId(),
			t.getName(),
			t.getProvince(),
			t.getCity(),
			t.getSummary(),
			t.getCoverImageUrl()
		);
	}
}
