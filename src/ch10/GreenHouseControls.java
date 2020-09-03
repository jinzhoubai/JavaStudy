package ch10;

/**
 * @Auther:baijinzhou
 * @Date:2020/9/2 10:09
 * @Description:
 */
public class GreenHouseControls extends Controller{
    private boolean light=false;
    private boolean water=false;
    private String thermostat="Day";
    public class LightOn extends Event{
        public LightOn(long delayTime){
            super(delayTime);
        }
        @Override
        public String toString() {
            return "light on";
        }

        @Override
        public void action() {
            light=true;

        }
    }

    public class LightOff extends Event{
        public LightOff(long delayTime){
            super(delayTime);
        }

        @Override
        public String toString() {
            return "light off";
        }

        @Override
        public void action() {
            light=false;

        }
    }

    public class WaterOn extends Event{
        public WaterOn(long delayTime){
            super(delayTime);
        }

        @Override
        public String toString() {
            return "GreenHouse water is on";
        }

        @Override
        public void action() {
            water=true;

        }
    }

    public class Wateroff extends Event{
        public Wateroff(long delayTime){
            super(delayTime);
        }

        @Override
        public String toString() {
            return "GreenHouse water is off";
        }

        @Override
        public void action() {
            water=false;

        }
    }

    public class ThermostatNight extends Event{
        public ThermostatNight(long delayTime){
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Thermostat on night setting";
        }

        @Override
        public void action() {
            thermostat="night";
        }
    }

    public class ThermostatDay extends Event{
        public ThermostatDay(long delayTime){
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Thermostat on Day setting";
        }

        @Override
        public void action() {
            thermostat="night";

        }
    }

    public class Bell extends Event{
        public Bell(long delayTime){
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Bing";
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));

        }
    }

    public class Restart extends Event{
        private Event[] eventList;
        public Restart(long delayTime,Event[] eventList){
            super(delayTime);
            this.eventList=eventList;
            for(Event e:eventList){
                addEvent(e);
            }
        }

        @Override
        public String toString() {
            return "Restarting System";
        }

        @Override
        public void action() {
            for(Event e:eventList){
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);

        }
    }

    public static class Terminate extends Event{
        public Terminate(long delayTime){
            super(delayTime);
        }

        @Override
        public void action(){
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Terminate";
        }
    }

}
