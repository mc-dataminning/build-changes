import java.io.IOException;

public class gmd extends ath<int[]> {
   private static final ajt a = new ajt("textures/colormap/grass.png");

   protected int[] a(atc $$0, bko $$1) {
      try {
         return gmf.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, atc $$1, bko $$2) {
      cyv.a($$0);
   }
}
