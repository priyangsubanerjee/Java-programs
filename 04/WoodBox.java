
class Page {
    int length, width;

    Page(int l, int w) {
        this.length = l;
        this.width = w;
    }

    void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
    }
}

class Box extends Page{
    int height = 0;
    
    Box(int l, int w, int h) {
        super(l, w);
        this.height = h;
    }

    void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
    }
}

class WoodBox extends Box {
   int thickness = 0;

   WoodBox(int l, int w, int h, int t) {
       super(l, w, h);
       this.thickness = t;
   }

   void display() {
       System.out.println("Length: " + this.length);
       System.out.println("Width: " + this.width);
       System.out.println("Height: " + this.height);
       System.out.println("Thickness: " + this.thickness);
   }
    

   public static void main(String[] args) {
        
       Page p = new Page(10, 20);
       p.display();

       System.out.println("----\n\n");
         
       Box b = new Box(10, 20, 30);
         b.display();

       System.out.println("----\n\n");

       WoodBox wb = new WoodBox(10, 20, 30, 40);
         wb.display();
    }    
}
