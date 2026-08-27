import java.io.IOException;

public class fzt extends anu<int[]> {
   private static final aeu a = new aeu("textures/colormap/foliage.png");

   protected int[] a(anp $$0, bdk $$1) {
      try {
         return fzw.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, anp $$1, bdk $$2) {
      cpk.a($$0);
   }
}
