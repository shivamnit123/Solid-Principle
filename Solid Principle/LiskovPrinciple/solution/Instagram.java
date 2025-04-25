package LiskovPrinciple.solution;

import LiskovPrinciple.SocialMedia;

public class Instagram extends SocialMedia implements PostMedia{
    @Override
    public void postPhoto(Object ob) {
        super.postPhoto(ob);
    }

    @Override
    public void chat(String s) {
        super.chat(s);
    }

    @Override
    public void sendPhotoVideo(Object ob) {
        super.sendPhotoVideo(ob);
    }
}
