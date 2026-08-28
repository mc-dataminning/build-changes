import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import java.util.function.Function;
import java.util.function.Supplier;

public enum fww implements fir {
   a(() -> a(5, 8, ($$0, $$1) -> -1)),
   b(() -> {
      int $$0 = 5;
      int $$1 = 8;
      return a(5, 8, ($$0x, $$1x) -> {
         boolean $$2 = $$0x == 0 || $$0x + 1 == 5 || $$1x == 0 || $$1x + 1 == 8;
         return $$2 ? -1 : 0;
      });
   });

   final fkf c;

   private static fkf a(int $$0, int $$1, fww.a $$2) {
      fkf $$3 = new fkf(fkf.a.a, $$0, $$1, false);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         for (int $$5 = 0; $$5 < $$0; $$5++) {
            $$3.b($$5, $$4, $$2.getColor($$5, $$4));
         }
      }

      $$3.g();
      return $$3;
   }

   private fww(final Supplier<fkf> $$0) {
      this.c = $$0.get();
   }

   @Override
   public float getAdvance() {
      return (float)(this.c.a() + 1);
   }

   @Override
   public fwu bake(Function<fit, fwu> $$0) {
      return $$0.apply(new fit() {
         @Override
         public int a() {
            return fww.this.c.a();
         }

         @Override
         public int b() {
            return fww.this.c.b();
         }

         @Override
         public float d() {
            return 1.0F;
         }

         @Override
         public void a(int $$0, int $$1, GpuTexture $$2) {
            RenderSystem.getDevice().createCommandEncoder().writeToTexture($$2, fww.this.c, 0, $$0, $$1, fww.this.c.a(), fww.this.c.b(), 0, 0);
         }

         @Override
         public boolean c() {
            return true;
         }
      });
   }

   @FunctionalInterface
   interface a {
      int getColor(int var1, int var2);
   }
}
