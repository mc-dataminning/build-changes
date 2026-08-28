public class gnv extends gpf<clc, gub, fxx<gub>> {
   private static final alh a = alh.b("textures/entity/enderman/enderman.png");
   private final azr b = azr.a();

   public gnv(gnz.a $$0) {
      super($$0, new fxx<>($$0.a(gba.at)), 0.5F);
      this.a(new grv(this));
      this.a(new grn(this, $$0.d()));
   }

   public ezh a(gub $$0) {
      ezh $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.aa;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public alh b(gub $$0) {
      return a;
   }

   public gub a() {
      return new gub();
   }

   public void a(clc $$0, gub $$1, float $$2) {
      super.a($$0, $$1, $$2);
      goq.a($$0, $$1, $$2);
      $$1.a = $$0.gw();
      $$1.b = $$0.gv();
   }
}
