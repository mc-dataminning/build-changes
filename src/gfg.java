import java.io.IOException;

public class gfg extends aqn<int[]> {
   private static final ahg a = new ahg("textures/colormap/foliage.png");

   protected int[] a(aqi $$0, bgs $$1) {
      try {
         return gfj.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, aqi $$1, bgs $$2) {
      ctj.a($$0);
   }
}
