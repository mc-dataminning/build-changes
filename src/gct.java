import java.io.IOException;

public class gct extends apq<int[]> {
   private static final agm a = new agm("textures/colormap/foliage.png");

   protected int[] a(apl $$0, bfs $$1) {
      try {
         return gcw.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, apl $$1, bfs $$2) {
      crz.a($$0);
   }
}
