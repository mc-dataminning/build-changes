import java.util.UUID;
import java.util.function.Supplier;

public class fut extends fum<gcv.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final xe E = xe.c("gui.abuseReport.skin.title");
   private flg F;
   private fko G;

   private fut(fqh $$0, gcu $$1, gcv.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public fut(fqh $$0, gcu $$1, UUID $$2, Supplier<gyh> $$3) {
      this($$0, $$1, new gcv.a($$2, $$3, $$1.a().b()));
   }

   public fut(fqh $$0, gcu $$1, gcv $$2) {
      this($$0, $$1, new gcv.a($$2, $$1.a().b()));
   }

   @Override
   protected void D() {
      fog $$0 = this.z.a(fog.e().a(8));
      $$0.c().e();
      $$0.a(new flo(85, 120, this.m.aT(), this.A.e().a()));
      fog $$1 = $$0.a(fog.d().a(8));
      this.G = fko.a(c, $$0x -> this.m.a(new fus(this, this.A.i(), gct.b, $$0xx -> {
            this.A.a($$0xx);
            this.F();
         }))).a(178).a();
      $$1.a(fny.a(this.p, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.F();
      });
      $$1.a(fny.a(this.p, this.F, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void F() {
      gcs $$0 = this.A.i();
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
