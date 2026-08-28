import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gkd extends cpw {
   @Nullable
   private gfv h;
   protected fbx a = fbx.c;
   public float b;
   public float c;
   public float d;
   public final gfj e;
   public float f;
   public float g;

   public gkd(gfj $$0, GameProfile $$1) {
      super($$0, $$0.Y(), $$0.Z(), $$1);
      this.e = $$0;
   }

   @Override
   public boolean aa_() {
      gfv $$0 = this.a();
      return $$0 != null && $$0.e() == dhe.d;
   }

   @Override
   public boolean b() {
      gfv $$0 = this.a();
      return $$0 != null && $$0.e() == dhe.b;
   }

   @Nullable
   protected gfv a() {
      if (this.h == null) {
         this.h = fmf.Q().L().a(this.cG());
      }

      return this.h;
   }

   @Override
   public void h() {
      this.f = this.g;
      this.a = this.dz();
      super.h();
   }

   public fbx I(float $$0) {
      return this.a.a(this.dz(), (double)$$0);
   }

   public hcl d() {
      gfv $$0 = this.a();
      return $$0 == null ? hcc.a(this.cG()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gj().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gj().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bxn.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fz()) {
         if (this.fB().a(cxs.oR)) {
            float $$5 = Math.min((float)this.fD() / 20.0F, 1.0F);
            $$2 *= 1.0F - bae.l($$5) * 0.15F;
         } else if ($$0 && this.gH()) {
            return 0.1F;
         }
      }

      return bae.h($$1, 1.0F, $$2);
   }
}
