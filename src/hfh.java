import java.io.IOException;

public class hfh extends aut<int[]> {
   private static final aku a = aku.b("textures/colormap/grass.png");

   protected int[] a(auo $$0, bor $$1) {
      try {
         return hfj.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, auo $$1, bor $$2) {
      dge.a($$0);
   }
}
