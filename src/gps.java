import java.io.IOException;

public class gps extends auu<int[]> {
   private static final alf a = new alf("textures/colormap/foliage.png");

   protected int[] a(aup $$0, bni $$1) {
      try {
         return gpv.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, aup $$1, bni $$2) {
      dbs.a($$0);
   }
}
