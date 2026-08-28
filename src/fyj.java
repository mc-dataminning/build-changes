import java.util.UUID;
import java.util.function.Supplier;

public class fyj extends fyc<ggs.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final xv E = xv.c("gui.abuseReport.skin.title");
   private fow F;
   private fod G;

   private fyj(ftw $$0, ggr $$1, ggs.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public fyj(ftw $$0, ggr $$1, UUID $$2, Supplier<hck> $$3) {
      this($$0, $$1, new ggs.a($$2, $$3, $$1.a().b()));
   }

   public fyj(ftw $$0, ggr $$1, ggs $$2) {
      this($$0, $$1, new ggs.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      frw $$0 = this.z.a(frw.e().a(8));
      $$0.c().e();
      $$0.a(new fpe(85, 120, this.m.aS(), this.A.e().a()));
      frw $$1 = $$0.a(frw.d().a(8));
      this.G = fod.a(c, $$0x -> this.m.a(new fyi(this, this.A.i(), ggq.b, $$0xx -> {
            this.A.a($$0xx);
            this.G();
         }))).a(178).a();
      $$1.a(fro.a(this.p, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      $$1.a(fro.a(this.p, this.F, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void G() {
      ggp $$0 = this.A.i();
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
