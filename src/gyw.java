import java.io.IOException;

public class gyw extends avg<int[]> {
   private static final ali a = ali.b("textures/colormap/foliage.png");

   protected int[] a(avb $$0, bon $$1) {
      try {
         return gyz.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, avb $$1, bon $$2) {
      dev.a($$0);
   }
}
