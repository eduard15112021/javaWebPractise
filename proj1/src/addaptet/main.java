package addaptet;

/*
адаптер питания: вилка с 3-мя ножками не может быть подключена к розетке с 2-мя выводами,
 для этого испоользуется адаптер что бы можно было это сделать
 */
public class main {
    public static void main(String[] args) {
        TV tv = new TV();
        TwoCon twoCon = new SocketTwoCon();
        ThreeCon threeConAddapter = new AddapterTreeCon(twoCon);
        tv.run(threeConAddapter);
        ThreeCon threeCon = new SocketTreeCon();
        tv.run(threeCon);
    }
}


