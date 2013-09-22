package org.ligi.gradecoba;

public class AndroidArtifact extends Artifact {

	public AndroidArtifact(String artifact, String version,String repository, boolean aar) {
		super("com.android.support", artifact, version, repository, aar);
	}

}
