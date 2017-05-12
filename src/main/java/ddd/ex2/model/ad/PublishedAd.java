package ddd.ex2.model.ad;

public class PublishedAd implements IPublishedAd {
    private final UnpublishedAd unpublishedAd;

    public PublishedAd(UnpublishedAd unpublishedAd) {
        this.unpublishedAd = unpublishedAd;
    }

    @Override
    public UnpublishedAd hide() {
        return null;
    }
}
