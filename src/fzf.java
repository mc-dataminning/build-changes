import java.io.IOException;

public class fzf extends anr<int[]> {
   private static final aer a = new aer("textures/colormap/foliage.png");

   protected int[] a(anm $$0, bdh $$1) {
      try {
         return fzi.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, anm $$1, bdh $$2) {
      cpg.a($$0);
   }
}
