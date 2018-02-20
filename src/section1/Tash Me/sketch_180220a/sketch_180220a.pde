PImage tash;
  PImage tort;
void setup() {
 tort = loadImage ( "tort.jpeg");
   size(800,600);
   tort.resize(width,height);

 tash=loadImage ( "tash.jpg");
}
void draw() {
background(tort);

if(mousePressed)

image(tash,mouseX, mouseY);


  
 
}