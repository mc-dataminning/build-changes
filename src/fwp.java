import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fwp extends cis {
   @Nullable
   private fsj g;
   protected epr b;
   public float c;
   public float d;
   public float e;
   public final fry f;

   public fwp(fry $$0, GameProfile $$1) {
      super($$0, $$0.T(), $$0.U(), $$1);
      this.b = epr.b;
      this.f = $$0;
   }

   @Override
   public boolean N_() {
      fsj $$0 = this.a();
      return $$0 != null && $$0.e() == cww.d;
   }

   @Override
   public boolean f() {
      fsj $$0 = this.a();
      return $$0 != null && $$0.e() == cww.b;
   }

   @Nullable
   protected fsj a() {
      if (this.g == null) {
         this.g = ezg.Q().L().a(this.cw());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.dp();
      super.l();
   }

   public epr E(float $$0) {
      return this.b.a(this.dp(), (double)$$0);
   }

   public gjy b() {
      fsj $$0 = this.a();
      return $$0 == null ? gjr.a(this.cw()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.ga().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(bqv.r) / this.ga().b() + 1.0F) / 2.0F;
      if (this.ga().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cqk $$1 = this.fu();
      if (this.fs()) {
         if ($$1.a(cqn.ot)) {
            int $$2 = this.fw();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (ezg.Q().m.ay().a() && this.gx()) {
            return 0.1F;
         }
      }

      return aww.i(ezg.Q().m.ai().c().floatValue(), 1.0F, $$0);
   }
}
