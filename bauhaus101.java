void setup() {
  size(900,900);
}

void draw() {
  background(0);
  stroke(#f1f1f1);
  strokeWeight(4);
  noFill();
  rectMode(CENTER);
  
  float wave = sin(frameCount*0.01)*450;
  ellipse(450+wave, 450, 700, 700);
  rect(450-wave, 450, 700, 700);
  
  pushMatrix();
  translate(width/2, height/2);
  
  float x1=0;
  float y1 = -350;
  
  float x2 = 350;
  float y2 = 350;
  
  float x3 = -350;
  float y3 = 350;
  
  triangle(x1, y1, x2, y2, x3, y3);
  
  popMatrix();
}