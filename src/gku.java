import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gku extends coy {
   @Nullable
   private ggm h;
   protected fbb a = fbb.c;
   public float b;
   public float c;
   public float d;
   public final gga e;
   public float f;
   public float g;

   public gku(gga $$0, GameProfile $$1) {
      super($$0, $$0.Z(), $$0.aa(), $$1);
      this.e = $$0;
   }

   @Override
   public boolean Z_() {
      ggm $$0 = this.a();
      return $$0 != null && $$0.e() == dgg.d;
   }

   @Override
   public boolean b() {
      ggm $$0 = this.a();
      return $$0 != null && $$0.e() == dgg.b;
   }

   @Nullable
   protected ggm a() {
      if (this.h == null) {
         this.h = flk.Q().L().a(this.cG());
      }

      return this.h;
   }

   @Override
   public void h() {
      this.f = this.g;
      this.a = this.dy();
      super.h();
   }

   public fbb I(float $$0) {
      return this.a.a(this.dy(), (double)$$0);
   }

   public hfv d() {
      ggm $$0 = this.a();
      return $$0 == null ? hfm.a(this.cG()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gj().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gj().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bwq.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fz()) {
         if (this.fB().a(cwu.pa)) {
            float $$5 = Math.min((float)this.fD() / 20.0F, 1.0F);
            $$2 *= 1.0F - ayz.l($$5) * 0.15F;
         } else if ($$0 && this.gH()) {
            return 0.1F;
         }
      }

      return ayz.h($$1, 1.0F, $$2);
   }
}
