package com.je.enterprise.mievento.domain.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.je.enterprise.mievento.domain.context.ContextLocale;

@Component
public class SearchKeywordsHelper implements LoadFile{

	private Properties properties;
		
	@Override
	public void load() {
		Locale locale = ContextLocale.getContextLocale().getLocale();
		PropertiesHelper helper = new PropertiesHelper("/messages/messages_"+locale.getLanguage()+".properties");
		this.properties = helper.load();
	}
	
	
	public Set<String> filtering(Set<String> searchKeywordsKey){
		
		Set<String> searckKeywordValues = Sets.newLinkedHashSet();
		
		for (String keywordKey : searchKeywordsKey) {
			searckKeywordValues.add(this.properties.getProperty(keywordKey));
		}
		return searckKeywordValues;
	}


	public List<String> filtering(ArrayList<String> searchKeywordsKey) {
		return Lists.newArrayList(this.filtering(Sets.newLinkedHashSet(searchKeywordsKey)));
	}
	
}
