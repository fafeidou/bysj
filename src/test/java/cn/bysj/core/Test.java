package cn.bysj.core;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Value;

public class Test {

	@Value("${initpwd.initPassword }")
	private String initPassword;

	@org.junit.Test
	public void test() throws UnsupportedEncodingException {
		String value = new String("è®¡ç®æº".getBytes("ISO-8859-1"),"utf-8");
		System.out.println(value);
	}
}
