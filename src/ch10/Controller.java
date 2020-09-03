package ch10;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:baijinzhou
 * @Date:2020/9/2 09:55
 * @Description:
 */
public class Controller {
    private List<Event> eventList=new ArrayList<Event>();
    public void addEvent(Event e){
        eventList.add(e);
    }

    public void run(){
        while(eventList.size()>0){
            for(Event e :new ArrayList<Event>(eventList)){
                if(e.reday()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }

        }
    }

}
