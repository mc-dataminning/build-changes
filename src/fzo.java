import java.io.IOException;

public class fzo extends anr<int[]> {
   private static final aer a = new aer("textures/colormap/foliage.png");

   protected int[] a(anm $$0, bdh $$1) {
      try {
         return fzr.a($$0, a);
      } catch (IOException var4) {
         throw new IllegalStateException("Failed to load foliage color texture", var4);
      }
   }

   protected void a(int[] $$0, anm $$1, bdh $$2) {
      cpf.a($$0);
   }
}
