import java.io.IOException;

public class hhn extends avf<int[]> {
   private static final ald a = ald.b("textures/colormap/grass.png");

   protected int[] a(ava $$0, bqb $$1) {
      try {
         return hhp.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, ava $$1, bqb $$2) {
      dhn.a($$0);
   }
}
