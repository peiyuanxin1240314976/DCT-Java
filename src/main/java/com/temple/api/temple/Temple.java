package com.temple.api.temple;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("temples")
public class Temple {

	@TableId(type = IdType.AUTO)
	private Long id;
	private String name;
	private String province;
	private String city;
	private String summary;
	private String coverImageUrl;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
