import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gad extends ckl {
   @Nullable
   private fvx g;
   protected etf b;
   public float c;
   public float d;
   public float e;
   public final fvm f;

   public gad(fvm $$0, GameProfile $$1) {
      super($$0, $$0.U(), $$0.V(), $$1);
      this.b = etf.b;
      this.f = $$0;
   }

   @Override
   public boolean N_() {
      fvx $$0 = this.a();
      return $$0 != null && $$0.e() == czr.d;
   }

   @Override
   public boolean f() {
      fvx $$0 = this.a();
      return $$0 != null && $$0.e() == czr.b;
   }

   @Nullable
   protected fvx a() {
      if (this.g == null) {
         this.g = fcu.Q().L().a(this.cx());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.dq();
      super.l();
   }

   public etf E(float $$0) {
      return this.b.a(this.dq(), (double)$$0);
   }

   public gnn b() {
      fvx $$0 = this.a();
      return $$0 == null ? gng.a(this.cx()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.gb().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(bsl.r) / this.gb().b() + 1.0F) / 2.0F;
      if (this.gb().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      csd $$1 = this.fv();
      if (this.ft()) {
         if ($$1.a(csg.ou)) {
            int $$2 = this.fx();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (fcu.Q().m.aA().a() && this.gy()) {
            return 0.1F;
         }
      }

      return axw.i(fcu.Q().m.ak().c().floatValue(), 1.0F, $$0);
   }
}
