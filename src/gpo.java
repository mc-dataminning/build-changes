import java.io.IOException;

public class gpo extends auq<int[]> {
   private static final alb a = new alb("textures/colormap/grass.png");

   protected int[] a(aul $$0, bnd $$1) {
      try {
         return gpq.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, aul $$1, bnd $$2) {
      dbr.a($$0);
   }
}
