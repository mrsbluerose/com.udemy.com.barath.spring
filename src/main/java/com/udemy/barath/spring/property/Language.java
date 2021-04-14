package com.udemy.barath.spring.property;

import java.util.Properties;

public class Language {

	private Properties languages;

	public Properties getLanguages() {
		return languages;
	}

	public void setLanguages(Properties languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "Language [languages=" + languages + "]";
	}
	
}
