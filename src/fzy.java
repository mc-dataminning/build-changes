import java.io.IOException;

public class fzy extends anz<int[]> {
   private static final aex a = new aex("textures/colormap/foliage.png");

   protected int[] a(anu $$0, bdp $$1) {
      try {
         return gab.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, anu $$1, bdp $$2) {
      cpp.a($$0);
   }
}
