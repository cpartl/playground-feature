package playground.special.feature;

import playground.core.FeatureProvider;

public class MySpecialFeature {
	private String specialFeature;

	public MySpecialFeature() {
		specialFeature = FeatureProvider.getFeatureString();
	}
}
