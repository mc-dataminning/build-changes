import java.io.IOException;

public class gxu extends auz<int[]> {
   private static final alc a = alc.b("textures/colormap/foliage.png");

   protected int[] a(aut $$0, bod $$1) {
      try {
         return gxx.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, aut $$1, bod $$2) {
      dea.a($$0);
   }
}
