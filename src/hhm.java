import java.io.IOException;

public class hhm extends avf<int[]> {
   private static final ald a = ald.b("textures/colormap/foliage.png");

   protected int[] a(ava $$0, bqb $$1) {
      try {
         return hhp.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, ava $$1, bqb $$2) {
      dhk.a($$0);
   }
}
