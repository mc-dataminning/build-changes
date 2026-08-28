import java.io.IOException;

public class hca extends avq<int[]> {
   private static final alp a = alp.b("textures/colormap/grass.png");

   protected int[] a(avl $$0, bpj $$1) {
      try {
         return hcc.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, avl $$1, bpj $$2) {
      dgx.a($$0);
   }
}
