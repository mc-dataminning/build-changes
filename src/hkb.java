import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import javax.annotation.Nullable;

public abstract class hkb implements AutoCloseable {
   @Nullable
   protected GpuTexture a;
   protected boolean b;

   public void a(boolean $$0) {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't change its clamp before something initializes it");
      } else {
         this.a.setAddressMode($$0 ? AddressMode.CLAMP_TO_EDGE : AddressMode.REPEAT);
      }
   }

   public void a(bbf $$0, boolean $$1) {
      this.a($$0.a(this.b), $$1);
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't get change its filter before something initializes it");
      } else {
         this.a.setTextureFilter($$0 ? FilterMode.LINEAR : FilterMode.NEAREST, $$1);
      }
   }

   @Override
   public void close() {
      if (this.a != null) {
         this.a.close();
         this.a = null;
      }
   }

   public GpuTexture a() {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't get it before something initializes it");
      } else {
         return this.a;
      }
   }
}
