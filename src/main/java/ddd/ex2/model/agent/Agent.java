package ddd.ex2.model.agent;

import ddd.ex2.model.ad.IPublishedAd;
import ddd.ex2.model.ad.UnpublishedAd;

public interface Agent {
    IPublishedAd publish(UnpublishedAd unpublishedAd);
}
