package com.journal.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	//期待出现指定异常，若没有出现，则失败
	@Test(expected = Exception.class)
	public void contextLoads() {
	}

}
