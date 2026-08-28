import java.io.IOException;

public class hkl extends avi<int[]> {
   private static final alg a = alg.b("textures/colormap/grass.png");

   protected int[] a(avd $$0, bqq $$1) {
      try {
         return hkn.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, avd $$1, bqq $$2) {
      djk.a($$0);
   }
}
