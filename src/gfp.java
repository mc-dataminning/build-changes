import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gfp extends cnp {
   @Nullable
   private gbi cw;
   protected eye b = eye.c;
   public float c;
   public float d;
   public float e;
   public final gax f;
   public float g;
   public float h;

   public gfp(gax $$0, GameProfile $$1) {
      super($$0, $$0.W(), $$0.X(), $$1);
      this.f = $$0;
   }

   @Override
   public boolean P_() {
      gbi $$0 = this.a();
      return $$0 != null && $$0.e() == ddp.d;
   }

   @Override
   public boolean f() {
      gbi $$0 = this.a();
      return $$0 != null && $$0.e() == ddp.b;
   }

   @Nullable
   protected gbi a() {
      if (this.cw == null) {
         this.cw = fib.Q().L().a(this.cD());
      }

      return this.cw;
   }

   @Override
   public void l() {
      this.g = this.h;
      this.b = this.dv();
      super.l();
   }

   public eye I(float $$0) {
      return this.b.a(this.dv(), (double)$$0);
   }

   public gxl b() {
      gbi $$0 = this.a();
      return $$0 == null ? gxc.a(this.cD()) : $$0.g();
   }

   public float a(boolean $$0) {
      float $$1 = 1.0F;
      if (this.gd().b) {
         $$1 *= 1.1F;
      }

      float $$2 = this.gd().b();
      if ($$2 != 0.0F) {
         float $$3 = (float)this.h(bvm.v) / $$2;
         $$1 *= ($$3 + 1.0F) / 2.0F;
      }

      if (this.fv()) {
         if (this.fx().a(cvo.ow)) {
            float $$4 = Math.min((float)this.fz() / 20.0F, 1.0F);
            $$1 *= 1.0F - azc.k($$4) * 0.15F;
         } else if ($$0 && this.gA()) {
            return 0.1F;
         }
      }

      return $$1;
   }
}
