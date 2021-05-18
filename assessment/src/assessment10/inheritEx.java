package assessment10;

interface Player {
    public void start();
    public void pause();
    public void stop();
}

interface MusicPlayer extends Player {
    default public void next() {
        System.out.println("Next from MusicPlayer");
    }
}
public class inheritEx implements MusicPlayer {
    public void start() {
        System.out.println("start");
    }
    public void stop() {
        System.out.println("stop");
    }
    public void pause() {
        System.out.println("pause");
    }
    public static void main(String args[])
    {
    	inheritEx obj=new inheritEx();
    	obj.next();
    	obj.start();
    	obj.pause();
    	obj.stop();
    }

}
