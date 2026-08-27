import java.io.IOException;

public class gns extends atw<int[]> {
   private static final akh a = new akh("textures/colormap/grass.png");

   protected int[] a(atr $$0, bma $$1) {
      try {
         return gnu.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, atr $$1, bma $$2) {
      dab.a($$0);
   }
}
