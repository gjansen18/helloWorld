public class Main {

    public static void main(String[] args) {
        for(int i=0; i<10;i++) {
            System.out.println("Hello Gavin!!!!");
            System.out.println("i is currently:"+i);
        }

        Gavin gavin=new Gavin();
        gavin.makeGavinFlip();
        gavin.makeGavinFlip();
        gavin.makeGavinFlip();
        gavin.makeGavinFlip();
        gavin.makeGavinFlip();
        gavin.makeGavinFlip();
        gavin.makeGavinFlip();
        gavin.makeGavinFlip();
        gavin.makeGavinFlip();
        gavin.makeGavinFlip();

        System.out.println("Gavin has flipped "+gavin.getFlipCount()+ " times!");
    }
}
