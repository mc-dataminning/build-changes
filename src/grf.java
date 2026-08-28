import java.io.IOException;

public class grf extends auj<int[]> {
   private static final akr a = akr.b("textures/colormap/grass.png");

   protected int[] a(aue $$0, bnf $$1) {
      try {
         return grh.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, aue $$1, bnf $$2) {
      dcu.a($$0);
   }
}
