package ch10;

/**
 * @Auther:baijinzhou
 * @Date:2020/9/2 09:46
 * @Description:
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime){
        this.delayTime=delayTime;
        start();
    }

    public void start(){
        eventTime=System.nanoTime()+delayTime;
    }

    public boolean reday(){
        return System.nanoTime()>=eventTime;
    }

    public abstract void action();
}
