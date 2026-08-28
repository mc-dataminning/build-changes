import java.util.UUID;
import java.util.function.Supplier;

public class gcj extends gcc<glb.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final wy E = wy.c("gui.abuseReport.skin.title");
   private fsu F;
   private fsc G;

   private gcj(fxu $$0, gla $$1, glb.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public gcj(fxu $$0, gla $$1, UUID $$2, Supplier<hjq> $$3) {
      this($$0, $$1, new glb.a($$2, $$3, $$1.a().b()));
   }

   public gcj(fxu $$0, gla $$1, glb $$2) {
      this($$0, $$1, new glb.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      fvu $$0 = this.z.a(fvu.e().a(8));
      $$0.c().e();
      $$0.a(new ftc(85, 120, this.m.aS(), this.A.e().a()));
      fvu $$1 = $$0.a(fvu.d().a(8));
      this.G = fsc.a(c, $$0x -> this.m.a(new gci(this, this.A.i(), gkz.b, $$0xx -> {
            this.A.a($$0xx);
            this.G();
         }))).a(178).a();
      $$1.a(fvm.a(this.p, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      $$1.a(fvm.a(this.p, this.F, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void G() {
      gky $$0 = this.A.i();
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
