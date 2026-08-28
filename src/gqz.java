import java.io.IOException;

public class gqz extends aui<int[]> {
   private static final akq a = akq.b("textures/colormap/grass.png");

   protected int[] a(aud $$0, bne $$1) {
      try {
         return grb.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, aud $$1, bne $$2) {
      dcs.a($$0);
   }
}
