package LiskovPrinciple;

public class Whatsapp extends SocialMedia{
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

    @Override
    public void groupVideoCall(Object ob) {
        super.groupVideoCall(ob);
    }
}
