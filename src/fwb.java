import java.util.UUID;
import java.util.function.Supplier;

public class fwb extends fvu<geh.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final xl E = xl.c("gui.abuseReport.skin.title");
   private fmo F;
   private flw G;

   private fwb(frp $$0, geg $$1, geh.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public fwb(frp $$0, geg $$1, UUID $$2, Supplier<gzu> $$3) {
      this($$0, $$1, new geh.a($$2, $$3, $$1.a().b()));
   }

   public fwb(frp $$0, geg $$1, geh $$2) {
      this($$0, $$1, new geh.a($$2, $$1.a().b()));
   }

   @Override
   protected void D() {
      fpp $$0 = this.z.a(fpp.e().a(8));
      $$0.c().e();
      $$0.a(new fmw(85, 120, this.m.aS(), this.A.e().a()));
      fpp $$1 = $$0.a(fpp.d().a(8));
      this.G = flw.a(c, $$0x -> this.m.a(new fwa(this, this.A.i(), gef.b, $$0xx -> {
            this.A.a($$0xx);
            this.F();
         }))).a(178).a();
      $$1.a(fph.a(this.p, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.F();
      });
      $$1.a(fph.a(this.p, this.F, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void F() {
      gee $$0 = this.A.i();
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
