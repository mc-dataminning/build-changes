import java.io.IOException;

public class ghm extends asf<int[]> {
   private static final aiy a = new aiy("textures/colormap/foliage.png");

   protected int[] a(asa $$0, bil $$1) {
      try {
         return ghp.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, asa $$1, bil $$2) {
      cvh.a($$0);
   }
}
