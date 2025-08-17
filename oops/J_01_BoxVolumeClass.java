package oops;
//
//class box{
//	int h;
//	int w;
//	int d;
//	box(int h,int w, int d){
//		this.h=h;
//		this.w=w;
//		this.d=d;
//	}
//	
//	public int volume() {
//		return h*w*d;
//	}
//}
//
//public class J_01_BoxVolumeClass {
//public static void main(String[] args) {
//	box b = new box(2, 3, 3);
//	System.out.println(b.volume());
//;}	
//}




public class J_01_BoxVolumeClass {
    int h;
    int w;
    int d;

  
    J_01_BoxVolumeClass(int h, int w, int d) {
        this.h = h;
        this.w = w;
        this.d = d;
    }

    
    public int volume() {
        return h * w * d;
    }

    public static void main(String[] args) {
        J_01_BoxVolumeClass b = new J_01_BoxVolumeClass(2, 3, 3);
        System.out.println("Volume: " + b.volume());
    }
}
 