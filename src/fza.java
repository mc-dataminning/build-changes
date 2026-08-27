import java.io.IOException;

public class fza extends anp<int[]> {
   private static final aep a = new aep("textures/colormap/foliage.png");

   protected int[] a(ank $$0, bde $$1) {
      try {
         return fzd.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, ank $$1, bde $$2) {
      cpe.a($$0);
   }
}
