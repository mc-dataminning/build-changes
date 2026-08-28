import java.io.IOException;

public class hbz extends avq<int[]> {
   private static final alp a = alp.b("textures/colormap/foliage.png");

   protected int[] a(avl $$0, bpj $$1) {
      try {
         return hcc.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, avl $$1, bpj $$2) {
      dgt.a($$0);
   }
}
