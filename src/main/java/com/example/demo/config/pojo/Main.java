package com.example.demo.config.pojo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		var cfg = SequenceConfiguration.class;
		try (var ctx = new AnnotationConfigApplicationContext(cfg)) {
			var generator = ctx.getBean(Sequence.class);
			System.out.println(generator.nextValue());
			System.out.println(generator.nextValue());
		}
	}
	
}
