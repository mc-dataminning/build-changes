import java.io.IOException;

public class gfu extends aqo<int[]> {
   private static final ahh a = new ahh("textures/colormap/foliage.png");

   protected int[] a(aqj $$0, bgt $$1) {
      try {
         return gfx.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, aqj $$1, bgt $$2) {
      ctr.a($$0);
   }
}
