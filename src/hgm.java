import java.io.IOException;

public class hgm extends auu<int[]> {
   private static final aku a = aku.b("textures/colormap/grass.png");

   protected int[] a(aup $$0, bpj $$1) {
      try {
         return hgo.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, aup $$1, bpj $$2) {
      dgx.a($$0);
   }
}
