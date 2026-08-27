import java.io.IOException;

public class ghn extends asf<int[]> {
   private static final aiy a = new aiy("textures/colormap/grass.png");

   protected int[] a(asa $$0, bil $$1) {
      try {
         return ghp.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, asa $$1, bil $$2) {
      cvl.a($$0);
   }
}
