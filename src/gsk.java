public class gsk extends gsd<cpl, gyr> {
   private final hbm a;

   public gsk(gse.a $$0) {
      super($$0);
      this.a = $$0.b();
   }

   public void a(gyr $$0, ffu $$1, gly $$2, int $$3) {
      $$1.a();
      $$1.a(this.e.b());
      if ($$0.a) {
         $$1.a(a.f.rotationDegrees(180.0F));
         $$1.a(a.d.rotationDegrees(180.0F));
         $$1.a(a.b.rotationDegrees(90.0F));
      }

      $$0.b.a($$1, $$2, $$3, hei.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gyr a() {
      return new gyr();
   }

   public void a(cpl $$0, gyr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
      this.a.a($$1.b, $$0.l(), cwn.h, $$0);
   }
}
