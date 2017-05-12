package ddd.ex2.model.ad;

public class BumpedPublishedAd implements PublishedAd {
    private final PublishedAd publishedAd;

    public BumpedPublishedAd(PublishedAd publishedAd)
    {
        this.publishedAd = publishedAd;
    }

    @Override
    public UnpublishedAd hide() {
        return null;
    }
}
