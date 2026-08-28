import java.io.IOException;

public class hlu extends avk<int[]> {
   private static final ali a = ali.b("textures/colormap/foliage.png");

   protected int[] a(avf $$0, brb $$1) {
      try {
         return hlx.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, avf $$1, brb $$2) {
      djs.a($$0);
   }
}
