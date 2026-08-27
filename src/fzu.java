import java.io.IOException;

public class fzu extends aob<int[]> {
   private static final aez a = new aez("textures/colormap/foliage.png");

   protected int[] a(anw $$0, bdv $$1) {
      try {
         return fzx.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, anw $$1, bdv $$2) {
      cpv.a($$0);
   }
}
