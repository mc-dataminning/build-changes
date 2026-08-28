import java.io.IOException;

public class hgl extends auu<int[]> {
   private static final aku a = aku.b("textures/colormap/foliage.png");

   protected int[] a(aup $$0, bpj $$1) {
      try {
         return hgo.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, aup $$1, bpj $$2) {
      dgu.a($$0);
   }
}
