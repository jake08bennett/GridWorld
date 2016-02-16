Do You Know?

1)The bug does not always move to a new location, sometimes he simply turns the way he is facing. Such as at a corner or next to a rock

2)The direction the bug moves is the first available direction forward. This can be any way depending on if there is an open grid there. 

3)If the bug does not move it just stays in the same place without any change.

4)When it moves it leaves behind a flower.

5)When the bug is at the edge of the gird it turns clockwise until it finds a direction with nothing in the grid. It then moves there.

6)If there is a rock directly in front of the bug it will turn clockwise till it finds a grid with nothing in it then move to it.

7)Flowers do not move

8)Flowers have the color of the bug that runs over it eventually it fades out after a set period.

9)A rock has no other behavior other than not letting the bug or flower use that square.

10)No only one singular actor can be in a square.

Exercises:

1) | Degrees | Compass Direction |
   |---------|-------------------|
   | 0       | North             |
   | 45      | North-East        |
   | 90      | East              |
   | 135     | South-East        |
   | 180     | South             |
   | 225     | South-West        |
   | 270     | West              |
   | 315     | North-West        |
   | 360     | North             |
   
2) Using the MoveTo method you can move the bud to anywhere in the grid. You just have to put in the coordinates. If you try to move it out the grid then you receive several errors and a pop up window.

3)To change the color of a bug, flower and rock i used the setColor method

4)When i move the rock on top of the bug and off again the bug has disappeared.

PART 2
------------------------------------------------------------------------------------------------------------
Set 2:

1) The role of the instance variable "sidelength" is to hold the number for how big the sides are for the box.

2)The role of the instance variable "steps" is to compare against "sidelength" in order to see if the bug has reached the number of steps to complete the square.

3)There is 2 steps because each turn is 45 degrees, therefore it needs 2 to turn a 90 degree angle.
 
4) Because the move function is inherited from the main class Bug.

5)No there are no methods in which you change the variable sideLength so once the bug is made the side length can't be changed

6)If something is blocking the path then it will change path.

7)Once the bug has turned twice

Exercises 2:

1)The CircleBug is really similar to the Boxbug the only main difference is it only turns once unlike the Boxbug which turns twice


Part 3
-------------------------------------------------------------------------------

1) You would access it by loc1.getRow();
2) The value is false
3) The value is (3,5)
4) The value is South east
5. You give in the direction and the starting location, the direction is changed in co ordinates after it will run & return the tile that has the transformations on the original.


1)Gets the count of objects in a grid by getting the size of the ArrayList for get occupied Location and get a count of the empty locations in a bounding grid by subtracting that number from the total number of grid spaces.
2)Use the isValid() method and add in the co-ordinates 
3)The implementations would be found in the classes that use an interface such as the ones being spoke about
4)No because ArrayLists are easier for adjusting values in an array and can have different values lengths based on the data is given to them.

1)An actor has a color a direction and a location
2)Once made an actor is facing north and is blue
3)An interface does not let you declare instance variables or implement methods and the actors need both
4)No, if the actor is already in the grid, it may not put itself in the grid again. When it runs it will give an IllegalStateException. Also if the actor has already been removed from the grid it cannot be removed a second time and will give the same issue.

5)Use the setDirection method to turn the actor






