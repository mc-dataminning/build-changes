import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fzh extends cka {
   @Nullable
   private fvb g;
   protected esj b;
   public float c;
   public float d;
   public float e;
   public final fuq f;

   public fzh(fuq $$0, GameProfile $$1) {
      super($$0, $$0.U(), $$0.V(), $$1);
      this.b = esj.b;
      this.f = $$0;
   }

   @Override
   public boolean N_() {
      fvb $$0 = this.a();
      return $$0 != null && $$0.e() == czd.d;
   }

   @Override
   public boolean f() {
      fvb $$0 = this.a();
      return $$0 != null && $$0.e() == czd.b;
   }

   @Nullable
   protected fvb a() {
      if (this.g == null) {
         this.g = fby.Q().L().a(this.cw());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.dp();
      super.l();
   }

   public esj E(float $$0) {
      return this.b.a(this.dp(), (double)$$0);
   }

   public gmr b() {
      fvb $$0 = this.a();
      return $$0 == null ? gmk.a(this.cw()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.ga().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(bsa.r) / this.ga().b() + 1.0F) / 2.0F;
      if (this.ga().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      crs $$1 = this.fu();
      if (this.fs()) {
         if ($$1.a(crv.ot)) {
            int $$2 = this.fw();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (fby.Q().m.aA().a() && this.gx()) {
            return 0.1F;
         }
      }

      return axm.i(fby.Q().m.ak().c().floatValue(), 1.0F, $$0);
   }
}
