import java.io.IOException;

public class hfl extends auu<int[]> {
   private static final akv a = akv.b("textures/colormap/foliage.png");

   protected int[] a(aup $$0, bos $$1) {
      try {
         return hfo.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, aup $$1, bos $$2) {
      dgb.a($$0);
   }
}
