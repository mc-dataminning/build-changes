import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class ful extends chh {
   @Nullable
   private fqg g;
   protected ens b;
   public float c;
   public float d;
   public float e;
   public final fpx f;

   public ful(fpx $$0, GameProfile $$1) {
      super($$0, $$0.T(), $$0.U(), $$1);
      this.b = ens.b;
      this.f = $$0;
   }

   @Override
   public boolean P_() {
      fqg $$0 = this.a();
      return $$0 != null && $$0.e() == cvk.d;
   }

   @Override
   public boolean f() {
      fqg $$0 = this.a();
      return $$0 != null && $$0.e() == cvk.b;
   }

   @Nullable
   protected fqg a() {
      if (this.g == null) {
         this.g = exh.O().J().a(this.cw());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.dp();
      super.l();
   }

   public ens C(float $$0) {
      return this.b.a(this.dp(), (double)$$0);
   }

   public ght b() {
      fqg $$0 = this.a();
      return $$0 == null ? ghm.a(this.cw()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fU().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(bpl.o) / this.fU().b() + 1.0F) / 2.0F;
      if (this.fU().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      coz $$1 = this.fp();
      if (this.fn()) {
         if ($$1.a(cpc.ot)) {
            int $$2 = this.fr();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (exh.O().m.ax().a() && this.gr()) {
            return 0.1F;
         }
      }

      return awh.i(exh.O().m.ah().c().floatValue(), 1.0F, $$0);
   }
}
