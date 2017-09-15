package ca.ualberta.cs.lonelytwitter;

/**
 * Created by WTH on 2017-09-15.
 */

abstract class Mood{
    public abstract void current();
    public void now(){
        System.out.println("Normal");
    }


}

class mood2 extends Mood{
    @Override
    public void current(){
        System.out.println("Happy");

    }
}

class mood3 extends Mood{
    @Override
    public void current(){
        System.out.println("Sad");

    }
}
