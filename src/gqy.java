import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gqy extends crz {
   @Nullable
   private gmp h;
   protected ffs a = ffs.c;
   public float b;
   public float c;
   public float d;
   public final gmd e;
   public float f;
   public float g;

   public gqy(gmd $$0, GameProfile $$1) {
      super($$0, $$0.aa(), $$0.ab(), $$1);
      this.e = $$0;
   }

   @Override
   public boolean Z_() {
      gmp $$0 = this.a();
      return $$0 != null && $$0.e() == djw.d;
   }

   @Override
   public boolean b() {
      gmp $$0 = this.a();
      return $$0 != null && $$0.e() == djw.b;
   }

   @Nullable
   protected gmp a() {
      if (this.h == null) {
         this.h = frf.Q().L().a(this.cG());
      }

      return this.h;
   }

   @Override
   public void h() {
      this.f = this.g;
      this.a = this.dy();
      super.h();
   }

   public ffs I(float $$0) {
      return this.a.a(this.dy(), (double)$$0);
   }

   public hme c() {
      gmp $$0 = this.a();
      return $$0 == null ? hlu.a(this.cG()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gk().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gk().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bzc.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fz()) {
         if (this.fB().a(dae.pj)) {
            float $$5 = Math.min((float)this.fD() / 20.0F, 1.0F);
            $$2 *= 1.0F - azq.l($$5) * 0.15F;
         } else if ($$0 && this.gH()) {
            return 0.1F;
         }
      }

      return azq.h($$1, 1.0F, $$2);
   }
}
