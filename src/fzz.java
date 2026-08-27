import java.io.IOException;

public class fzz extends any<int[]> {
   private static final aew a = new aew("textures/colormap/grass.png");

   protected int[] a(ant $$0, bdp $$1) {
      try {
         return gab.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, ant $$1, bdp $$2) {
      cpt.a($$0);
   }
}
