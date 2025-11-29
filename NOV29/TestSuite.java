package com.mphasis.NOV29;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasses;
@Suite //to perform test cases of many 
@SelectClasses({NumsUtil.class,StringUtil.class})
public class TestSuite {
	StringUtil su=new StringUtil();

}
