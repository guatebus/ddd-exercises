package ddd.ex2.model.agent;

import ddd.ex2.model.ad.IPublishedAd;
import ddd.ex2.model.ad.PublishedAd;
import ddd.ex2.model.ad.UnpublishedAd;
import ddd.ex2.model.email.Email;

public class IndependentAgent implements IIndependentAgent {

    private final Email email;

    public IndependentAgent(Email email){
        this.email = email;
    }

    @Override
    public IPublishedAd publish(UnpublishedAd unpublishedAd) {
        if (email.isValid) {
            return new PublishedAd(unpublishedAd);
        }
        throw new RuntimeException("Cannot publish with invalid email");
    }

    @Override
    public Object getEmail() {
        return email;
    }
}
