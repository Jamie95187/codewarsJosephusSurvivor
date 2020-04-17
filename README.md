# Josephus Survivor (5 KYU)

Solving [this](https://www.codewars.com/kata/555624b601231dc7a400017a/java) codewars challenge.

## Description

In this kata you have to correctly return who is the "survivor", ie: the last element of a [Josephus permutation](https://www.codewars.com/kata/josephus-permutation/).

Basically you have to assume that n people are put into a circle and that they are eliminated in steps of k elements, like this:

```
josephus_survivor(7,3) => means 7 people in a circle;
one every 3 is eliminated until one remains
[1,2,3,4,5,6,7] - initial sequence
[1,2,4,5,6,7] => 3 is counted out
[1,2,4,5,7] => 6 is counted out
[1,4,5,7] => 2 is counted out
[1,4,5] => 7 is counted out
[1,4] => 5 is counted out
[4] => 1 counted out, 4 is the last element - the survivor!
```

The above link about the "base" kata description will give you a more thorough insight about the origin of this kind of permutation, but basically that's all that there is to know to solve this kata.

**Notes and tips**: using the solution to the other kata to check your function may be helpful, but as much larger numbers will be used, using an array/list to compute the number of the survivor may be too slow; you may assume that both n and k will always be >=1.

## Tests

@Test
public void lastElementtest_twoSoldiers_return1() {
	assertEquals(2, JosephusSurvivor.lastElement(2,1));
	assertEquals(1, JosephusSurvivor.lastElement(2,2));
}

@Test
public void lastElementtest_threeSoldiers_return1() {
	assertEquals(3, JosephusSurvivor.lastElement(3,1));
	assertEquals(3, JosephusSurvivor.lastElement(3,2));

}

@Test
public void lastElementtest_fourSoldiers_return1() {
	assertEquals(1, JosephusSurvivor.lastElement(4,2));
	assertEquals(1, JosephusSurvivor.lastElement(4,3));
}

@Test
public void lastElementtest_sevenSoldiersCycleOf3_return4() {
	assertEquals(4, JosephusSurvivor.lastElement(7,3));
}
