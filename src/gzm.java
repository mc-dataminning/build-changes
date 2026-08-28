import java.io.IOException;

public class gzm extends avj<int[]> {
   private static final all a = all.b("textures/colormap/foliage.png");

   protected int[] a(ave $$0, bor $$1) {
      try {
         return gzp.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, ave $$1, bor $$2) {
      dez.a($$0);
   }
}
