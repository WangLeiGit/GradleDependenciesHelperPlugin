package org.ligi.gradecoba;

public class Artifact {

	private final String group;
	private final String name;
	private final String version;
	private final String repository;
	private final boolean servesAAR;
	
	public Artifact(String group,String name,String version,String repository,boolean aar) {
		this.version = version;
		this.name = name;
		this.repository = repository;
		this.group = group;
		this.servesAAR = aar;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGradleDependencyString() {
		String res=group+":"+name+":"+version;
		if (servesAAR) {
			res+="@AAR";
		}
		return res;
	}
	
	public String getRepo() {
		return repository;
	}
}
