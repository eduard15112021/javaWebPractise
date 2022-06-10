package addaptet;

public class AddapterTreeCon implements ThreeCon {
    TwoCon socketTwoCon = new SocketTwoCon();

    public AddapterTreeCon(TwoCon socketTwoCon) {
        this.socketTwoCon = socketTwoCon;
    }

    @Override
    public void getconnect() {
        socketTwoCon.getconnect();
    }
}
