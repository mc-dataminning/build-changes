import java.io.IOException;

public class gya extends avb<int[]> {
   private static final ale a = ale.b("textures/colormap/grass.png");

   protected int[] a(auv $$0, bog $$1) {
      try {
         return gyc.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, auv $$1, bog $$2) {
      deh.a($$0);
   }
}
