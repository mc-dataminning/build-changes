import java.util.UUID;
import java.util.function.Supplier;

public class gef extends gdy<gmy.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final xg E = xg.c("gui.abuseReport.skin.title");
   private fuq F;
   private fty G;

   private gef(fzq $$0, gmx $$1, gmy.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public gef(fzq $$0, gmx $$1, UUID $$2, Supplier<hls> $$3) {
      this($$0, $$1, new gmy.a($$2, $$3, $$1.a().b()));
   }

   public gef(fzq $$0, gmx $$1, gmy $$2) {
      this($$0, $$1, new gmy.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      fxq $$0 = this.z.a(fxq.e().a(8));
      $$0.c().e();
      $$0.a(new fuy(85, 120, this.m.aS(), this.A.e().a()));
      fxq $$1 = $$0.a(fxq.d().a(8));
      this.G = fty.a(c, $$0x -> this.m.a(new gee(this, this.A.i(), gmw.b, $$0xx -> {
            this.A.a($$0xx);
            this.G();
         }))).a(178).a();
      $$1.a(fxi.a(this.p, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      $$1.a(fxi.a(this.p, this.F, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void G() {
      gmv $$0 = this.A.i();
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
