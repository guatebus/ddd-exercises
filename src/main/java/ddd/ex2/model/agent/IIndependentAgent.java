package ddd.ex2.model.agent;

import ddd.ex2.model.ad.PublishedAd;
import ddd.ex2.model.ad.UnpublishedAd;

public interface IIndependentAgent extends Agent {
    PublishedAd publish(UnpublishedAd unpublishedAd);
    Object getEmail();
}
