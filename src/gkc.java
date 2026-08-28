import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gkc extends cpw {
   @Nullable
   private gfu h;
   protected fbx a = fbx.c;
   public float b;
   public float c;
   public float d;
   public final gfi e;
   public float f;
   public float g;

   public gkc(gfi $$0, GameProfile $$1) {
      super($$0, $$0.Y(), $$0.Z(), $$1);
      this.e = $$0;
   }

   @Override
   public boolean aa_() {
      gfu $$0 = this.a();
      return $$0 != null && $$0.e() == dhe.d;
   }

   @Override
   public boolean b() {
      gfu $$0 = this.a();
      return $$0 != null && $$0.e() == dhe.b;
   }

   @Nullable
   protected gfu a() {
      if (this.h == null) {
         this.h = fme.Q().L().a(this.cG());
      }

      return this.h;
   }

   @Override
   public void h() {
      this.f = this.g;
      this.a = this.dy();
      super.h();
   }

   public fbx I(float $$0) {
      return this.a.a(this.dy(), (double)$$0);
   }

   public hck d() {
      gfu $$0 = this.a();
      return $$0 == null ? hcb.a(this.cG()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gh().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gh().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bxn.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fx()) {
         if (this.fz().a(cxs.oR)) {
            float $$5 = Math.min((float)this.fB() / 20.0F, 1.0F);
            $$2 *= 1.0F - bae.l($$5) * 0.15F;
         } else if ($$0 && this.gF()) {
            return 0.1F;
         }
      }

      return bae.h($$1, 1.0F, $$2);
   }
}
