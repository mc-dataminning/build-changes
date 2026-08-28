import java.io.IOException;

public class hll extends avt<int[]> {
   private static final alr a = alr.b("textures/colormap/grass.png");

   protected int[] a(avo $$0, brm $$1) {
      try {
         return hln.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, avo $$1, brm $$2) {
      dkh.a($$0);
   }
}
