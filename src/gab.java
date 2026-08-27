import java.io.IOException;

public class gab extends aoa<int[]> {
   private static final aey a = new aey("textures/colormap/grass.png");

   protected int[] a(anv $$0, bdr $$1) {
      try {
         return gad.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, anv $$1, bdr $$2) {
      cpv.a($$0);
   }
}
