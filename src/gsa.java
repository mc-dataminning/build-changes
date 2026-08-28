public class gsa extends gtk<clo, gyj, gbz<gyj>> {
   private static final akv a = akv.b("textures/entity/enderman/enderman.png");
   private final azh b = azh.a();

   public gsa(gse.a $$0) {
      super($$0, new gbz<>($$0.a(gfc.aH)), 0.5F);
      this.a(new gwb(this));
      this.a(new gvt(this, $$0.d()));
   }

   public fba a(gyj $$0) {
      fba $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.af;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public akv b(gyj $$0) {
      return a;
   }

   public gyj a() {
      return new gyj();
   }

   public void a(clo $$0, gyj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsv.a($$0, $$1, $$2, this.i);
      $$1.a = $$0.gs();
      $$1.b = $$0.x();
   }
}
