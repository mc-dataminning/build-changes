import java.io.IOException;

public class hlv extends avk<int[]> {
   private static final ali a = ali.b("textures/colormap/grass.png");

   protected int[] a(avf $$0, brb $$1) {
      try {
         return hlx.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, avf $$1, brb $$2) {
      djv.a($$0);
   }
}
