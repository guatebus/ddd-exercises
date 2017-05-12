package ddd.ex2.model.agent;

import ddd.ex2.model.ad.PublishedAd;
import ddd.ex2.model.ad.UnpublishedAd;

public interface Agent {
    PublishedAd publish(UnpublishedAd unpublishedAd);
}
