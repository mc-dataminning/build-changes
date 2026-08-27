import java.io.IOException;

public class gis extends ask<int[]> {
   private static final ajc a = new ajc("textures/colormap/foliage.png");

   protected int[] a(asf $$0, bjc $$1) {
      try {
         return giv.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, asf $$1, bjc $$2) {
      cvy.a($$0);
   }
}
