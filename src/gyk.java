import com.mojang.blaze3d.systems.RenderSystem;

public class gyk implements AutoCloseable {
   private static final int e = 16;
   public static final int a = 0;
   public static final int b = 3;
   public static final int c = 10;
   public static final int d = a(0, 10);
   private final gyg f = new gyg(16, 16, false);

   public gyk() {
      fdk $$0 = this.f.f();

      for (int $$1 = 0; $$1 < 16; $$1++) {
         for (int $$2 = 0; $$2 < 16; $$2++) {
            if ($$1 < 8) {
               $$0.a($$2, $$1, -1291911168);
            } else {
               int $$3 = (int)((1.0F - (float)$$2 / 15.0F * 0.75F) * 255.0F);
               $$0.a($$2, $$1, axy.c($$3, -1));
            }
         }
      }

      RenderSystem.activeTexture(33985);
      this.f.d();
      $$0.a(0, 0, 0, 0, 0, $$0.a(), $$0.b(), false, true, false, false);
      RenderSystem.activeTexture(33984);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a() {
      RenderSystem.setupOverlayColor(this.f.a(), 16);
   }

   public static int a(float $$0) {
      return (int)($$0 * 15.0F);
   }

   public static int a(boolean $$0) {
      return $$0 ? 3 : 10;
   }

   public static int a(int $$0, int $$1) {
      return $$0 | $$1 << 16;
   }

   public static int a(float $$0, boolean $$1) {
      return a(a($$0), a($$1));
   }

   public void b() {
      RenderSystem.teardownOverlayColor();
   }
}
