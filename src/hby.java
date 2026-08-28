import java.io.IOException;

public class hby extends awa<int[]> {
   private static final alz a = alz.b("textures/colormap/grass.png");

   protected int[] a(avv $$0, bpo $$1) {
      try {
         return hca.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, avv $$1, bpo $$2) {
      dgy.a($$0);
   }
}
