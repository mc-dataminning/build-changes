import java.util.UUID;
import java.util.function.Supplier;

public class fup extends fui<gcq.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final xd E = xd.c("gui.abuseReport.skin.title");
   private flc F;
   private fkk G;

   private fup(fqd $$0, gcp $$1, gcq.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public fup(fqd $$0, gcp $$1, UUID $$2, Supplier<gyc> $$3) {
      this($$0, $$1, new gcq.a($$2, $$3, $$1.a().b()));
   }

   public fup(fqd $$0, gcp $$1, gcq $$2) {
      this($$0, $$1, new gcq.a($$2, $$1.a().b()));
   }

   @Override
   protected void D() {
      foc $$0 = this.z.a(foc.e().a(8));
      $$0.c().e();
      $$0.a(new flk(85, 120, this.m.aT(), this.A.e().a()));
      foc $$1 = $$0.a(foc.d().a(8));
      this.G = fkk.a(c, $$0x -> this.m.a(new fuo(this, this.A.i(), gco.b, $$0xx -> {
            this.A.a($$0xx);
            this.F();
         }))).a(178).a();
      $$1.a(fnu.a(this.p, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.F();
      });
      $$1.a(fnu.a(this.p, this.F, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void F() {
      gcn $$0 = this.A.i();
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
