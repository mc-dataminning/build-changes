import java.io.IOException;

public class hfd extends auu<int[]> {
   private static final aku a = aku.b("textures/colormap/grass.png");

   protected int[] a(aup $$0, bos $$1) {
      try {
         return hff.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, aup $$1, bos $$2) {
      dgg.a($$0);
   }
}
