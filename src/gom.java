import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gom extends cqy {
   @Nullable
   private gkd h;
   protected fei a = fei.c;
   public float b;
   public float c;
   public float d;
   public final gjr e;
   public float f;
   public float g;

   public gom(gjr $$0, GameProfile $$1) {
      super($$0, $$0.aa(), $$0.ab(), $$1);
      this.e = $$0;
   }

   @Override
   public boolean U_() {
      gkd $$0 = this.a();
      return $$0 != null && $$0.e() == dis.d;
   }

   @Override
   public boolean b() {
      gkd $$0 = this.a();
      return $$0 != null && $$0.e() == dis.b;
   }

   @Nullable
   protected gkd a() {
      if (this.h == null) {
         this.h = fos.Q().L().a(this.cG());
      }

      return this.h;
   }

   @Override
   public void h() {
      this.f = this.g;
      this.a = this.dy();
      super.h();
   }

   public fei I(float $$0) {
      return this.a.a(this.dy(), (double)$$0);
   }

   public hjq c() {
      gkd $$0 = this.a();
      return $$0 == null ? hjh.a(this.cG()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gj().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gj().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(byi.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fy()) {
         if (this.fA().a(czc.pg)) {
            float $$5 = Math.min((float)this.fC() / 20.0F, 1.0F);
            $$2 *= 1.0F - azm.l($$5) * 0.15F;
         } else if ($$0 && this.gG()) {
            return 0.1F;
         }
      }

      return azm.h($$1, 1.0F, $$2);
   }
}
