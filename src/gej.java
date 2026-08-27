import java.io.IOException;

public class gej extends apx<int[]> {
   private static final agt a = new agt("textures/colormap/grass.png");

   protected int[] a(aps $$0, bgc $$1) {
      try {
         return gel.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, aps $$1, bgc $$2) {
      csw.a($$0);
   }
}
