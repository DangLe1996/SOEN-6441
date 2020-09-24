import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;

import modernjavainaction.chap01.FilteringApples;
import org.hamcrest.beans.HasProperty;
import org.junit.Test;
import modernjavainaction.chap01.FilteringApples.*;

public class TestChapter1 {

    @Test
    public void testGetWeight() {
        Apple test = new Apple(10,"red");
        test.getWeight();
        test.setColor("blue");
        test.setWeight(10);
    }

    @Test
    public void addition() {
        assertEquals(2, 2);
        assertThat(3,equalTo(4));

        List<Apple> inventory = Arrays.asList(
        new Apple(80, "green"),
        new Apple(155, "green"),
        new Apple(120, "red")
        );



        

    }

 
}
