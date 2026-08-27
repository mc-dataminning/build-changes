import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fus extends chl {
   @Nullable
   private fqn g;
   protected enz b;
   public float c;
   public float d;
   public float e;
   public final fqe f;

   public fus(fqe $$0, GameProfile $$1) {
      super($$0, $$0.T(), $$0.U(), $$1);
      this.b = enz.b;
      this.f = $$0;
   }

   @Override
   public boolean P_() {
      fqn $$0 = this.a();
      return $$0 != null && $$0.e() == cvo.d;
   }

   @Override
   public boolean f() {
      fqn $$0 = this.a();
      return $$0 != null && $$0.e() == cvo.b;
   }

   @Nullable
   protected fqn a() {
      if (this.g == null) {
         this.g = exo.P().K().a(this.cw());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.dp();
      super.l();
   }

   public enz C(float $$0) {
      return this.b.a(this.dp(), (double)$$0);
   }

   public gia b() {
      fqn $$0 = this.a();
      return $$0 == null ? ght.a(this.cw()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fU().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(bpp.o) / this.fU().b() + 1.0F) / 2.0F;
      if (this.fU().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cpd $$1 = this.fp();
      if (this.fn()) {
         if ($$1.a(cpg.ot)) {
            int $$2 = this.fr();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (exo.P().m.ax().a() && this.gr()) {
            return 0.1F;
         }
      }

      return awi.i(exo.P().m.ah().c().floatValue(), 1.0F, $$0);
   }
}
