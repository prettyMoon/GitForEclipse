package com.hongli.test.helloworld;

public class MavenConfig {

	public void getProjectName(String str) {
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append(str).append("gg!");
		System.out.println(sbuilder.toString());
	}

	public static void main(String[] args) {
		MavenConfig config = new MavenConfig();
		config.getProjectName("ZHL");
	}
}
