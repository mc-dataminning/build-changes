import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gjx extends cps {
   @Nullable
   private gfp h;
   protected fbs a = fbs.c;
   public float b;
   public float c;
   public float d;
   public final gfd e;
   public float f;
   public float g;

   public gjx(gfd $$0, GameProfile $$1) {
      super($$0, $$0.Y(), $$0.Z(), $$1);
      this.e = $$0;
   }

   @Override
   public boolean aa_() {
      gfp $$0 = this.a();
      return $$0 != null && $$0.e() == dgx.d;
   }

   @Override
   public boolean b() {
      gfp $$0 = this.a();
      return $$0 != null && $$0.e() == dgx.b;
   }

   @Nullable
   protected gfp a() {
      if (this.h == null) {
         this.h = flz.Q().L().a(this.cG());
      }

      return this.h;
   }

   @Override
   public void h() {
      this.f = this.g;
      this.a = this.dy();
      super.h();
   }

   public fbs I(float $$0) {
      return this.a.a(this.dy(), (double)$$0);
   }

   public hcf d() {
      gfp $$0 = this.a();
      return $$0 == null ? hbw.a(this.cG()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gh().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gh().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bxj.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fx()) {
         if (this.fz().a(cxo.oR)) {
            float $$5 = Math.min((float)this.fB() / 20.0F, 1.0F);
            $$2 *= 1.0F - bae.l($$5) * 0.15F;
         } else if ($$0 && this.gF()) {
            return 0.1F;
         }
      }

      return bae.h($$1, 1.0F, $$2);
   }
}
