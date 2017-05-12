package ddd.ex2.model.ad;

public class BumpedPublishedAd implements IPublishedAd {
    private final UnpublishedAd unpublishedAd;

    public BumpedPublishedAd(UnpublishedAd unpublishedAd)
    {
        this.unpublishedAd = unpublishedAd;
    }

    @Override
    public UnpublishedAd hide() {
        return null;
    }
}
