import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gha extends com {
   @Nullable
   private gct i;
   protected ezn b = ezn.c;
   public float c;
   public float d;
   public float e;
   public final gci f;
   public float g;
   public float h;

   public gha(gci $$0, GameProfile $$1) {
      super($$0, $$0.W(), $$0.X(), $$1);
      this.f = $$0;
   }

   @Override
   public boolean R_() {
      gct $$0 = this.a();
      return $$0 != null && $$0.e() == dey.d;
   }

   @Override
   public boolean f() {
      gct $$0 = this.a();
      return $$0 != null && $$0.e() == dey.b;
   }

   @Nullable
   protected gct a() {
      if (this.i == null) {
         this.i = fji.Q().L().a(this.cH());
      }

      return this.i;
   }

   @Override
   public void l() {
      this.g = this.h;
      this.b = this.dA();
      super.l();
   }

   public ezn I(float $$0) {
      return this.b.a(this.dA(), (double)$$0);
   }

   public gze b() {
      gct $$0 = this.a();
      return $$0 == null ? gyv.a(this.cH()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gl().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gl().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bwi.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fB()) {
         if (this.fD().a(cwf.ow)) {
            float $$5 = Math.min((float)this.fF() / 20.0F, 1.0F);
            $$2 *= 1.0F - azk.l($$5) * 0.15F;
         } else if ($$0 && this.gI()) {
            return 0.1F;
         }
      }

      return azk.h($$1, 1.0F, $$2);
   }
}
