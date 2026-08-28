import java.io.IOException;

public class hit extends avg<int[]> {
   private static final ale a = ale.b("textures/colormap/grass.png");

   protected int[] a(avb $$0, bqj $$1) {
      try {
         return hiv.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, avb $$1, bqj $$2) {
      din.a($$0);
   }
}
