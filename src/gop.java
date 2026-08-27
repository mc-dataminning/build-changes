import java.io.IOException;

public class gop extends aub<int[]> {
   private static final akm a = new akm("textures/colormap/grass.png");

   protected int[] a(atw $$0, bmi $$1) {
      try {
         return gor.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, atw $$1, bmi $$2) {
      dav.a($$0);
   }
}
