package furryjourney;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DogTest {

    static Dog dog = new Dog();
    static double MAX_FACTOR = 100.0;

    @Test
    public void newDogShouldHaveZeroHappiness (){
        assertEquals(0.0 , new Dog().getHappiness());
    }

    @Test
    public void newDogShouldHaveZeroSatiety (){
        assertEquals(0.0 , new Dog().getSatiety());
    }

    @Test
    public void newDogShouldHaveZeroCleaniness (){
        assertEquals(0.0 , new Dog().getCleaniness());
    }

    @Test
    public void dogWalkShouldIncreaseCurrentHappinessByFifteenPerHour (){
        double currentHappiness = dog.getHappiness();
        dog.walk(1);
        assertEquals(currentHappiness + 15 * 1, dog.getHappiness());
    }

    @Test
    public void dogTakeShowerShouldReachMaxCleaniness (){
        dog.takeShower();
        assertEquals(MAX_FACTOR, dog.getCleaniness());
    }

}
