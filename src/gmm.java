import java.io.IOException;

public class gmm extends atj<int[]> {
   private static final ajv a = new ajv("textures/colormap/grass.png");

   protected int[] a(ate $$0, bkt $$1) {
      try {
         return gmo.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, ate $$1, bkt $$2) {
      cze.a($$0);
   }
}
