import java.util.UUID;
import java.util.function.Supplier;

public class geu extends gen<gnn.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final xc E = xc.c("gui.abuseReport.skin.title");
   private fvf F;
   private fun G;

   private geu(gaf $$0, gnm $$1, gnn.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public geu(gaf $$0, gnm $$1, UUID $$2, Supplier<hme> $$3) {
      this($$0, $$1, new gnn.a($$2, $$3, $$1.a().b()));
   }

   public geu(gaf $$0, gnm $$1, gnn $$2) {
      this($$0, $$1, new gnn.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      fyf $$0 = this.z.a(fyf.e().a(8));
      $$0.c().e();
      $$0.a(new fvn(85, 120, this.m.aS(), this.A.e().a()));
      fyf $$1 = $$0.a(fyf.d().a(8));
      this.G = fun.a(c, $$0x -> this.m.a(new get(this, this.A.i(), gnl.b, $$0xx -> {
            this.A.a($$0xx);
            this.G();
         }))).a(178).a();
      $$1.a(fxx.a(this.p, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      $$1.a(fxx.a(this.p, this.F, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void G() {
      gnk $$0 = this.A.i();
      if ($$0 != null) {
         this.G.b($$0.b());
      } else {
         this.G.b(c);
      }

      super.G();
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.F.b($$0, $$1, $$2);
   }
}
