import java.io.IOException;

public class grr extends aui<int[]> {
   private static final akt a = new akt("textures/colormap/foliage.png");

   protected int[] a(aud $$0, bmo $$1) {
      try {
         return gru.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, aud $$1, bmo $$2) {
      dbu.a($$0);
   }
}
