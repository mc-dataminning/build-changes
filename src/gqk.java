import java.io.IOException;

public class gqk extends aub<int[]> {
   private static final akk a = new akk("textures/colormap/grass.png");

   protected int[] a(atw $$0, bmv $$1) {
      try {
         return gqm.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, atw $$1, bmv $$2) {
      dce.a($$0);
   }
}
