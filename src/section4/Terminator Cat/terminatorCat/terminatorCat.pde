int x = 516;

int y = 373;       

PImage catPic;

void setup() {
size(800,800);
catPic = loadImage("cat.jpg");
  catPic.resize(width,height);
 background(catPic);
}

void draw() {
 
  if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
                   }
 noStroke();
 fill(255,0,0);
 ellipse(x,y,50,50);
 ellipse(x-211,y-32,50,50);
   
   }
 void keyPressed() {
  y+=5;
  x+=5;
 if(x>800){
background(catPic);
   x=516;
 y=373;
 
 }

}