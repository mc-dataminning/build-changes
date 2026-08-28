import java.io.IOException;

public class gqi extends aub<int[]> {
   private static final akk a = new akk("textures/colormap/grass.png");

   protected int[] a(atw $$0, bmu $$1) {
      try {
         return gqk.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, atw $$1, bmu $$2) {
      dcd.a($$0);
   }
}
