import java.util.UUID;
import java.util.function.Supplier;

public class fwj extends fwc<geq.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final xj E = xj.c("gui.abuseReport.skin.title");
   private fmv F;
   private fmd G;

   private fwj(frw $$0, gep $$1, geq.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public fwj(frw $$0, gep $$1, UUID $$2, Supplier<haf> $$3) {
      this($$0, $$1, new geq.a($$2, $$3, $$1.a().b()));
   }

   public fwj(frw $$0, gep $$1, geq $$2) {
      this($$0, $$1, new geq.a($$2, $$1.a().b()));
   }

   @Override
   protected void F() {
      fpw $$0 = this.z.a(fpw.e().a(8));
      $$0.c().e();
      $$0.a(new fnd(85, 120, this.m.aS(), this.A.e().a()));
      fpw $$1 = $$0.a(fpw.d().a(8));
      this.G = fmd.a(c, $$0x -> this.m.a(new fwi(this, this.A.i(), geo.b, $$0xx -> {
            this.A.a($$0xx);
            this.J();
         }))).a(178).a();
      $$1.a(fpo.a(this.p, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.J();
      });
      $$1.a(fpo.a(this.p, this.F, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void J() {
      gen $$0 = this.A.i();
      if ($$0 != null) {
         this.G.b($$0.b());
      } else {
         this.G.b(c);
      }

      super.J();
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.F.b($$0, $$1, $$2);
   }
}
