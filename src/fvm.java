import java.util.UUID;
import java.util.function.Supplier;

public class fvm extends fvf<gdr.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final xi E = xi.c("gui.abuseReport.skin.title");
   private flz F;
   private flh G;

   private fvm(fra $$0, gdq $$1, gdr.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public fvm(fra $$0, gdq $$1, UUID $$2, Supplier<gze> $$3) {
      this($$0, $$1, new gdr.a($$2, $$3, $$1.a().b()));
   }

   public fvm(fra $$0, gdq $$1, gdr $$2) {
      this($$0, $$1, new gdr.a($$2, $$1.a().b()));
   }

   @Override
   protected void D() {
      fpa $$0 = this.z.a(fpa.e().a(8));
      $$0.c().e();
      $$0.a(new fmh(85, 120, this.m.aS(), this.A.e().a()));
      fpa $$1 = $$0.a(fpa.d().a(8));
      this.G = flh.a(c, $$0x -> this.m.a(new fvl(this, this.A.i(), gdp.b, $$0xx -> {
            this.A.a($$0xx);
            this.F();
         }))).a(178).a();
      $$1.a(fos.a(this.p, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.F();
      });
      $$1.a(fos.a(this.p, this.F, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void F() {
      gdo $$0 = this.A.i();
      if ($$0 != null) {
         this.G.b($$0.b());
      } else {
         this.G.b(c);
      }

      super.F();
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.F.b($$0, $$1, $$2);
   }
}
