import java.io.IOException;

public class gzx extends avi<int[]> {
   private static final alj a = alj.b("textures/colormap/foliage.png");

   protected int[] a(avd $$0, bou $$1) {
      try {
         return haa.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, avd $$1, bou $$2) {
      dfg.a($$0);
   }
}
