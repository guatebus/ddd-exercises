package ddd.ex2.model.agent;

import ddd.ex2.model.ad.PublishedAd;
import ddd.ex2.model.ad.UnpublishedAd;
import ddd.ex2.model.email.EmailValidator;

public class IndependentAgent implements IIndependentAgent {

    private final EmailValidator emailValidator;
    private final Object email;

    public IndependentAgent(EmailValidator emailValidator, Object email){
        this.emailValidator = emailValidator;
        this.email = email;
    }

    @Override
    public PublishedAd publish(UnpublishedAd unpublishedAd) {
        if (emailValidator.isValid(this)) {
            return unpublishedAd.publish();
        }
        throw new RuntimeException();
    }

    @Override
    public Object getEmail() {
        return email;
    }
}
