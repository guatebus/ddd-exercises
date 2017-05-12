package ddd.ex2.model.agent;

import ddd.ex2.model.ad.*;

public class AgencyAgent implements IAgencyAgent, AdPublisher {
    private final boolean offer;

    public AgencyAgent(boolean offer){
        this.offer = offer;
    }

    @Override
    public IPublishedAd publish(UnpublishedAd unpublishedAd) {
        return offer ? new BumpedPublishedAd(unpublishedAd) : new PublishedAd(unpublishedAd);
    }
}
