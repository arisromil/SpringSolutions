package com.example.demo.config.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class SequenceConfiguration {
	
	@Bean
	public Sequence sequence() {
	var seqgen = new Sequence();
	seqgen.setPrefix("30");
	seqgen.setSuffix("A");
	seqgen.setInitial(100000);
	return seqgen;
	}

}
