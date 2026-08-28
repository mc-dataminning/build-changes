import java.io.IOException;

public class hkj extends avi<int[]> {
   private static final alg a = alg.b("textures/colormap/dry_foliage.png");

   protected int[] a(avd $$0, bqq $$1) {
      try {
         return hkn.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load dry foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, avd $$1, bqq $$2) {
      dja.a($$0);
   }
}
