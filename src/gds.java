import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gds extends cmv {
   @Nullable
   private fzk g;
   protected eww b;
   public float c;
   public float d;
   public float e;
   public final fyz f;

   public gds(fyz $$0, GameProfile $$1) {
      super($$0, $$0.V(), $$0.W(), $$1);
      this.b = eww.b;
      this.f = $$0;
   }

   @Override
   public boolean N_() {
      fzk $$0 = this.a();
      return $$0 != null && $$0.e() == dcr.d;
   }

   @Override
   public boolean f() {
      fzk $$0 = this.a();
      return $$0 != null && $$0.e() == dcr.b;
   }

   @Nullable
   protected fzk a() {
      if (this.g == null) {
         this.g = fgi.Q().L().a(this.cA());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.dt();
      super.l();
   }

   public eww F(float $$0) {
      return this.b.a(this.dt(), (double)$$0);
   }

   public grf b() {
      fzk $$0 = this.a();
      return $$0 == null ? gqx.a(this.cA()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.ga().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(buu.v) / this.ga().b() + 1.0F) / 2.0F;
      if (this.ga().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cuo $$1 = this.fu();
      if (this.fs()) {
         if ($$1.a(cur.ov)) {
            int $$2 = this.fw();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (fgi.Q().m.aA().a() && this.gx()) {
            return 0.1F;
         }
      }

      return ayn.i(fgi.Q().m.ak().c().floatValue(), 1.0F, $$0);
   }
}
