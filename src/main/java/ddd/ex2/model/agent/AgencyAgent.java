package ddd.ex2.model.agent;

import ddd.ex2.model.ad.BumpedPublishedAd;
import ddd.ex2.model.ad.IBumpedPublishedAd;
import ddd.ex2.model.ad.PublishedAd;
import ddd.ex2.model.ad.UnpublishedAd;

public class AgencyAgent implements IAgencyAgent{
    private final boolean offer;

    public AgencyAgent(boolean offer){
        this.offer = offer;
    }

    @Override
    public PublishedAd publish(UnpublishedAd unpublishedAd) {
        PublishedAd published = unpublishedAd.publish();
        return offer ? new BumpedPublishedAd(published) : published;
    }
}
