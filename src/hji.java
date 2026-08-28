import java.io.IOException;

public class hji extends avi<int[]> {
   private static final alg a = alg.b("textures/colormap/foliage.png");

   protected int[] a(avd $$0, bqm $$1) {
      try {
         return hjl.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, avd $$1, bqm $$2) {
      diq.a($$0);
   }
}
