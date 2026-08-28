import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class ggp extends coh {
   @Nullable
   private gci i;
   protected ezh b = ezh.c;
   public float c;
   public float d;
   public float e;
   public final gbx f;
   public float g;
   public float h;

   public ggp(gbx $$0, GameProfile $$1) {
      super($$0, $$0.W(), $$0.X(), $$1);
      this.f = $$0;
   }

   @Override
   public boolean R_() {
      gci $$0 = this.a();
      return $$0 != null && $$0.e() == des.d;
   }

   @Override
   public boolean f() {
      gci $$0 = this.a();
      return $$0 != null && $$0.e() == des.b;
   }

   @Nullable
   protected gci a() {
      if (this.i == null) {
         this.i = fja.Q().L().a(this.cH());
      }

      return this.i;
   }

   @Override
   public void l() {
      this.g = this.h;
      this.b = this.dA();
      super.l();
   }

   public ezh I(float $$0) {
      return this.b.a(this.dA(), (double)$$0);
   }

   public gyt b() {
      gci $$0 = this.a();
      return $$0 == null ? gyk.a(this.cH()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gl().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gl().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bwd.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fB()) {
         if (this.fD().a(cwb.ow)) {
            float $$5 = Math.min((float)this.fF() / 20.0F, 1.0F);
            $$2 *= 1.0F - azj.l($$5) * 0.15F;
         } else if ($$0 && this.gI()) {
            return 0.1F;
         }
      }

      return azj.h($$1, 1.0F, $$2);
   }
}
