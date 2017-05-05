package ddd.ex1.model;

import java.util.UUID;

public class Agent {
    private UUID id;
    public Property createProperty(Object obj){
        return new Property(obj, id);
    }

    public Ad publishProperty(Property property){
        return new Ad(property, id);
    }

    public void unpublishAd(Ad ad)
    {
        ad.unpublish(id);
    }
}
