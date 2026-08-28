import java.io.IOException;

public class gpu extends auu<int[]> {
   private static final alf a = new alf("textures/colormap/foliage.png");

   protected int[] a(aup $$0, bnk $$1) {
      try {
         return gpx.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, aup $$1, bnk $$2) {
      dbu.a($$0);
   }
}
