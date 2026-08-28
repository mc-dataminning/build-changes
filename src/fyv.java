import java.util.UUID;
import java.util.function.Supplier;

public class fyv extends fyo<ghg.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final wo E = wo.c("gui.abuseReport.skin.title");
   private fpi F;
   private fop G;

   private fyv(fui $$0, ghf $$1, ghg.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public fyv(fui $$0, ghf $$1, UUID $$2, Supplier<hfo> $$3) {
      this($$0, $$1, new ghg.a($$2, $$3, $$1.a().b()));
   }

   public fyv(fui $$0, ghf $$1, ghg $$2) {
      this($$0, $$1, new ghg.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      fsi $$0 = this.z.a(fsi.e().a(8));
      $$0.c().e();
      $$0.a(new fpq(85, 120, this.m.aS(), this.A.e().a()));
      fsi $$1 = $$0.a(fsi.d().a(8));
      this.G = fop.a(c, $$0x -> this.m.a(new fyu(this, this.A.i(), ghe.b, $$0xx -> {
            this.A.a($$0xx);
            this.G();
         }))).a(178).a();
      $$1.a(fsa.a(this.p, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      $$1.a(fsa.a(this.p, this.F, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void G() {
      ghd $$0 = this.A.i();
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
