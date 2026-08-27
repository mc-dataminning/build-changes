import java.io.IOException;

public class gnh extends att<int[]> {
   private static final akf a = new akf("textures/colormap/foliage.png");

   protected int[] a(ato $$0, ble $$1) {
      try {
         return gnk.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, ato $$1, ble $$2) {
      czo.a($$0);
   }
}
