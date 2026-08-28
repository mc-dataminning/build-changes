import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.TextureFormat;
import java.io.IOException;

public abstract class hkh extends hkb {
   private final alr c;

   public hkh(alr $$0) {
      this.c = $$0;
   }

   public alr b() {
      return this.c;
   }

   public void a(hkr $$0) {
      boolean $$1 = $$0.c();
      boolean $$2 = $$0.b();
      this.b = $$2;

      try (fkf $$3 = $$0.d()) {
         this.a($$3, $$2, $$1);
      }
   }

   private void a(fkf $$0, boolean $$1, boolean $$2) {
      GpuDevice $$3 = RenderSystem.getDevice();
      this.a = $$3.createTexture(this.c::toString, TextureFormat.RGBA8, $$0.a(), $$0.b(), 1);
      this.a($$1, false);
      this.a($$2);
      $$3.createCommandEncoder().writeToTexture(this.a, $$0);
   }

   public abstract hkr a(avo var1) throws IOException;
}
