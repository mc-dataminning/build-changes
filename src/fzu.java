import java.io.IOException;

public class fzu extends anu<int[]> {
   private static final aeu a = new aeu("textures/colormap/grass.png");

   protected int[] a(anp $$0, bdk $$1) {
      try {
         return fzw.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, anp $$1, bdk $$2) {
      cpo.a($$0);
   }
}
