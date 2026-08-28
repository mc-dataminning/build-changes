import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gfz extends cnu {
   @Nullable
   private gbs cv;
   protected eys b = eys.c;
   public float c;
   public float d;
   public float e;
   public final gbh f;
   public float g;
   public float h;

   public gfz(gbh $$0, GameProfile $$1) {
      super($$0, $$0.W(), $$0.X(), $$1);
      this.f = $$0;
   }

   @Override
   public boolean P_() {
      gbs $$0 = this.a();
      return $$0 != null && $$0.e() == ded.d;
   }

   @Override
   public boolean f() {
      gbs $$0 = this.a();
      return $$0 != null && $$0.e() == ded.b;
   }

   @Nullable
   protected gbs a() {
      if (this.cv == null) {
         this.cv = fil.Q().L().a(this.cD());
      }

      return this.cv;
   }

   @Override
   public void l() {
      this.g = this.h;
      this.b = this.dv();
      super.l();
   }

   public eys I(float $$0) {
      return this.b.a(this.dv(), (double)$$0);
   }

   public gyc b() {
      gbs $$0 = this.a();
      return $$0 == null ? gxt.a(this.cD()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gd().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gd().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bvr.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fv()) {
         if (this.fx().a(cvt.ow)) {
            float $$5 = Math.min((float)this.fz() / 20.0F, 1.0F);
            $$2 *= 1.0F - azd.k($$5) * 0.15F;
         } else if ($$0 && this.gA()) {
            return 0.1F;
         }
      }

      return azd.h($$1, 1.0F, $$2);
   }
}
