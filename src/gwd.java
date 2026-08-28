public class gwd extends gxn<cnt, hcm, gfw<hcm>> {
   private static final alg a = alg.b("textures/entity/enderman/enderman.png");
   private final azv j = azv.a();

   public gwd(gwh.a $$0) {
      super($$0, new gfw<>($$0.a(gjb.aR)), 0.5F);
      this.a(new hae(this));
      this.a(new gzw(this, $$0.d()));
   }

   public feq a(hcm $$0) {
      feq $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.af;
         return $$1.b(this.j.k() * $$2, 0.0, this.j.k() * $$2);
      } else {
         return $$1;
      }
   }

   public alg b(hcm $$0) {
      return a;
   }

   public hcm a() {
      return new hcm();
   }

   public void a(cnt $$0, hcm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gwy.a($$0, $$1, $$2, this.h);
      $$1.a = $$0.t();
      $$1.b = $$0.q();
   }
}
