import java.io.IOException;

public class gfa extends aqh<int[]> {
   private static final ahd a = new ahd("textures/colormap/grass.png");

   protected int[] a(aqc $$0, bgm $$1) {
      try {
         return gfc.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, aqc $$1, bgm $$2) {
      ctg.a($$0);
   }
}
