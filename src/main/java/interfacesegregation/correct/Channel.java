package interfacesegregation.correct;

public interface Channel {

    byte[] consume();

    void publish(byte[] messages);
}
