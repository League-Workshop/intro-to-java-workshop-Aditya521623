PImage catPic;

void setup() {
 
  size( 600, 600);
  
  catPic = loadImage("cat.jpg");
                catPic.resize(600, 600);
background(catPic);

}

void draw() {

     if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}


   ellipse( 173, 281, 25, 25   );
  
}
