import java.io.IOException;

public class hfn extends auu<int[]> {
   private static final akv a = akv.b("textures/colormap/grass.png");

   protected int[] a(aup $$0, bot $$1) {
      try {
         return hfp.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, aup $$1, bot $$2) {
      dgg.a($$0);
   }
}
