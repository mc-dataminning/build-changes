import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gke extends cpx {
   @Nullable
   private gfw h;
   protected fby a = fby.c;
   public float b;
   public float c;
   public float d;
   public final gfk e;
   public float f;
   public float g;

   public gke(gfk $$0, GameProfile $$1) {
      super($$0, $$0.Y(), $$0.Z(), $$1);
      this.e = $$0;
   }

   @Override
   public boolean aa_() {
      gfw $$0 = this.a();
      return $$0 != null && $$0.e() == dhf.d;
   }

   @Override
   public boolean b() {
      gfw $$0 = this.a();
      return $$0 != null && $$0.e() == dhf.b;
   }

   @Nullable
   protected gfw a() {
      if (this.h == null) {
         this.h = fmg.Q().L().a(this.cG());
      }

      return this.h;
   }

   @Override
   public void h() {
      this.f = this.g;
      this.a = this.dz();
      super.h();
   }

   public fby I(float $$0) {
      return this.a.a(this.dz(), (double)$$0);
   }

   public hcm d() {
      gfw $$0 = this.a();
      return $$0 == null ? hcd.a(this.cG()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gj().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gj().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bxo.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fz()) {
         if (this.fB().a(cxt.oR)) {
            float $$5 = Math.min((float)this.fD() / 20.0F, 1.0F);
            $$2 *= 1.0F - bae.l($$5) * 0.15F;
         } else if ($$0 && this.gH()) {
            return 0.1F;
         }
      }

      return bae.h($$1, 1.0F, $$2);
   }
}
