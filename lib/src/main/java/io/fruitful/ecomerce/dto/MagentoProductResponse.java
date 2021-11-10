package io.fruitful.ecomerce.dto;

/*
 * Created by Trong.Nguyen at 9/7/20, 2:43 PM.
 */

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class MagentoProductResponse {
	@JsonProperty("items")
	private List<MagentoProduct> items;

	private Long totalCount;
	
	public MagentoProductResponse(List<MagentoProduct> items) {
		this.items = items;
	}
	
	@JsonGetter("totalCount")
	public Long getTotalCount() {
		return totalCount;
	}

	@JsonSetter("total_count")
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
}
