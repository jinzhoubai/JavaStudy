package ch10;

/**
 * @Auther:baijinzhou
 * @Date:2020/9/2 10:50
 * @Description:
 */
public class GreenHouseController {
    public static void main(String[] args) {
        GreenHouseControls gc=new GreenHouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventsList={
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new Wateroff(800),
                gc.new ThermostatNight(1400),


        };
        gc.addEvent(gc.new Restart(2000,eventsList));

        gc.addEvent(new GreenHouseControls.Terminate(new Integer(100)));
        gc.run();
    }
}
