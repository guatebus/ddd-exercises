package ddd.ex2.model.portal;

import ddd.ex2.model.ad.AdPublisher;
import ddd.ex2.model.ad.IPublishedAd;
import ddd.ex2.model.ad.UnpublishedAd;

public class PartnerPortal implements IPortal, AdPublisher {

    @Override
    public IPublishedAd publish(UnpublishedAd unpublishedAd) {
        return null;
    }
}
