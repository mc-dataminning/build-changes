import java.io.IOException;

public class gfv extends aqo<int[]> {
   private static final ahh a = new ahh("textures/colormap/grass.png");

   protected int[] a(aqj $$0, bgt $$1) {
      try {
         return gfx.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, aqj $$1, bgt $$2) {
      ctv.a($$0);
   }
}
