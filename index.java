void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍

  //These lines are here so that the entire thing is not orange
  fill(255)
  stroke(0)
  ellipse(center)
  //This makes the snowman body
  ellipse(200,200,100,100)
  ellipse(200,150,75,75)
  ellipse(200,100,50,50)
  //This fill makes the carrot square
  fill(255, 171, 26)
  rect(200,105,10,10)
  //This fill makes the eyes
  fill(0)
  ellipse(190,92,10,10)
  ellipse(210,92,10,10)
  //This stroke makes the color brown for the sitck arms
  stroke(106,41,41)
  line(162,150,127,132)
  line(238,150,273,132)
  //This fill will make the blue triangle hat
  fill(0, 64, 255)
  triangle(186, 78, 200, 57, 214, 78,)
 

  
 
	

}