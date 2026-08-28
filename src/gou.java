import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gou extends crc {
   @Nullable
   private gkl h;
   protected feq a = feq.c;
   public float b;
   public float c;
   public float d;
   public final gjz e;
   public float f;
   public float g;

   public gou(gjz $$0, GameProfile $$1) {
      super($$0, $$0.aa(), $$0.ab(), $$1);
      this.e = $$0;
   }

   @Override
   public boolean V_() {
      gkl $$0 = this.a();
      return $$0 != null && $$0.e() == dix.d;
   }

   @Override
   public boolean b() {
      gkl $$0 = this.a();
      return $$0 != null && $$0.e() == dix.b;
   }

   @Nullable
   protected gkl a() {
      if (this.h == null) {
         this.h = foz.Q().L().a(this.cG());
      }

      return this.h;
   }

   @Override
   public void h() {
      this.f = this.g;
      this.a = this.dy();
      super.h();
   }

   public feq I(float $$0) {
      return this.a.a(this.dy(), (double)$$0);
   }

   public hjy c() {
      gkl $$0 = this.a();
      return $$0 == null ? hjp.a(this.cG()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gk().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gk().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(byk.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fz()) {
         if (this.fB().a(czh.pj)) {
            float $$5 = Math.min((float)this.fD() / 20.0F, 1.0F);
            $$2 *= 1.0F - azm.l($$5) * 0.15F;
         } else if ($$0 && this.gH()) {
            return 0.1F;
         }
      }

      return azm.h($$1, 1.0F, $$2);
   }
}
