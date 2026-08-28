import java.util.UUID;
import java.util.function.Supplier;

public class fyz extends fys<ghk.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final wp E = wp.c("gui.abuseReport.skin.title");
   private fpm F;
   private fou G;

   private fyz(fum $$0, ghj $$1, ghk.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public fyz(fum $$0, ghj $$1, UUID $$2, Supplier<hfv> $$3) {
      this($$0, $$1, new ghk.a($$2, $$3, $$1.a().b()));
   }

   public fyz(fum $$0, ghj $$1, ghk $$2) {
      this($$0, $$1, new ghk.a($$2, $$1.a().b()));
   }

   @Override
   protected void E() {
      fsm $$0 = this.z.a(fsm.e().a(8));
      $$0.c().e();
      $$0.a(new fpu(85, 120, this.m.aS(), this.A.e().a()));
      fsm $$1 = $$0.a(fsm.d().a(8));
      this.G = fou.a(c, $$0x -> this.m.a(new fyy(this, this.A.i(), ghi.b, $$0xx -> {
            this.A.a($$0xx);
            this.G();
         }))).a(178).a();
      $$1.a(fse.a(this.p, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.G();
      });
      $$1.a(fse.a(this.p, this.F, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void G() {
      ghh $$0 = this.A.i();
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
