import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gjz extends cpo {
   @Nullable
   private gfr h;
   protected fbr a = fbr.c;
   public float b;
   public float c;
   public float d;
   public final gff e;
   public float f;
   public float g;

   public gjz(gff $$0, GameProfile $$1) {
      super($$0, $$0.Z(), $$0.aa(), $$1);
      this.e = $$0;
   }

   @Override
   public boolean aa_() {
      gfr $$0 = this.a();
      return $$0 != null && $$0.e() == dgw.d;
   }

   @Override
   public boolean b() {
      gfr $$0 = this.a();
      return $$0 != null && $$0.e() == dgw.b;
   }

   @Nullable
   protected gfr a() {
      if (this.h == null) {
         this.h = flz.Q().L().a(this.cG());
      }

      return this.h;
   }

   @Override
   public void h() {
      this.f = this.g;
      this.a = this.dz();
      super.h();
   }

   public fbr I(float $$0) {
      return this.a.a(this.dz(), (double)$$0);
   }

   public hch d() {
      gfr $$0 = this.a();
      return $$0 == null ? hby.a(this.cG()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gj().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gj().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bxf.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fz()) {
         if (this.fB().a(cxk.pa)) {
            float $$5 = Math.min((float)this.fD() / 20.0F, 1.0F);
            $$2 *= 1.0F - azu.l($$5) * 0.15F;
         } else if ($$0 && this.gH()) {
            return 0.1F;
         }
      }

      return azu.h($$1, 1.0F, $$2);
   }
}
