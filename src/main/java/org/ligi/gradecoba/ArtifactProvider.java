package org.ligi.gradecoba;

import java.util.ArrayList;
import java.util.List;

public class ArtifactProvider {
	private List<Artifact> artifacts;
	
	public List<Artifact> getArtifacts() {
		if (artifacts==null) {
            artifacts = new ArrayList<Artifact>();
			artifacts.add(new GoogleArtifact("play-services","3.2.25","google",false));
			artifacts.add(new AndroidArtifact("gridlayout-v7","18.0.0","android-support",false));
			artifacts.add(new AndroidArtifact("support-v13","18.0.0","android-support",false));
			artifacts.add(new AndroidArtifact("mediarouter-v7","18.0.0","android-support",false));
			artifacts.add(new AndroidArtifact("appcompat","18.0.0","android-support",false));
			artifacts.add(new AndroidArtifact("support-v4","18.0.0","android-support",false));
		}
		
		return artifacts; 
	}


    public List<Artifact> searchArtifacts(String query) {
        List<Artifact> res = new ArrayList<Artifact>();

        if (query.startsWith("gms")) {
            query="play";
        }

        for (Artifact artifact:getArtifacts()) {
            if (artifact.getName().contains(query)) {
                res.add(artifact);
            }
        }
        return res;
    }
}

