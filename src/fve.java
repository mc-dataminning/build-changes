import java.util.UUID;
import java.util.function.Supplier;

public class fve extends fux<gdg.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final xh E = xh.c("gui.abuseReport.skin.title");
   private flr F;
   private fkz G;

   private fve(fqs $$0, gdf $$1, gdg.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public fve(fqs $$0, gdf $$1, UUID $$2, Supplier<gyt> $$3) {
      this($$0, $$1, new gdg.a($$2, $$3, $$1.a().b()));
   }

   public fve(fqs $$0, gdf $$1, gdg $$2) {
      this($$0, $$1, new gdg.a($$2, $$1.a().b()));
   }

   @Override
   protected void D() {
      fos $$0 = this.z.a(fos.e().a(8));
      $$0.c().e();
      $$0.a(new flz(85, 120, this.m.aT(), this.A.e().a()));
      fos $$1 = $$0.a(fos.d().a(8));
      this.G = fkz.a(c, $$0x -> this.m.a(new fvd(this, this.A.i(), gde.b, $$0xx -> {
            this.A.a($$0xx);
            this.F();
         }))).a(178).a();
      $$1.a(foj.a(this.p, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.F();
      });
      $$1.a(foj.a(this.p, this.F, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void F() {
      gdd $$0 = this.A.i();
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
