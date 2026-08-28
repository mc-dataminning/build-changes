import java.io.IOException;

public class gzn extends avj<int[]> {
   private static final all a = all.b("textures/colormap/grass.png");

   protected int[] a(ave $$0, bor $$1) {
      try {
         return gzp.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, ave $$1, bor $$2) {
      dfd.a($$0);
   }
}
