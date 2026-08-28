import java.util.UUID;
import java.util.function.Supplier;

public class gau extends gan<gjj.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final wv E = wv.c("gui.abuseReport.skin.title");
   private frf F;
   private fqn G;

   private gau(fwf $$0, gji $$1, gjj.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public gau(fwf $$0, gji $$1, UUID $$2, Supplier<hhu> $$3) {
      this($$0, $$1, new gjj.a($$2, $$3, $$1.a().b()));
   }

   public gau(fwf $$0, gji $$1, gjj $$2) {
      this($$0, $$1, new gjj.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      fuf $$0 = this.z.a(fuf.e().a(8));
      $$0.c().e();
      $$0.a(new frn(85, 120, this.m.aS(), this.A.e().a()));
      fuf $$1 = $$0.a(fuf.d().a(8));
      this.G = fqn.a(c, $$0x -> this.m.a(new gat(this, this.A.i(), gjh.b, $$0xx -> {
            this.A.a($$0xx);
            this.G();
         }))).a(178).a();
      $$1.a(ftx.a(this.p, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      $$1.a(ftx.a(this.p, this.F, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void G() {
      gjg $$0 = this.A.i();
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
