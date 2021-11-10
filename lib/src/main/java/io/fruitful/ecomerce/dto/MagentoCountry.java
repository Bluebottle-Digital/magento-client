package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoCountry {
	@JsonProperty("id")
	private String id;

	private String twoLetterAbbreviation;

	private String threeLetterAbbreviation;

	private String fullNameLocale;

	private String fullNameEnglish;

	@JsonGetter("twoLetterAbbreviation")
	public String getTwoLetterAbbreviation() {
		return twoLetterAbbreviation;
	}

	@JsonSetter("two_letter_abbreviation")
	public void setTwoLetterAbbreviation(String twoLetterAbbreviation) {
		this.twoLetterAbbreviation = twoLetterAbbreviation;
	}

	@JsonGetter("threeLetterAbbreviation")
	public String getThreeLetterAbbreviation() {
		return threeLetterAbbreviation;
	}

	@JsonSetter("three_letter_abbreviation")
	public void setThreeLetterAbbreviation(String threeLetterAbbreviation) {
		this.threeLetterAbbreviation = threeLetterAbbreviation;
	}

	@JsonGetter("fullNameLocale")
	public String getFullNameLocale() {
		return fullNameLocale;
	}

	@JsonSetter("full_name_locale")
	public void setFullNameLocale(String fullNameLocale) {
		this.fullNameLocale = fullNameLocale;
	}

	@JsonGetter("fullNameEnglish")
	public String getFullNameEnglish() {
		return fullNameEnglish;
	}

	@JsonSetter("full_name_english")
	public void setFullNameEnglish(String fullNameEnglish) {
		this.fullNameEnglish = fullNameEnglish;
	}
}
