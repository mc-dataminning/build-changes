import java.util.UUID;
import java.util.function.Supplier;

public class ges extends gel<gnl.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final xa E = xa.c("gui.abuseReport.skin.title");
   private fvd F;
   private ful G;

   private ges(gad $$0, gnk $$1, gnl.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public ges(gad $$0, gnk $$1, UUID $$2, Supplier<hmc> $$3) {
      this($$0, $$1, new gnl.a($$2, $$3, $$1.a().b()));
   }

   public ges(gad $$0, gnk $$1, gnl $$2) {
      this($$0, $$1, new gnl.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      fyd $$0 = this.z.a(fyd.e().a(8));
      $$0.c().e();
      $$0.a(new fvl(85, 120, this.m.aS(), this.A.e().a()));
      fyd $$1 = $$0.a(fyd.d().a(8));
      this.G = ful.a(c, $$0x -> this.m.a(new ger(this, this.A.i(), gnj.b, $$0xx -> {
            this.A.a($$0xx);
            this.G();
         }))).a(178).a();
      $$1.a(fxv.a(this.p, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      $$1.a(fxv.a(this.p, this.F, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void G() {
      gni $$0 = this.A.i();
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
