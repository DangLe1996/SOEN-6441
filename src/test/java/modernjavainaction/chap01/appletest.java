package modernjavainaction.chap01;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import modernjavainaction.chap01.FilteringApples.Apple;

public class appletest {

	List<Apple> inventory = Arrays.asList(
	        new Apple(80, "green"),
	        new Apple(155, "green"),
	        new Apple(120, "red"),
	        new Apple(160, "red")
	    );
	@Test
	public void filterGreenApples() {
		
		Assert.assertEquals(2, FilteringApples.filterGreenApples(inventory).size()); ;
	}
	@Test
	public void filterHeavyApples() {
		
		Assert.assertEquals(2, FilteringApples.filterHeavyApples(inventory).size()); ;
	}
	@Test
	public void appleIsHeavyTest() {
		Assert.assertTrue(FilteringApples.isHeavyApple(inventory.get(1)));
		Assert.assertFalse(FilteringApples.isHeavyApple(inventory.get(0)));
	}

	@Test
	public void appleIsGreen() {
		Assert.assertTrue(FilteringApples.isGreenApple(inventory.get(1)));
		Assert.assertFalse(FilteringApples.isGreenApple(inventory.get(2)));
	}
	@Test
	public void appleToString() {
		inventory.get(1).toString();
	}
}
