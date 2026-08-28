import java.util.UUID;
import java.util.function.Supplier;

public class fyl extends fye<ggu.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final xv E = xv.c("gui.abuseReport.skin.title");
   private foy F;
   private fof G;

   private fyl(fty $$0, ggt $$1, ggu.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public fyl(fty $$0, ggt $$1, UUID $$2, Supplier<hcm> $$3) {
      this($$0, $$1, new ggu.a($$2, $$3, $$1.a().b()));
   }

   public fyl(fty $$0, ggt $$1, ggu $$2) {
      this($$0, $$1, new ggu.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      fry $$0 = this.z.a(fry.e().a(8));
      $$0.c().e();
      $$0.a(new fpg(85, 120, this.m.aS(), this.A.e().a()));
      fry $$1 = $$0.a(fry.d().a(8));
      this.G = fof.a(c, $$0x -> this.m.a(new fyk(this, this.A.i(), ggs.b, $$0xx -> {
            this.A.a($$0xx);
            this.G();
         }))).a(178).a();
      $$1.a(frq.a(this.p, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      $$1.a(frq.a(this.p, this.F, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void G() {
      ggr $$0 = this.A.i();
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
