import java.io.IOException;

public class hce extends awa<int[]> {
   private static final alz a = alz.b("textures/colormap/grass.png");

   protected int[] a(avv $$0, bps $$1) {
      try {
         return hcg.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, avv $$1, bps $$2) {
      dhf.a($$0);
   }
}
