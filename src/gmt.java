import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gmt extends cqi {
   @Nullable
   private gil h;
   protected fcu a = fcu.c;
   public float b;
   public float c;
   public float d;
   public final ghz e;
   public float f;
   public float g;

   public gmt(ghz $$0, GameProfile $$1) {
      super($$0, $$0.aa(), $$0.ab(), $$1);
      this.e = $$0;
   }

   @Override
   public boolean U_() {
      gil $$0 = this.a();
      return $$0 != null && $$0.e() == dhm.d;
   }

   @Override
   public boolean b() {
      gil $$0 = this.a();
      return $$0 != null && $$0.e() == dhm.b;
   }

   @Nullable
   protected gil a() {
      if (this.h == null) {
         this.h = fnd.Q().L().a(this.cG());
      }

      return this.h;
   }

   @Override
   public void h() {
      this.f = this.g;
      this.a = this.dy();
      super.h();
   }

   public fcu J(float $$0) {
      return this.a.a(this.dy(), (double)$$0);
   }

   public hhu c() {
      gil $$0 = this.a();
      return $$0 == null ? hhl.a(this.cG()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gj().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gj().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bxx.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fy()) {
         if (this.fA().a(cyc.pe)) {
            float $$5 = Math.min((float)this.fC() / 20.0F, 1.0F);
            $$2 *= 1.0F - azk.l($$5) * 0.15F;
         } else if ($$0 && this.gG()) {
            return 0.1F;
         }
      }

      return azk.h($$1, 1.0F, $$2);
   }
}
