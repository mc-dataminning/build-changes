import java.io.IOException;

public class fzg extends anr<int[]> {
   private static final aer a = new aer("textures/colormap/grass.png");

   protected int[] a(anm $$0, bdh $$1) {
      try {
         return fzi.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load grass color texture", var4);
      }
   }

   protected void a(int[] $$0, anm $$1, bdh $$2) {
      cpk.a($$0);
   }
}
