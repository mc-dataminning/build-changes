import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gnx extends cqs {
   @Nullable
   private gjp h;
   protected fdw a = fdw.c;
   public float b;
   public float c;
   public float d;
   public final gjd e;
   public float f;
   public float g;

   public gnx(gjd $$0, GameProfile $$1) {
      super($$0, $$0.aa(), $$0.ab(), $$1);
      this.e = $$0;
   }

   @Override
   public boolean U_() {
      gjp $$0 = this.a();
      return $$0 != null && $$0.e() == dim.d;
   }

   @Override
   public boolean b() {
      gjp $$0 = this.a();
      return $$0 != null && $$0.e() == dim.b;
   }

   @Nullable
   protected gjp a() {
      if (this.h == null) {
         this.h = fof.Q().L().a(this.cG());
      }

      return this.h;
   }

   @Override
   public void h() {
      this.f = this.g;
      this.a = this.dy();
      super.h();
   }

   public fdw I(float $$0) {
      return this.a.a(this.dy(), (double)$$0);
   }

   public hja c() {
      gjp $$0 = this.a();
      return $$0 == null ? hir.a(this.cG()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gj().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gj().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(byf.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fy()) {
         if (this.fA().a(cyw.pe)) {
            float $$5 = Math.min((float)this.fC() / 20.0F, 1.0F);
            $$2 *= 1.0F - azk.l($$5) * 0.15F;
         } else if ($$0 && this.gG()) {
            return 0.1F;
         }
      }

      return azk.h($$1, 1.0F, $$2);
   }
}
