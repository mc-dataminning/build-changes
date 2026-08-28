import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.TextureFormat;
import java.nio.file.Path;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fwr extends hkb implements hkc {
   private static final int c = 256;
   private final fws d;
   private final boolean e;
   private final fwr.a f;

   public fwr(Supplier<String> $$0, fws $$1, boolean $$2) {
      this.e = $$2;
      this.f = new fwr.a(0, 0, 256, 256);
      this.a = RenderSystem.getDevice().createTexture($$0, $$2 ? TextureFormat.RGBA8 : TextureFormat.RED8, 256, 256, 1);
      this.a.setTextureFilter(FilterMode.NEAREST, false);
      this.d = $$1;
   }

   @Nullable
   public fwu a(fit $$0) {
      if ($$0.c() != this.e) {
         return null;
      } else {
         fwr.a $$1 = this.f.a($$0);
         if ($$1 != null && this.a != null) {
            $$0.a($$1.a, $$1.b, this.a);
            float $$2 = 256.0F;
            float $$3 = 256.0F;
            float $$4 = 0.01F;
            return new fwu(
               this.d,
               ((float)$$1.a + 0.01F) / 256.0F,
               ((float)$$1.a - 0.01F + (float)$$0.a()) / 256.0F,
               ((float)$$1.b + 0.01F) / 256.0F,
               ((float)$$1.b - 0.01F + (float)$$0.b()) / 256.0F,
               $$0.e(),
               $$0.f(),
               $$0.g(),
               $$0.h()
            );
         } else {
            return null;
         }
      }
   }

   @Override
   public void a(alr $$0, Path $$1) {
      if (this.a != null) {
         String $$2 = $$0.c();
         TextureUtil.writeAsPNG($$1, $$2, this.a, 0, $$0x -> ($$0x & 0xFF000000) == 0 ? -16777216 : $$0x);
      }
   }

   static class a {
      final int a;
      final int b;
      private final int c;
      private final int d;
      @Nullable
      private fwr.a e;
      @Nullable
      private fwr.a f;
      private boolean g;

      a(int $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Nullable
      fwr.a a(fit $$0) {
         if (this.e != null && this.f != null) {
            fwr.a $$1 = this.e.a($$0);
            if ($$1 == null) {
               $$1 = this.f.a($$0);
            }

            return $$1;
         } else if (this.g) {
            return null;
         } else {
            int $$2 = $$0.a();
            int $$3 = $$0.b();
            if ($$2 > this.c || $$3 > this.d) {
               return null;
            } else if ($$2 == this.c && $$3 == this.d) {
               this.g = true;
               return this;
            } else {
               int $$4 = this.c - $$2;
               int $$5 = this.d - $$3;
               if ($$4 > $$5) {
                  this.e = new fwr.a(this.a, this.b, $$2, this.d);
                  this.f = new fwr.a(this.a + $$2 + 1, this.b, this.c - $$2 - 1, this.d);
               } else {
                  this.e = new fwr.a(this.a, this.b, this.c, $$3);
                  this.f = new fwr.a(this.a, this.b + $$3 + 1, this.c, this.d - $$3 - 1);
               }

               return this.e.a($$0);
            }
         }
      }
   }
}
