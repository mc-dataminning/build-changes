import java.io.IOException;

public class hfn extends auu<int[]> {
   private static final akv a = akv.b("textures/colormap/foliage.png");

   protected int[] a(aup $$0, bou $$1) {
      try {
         return hfq.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, aup $$1, bou $$2) {
      dgd.a($$0);
   }
}
