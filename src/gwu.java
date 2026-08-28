public class gwu extends gye<cod, hde, ggn<hde>> {
   private static final alg a = alg.b("textures/entity/enderman/enderman.png");
   private final azv j = azv.a();

   public gwu(gwy.a $$0) {
      super($$0, new ggn<>($$0.a(gjs.aR)), 0.5F);
      this.a(new hav(this));
      this.a(new han(this, $$0.d()));
   }

   public ffc a(hde $$0) {
      ffc $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.af;
         return $$1.b(this.j.k() * $$2, 0.0, this.j.k() * $$2);
      } else {
         return $$1;
      }
   }

   public alg b(hde $$0) {
      return a;
   }

   public hde a() {
      return new hde();
   }

   public void a(cod $$0, hde $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gxp.a($$0, $$1, $$2, this.h);
      $$1.a = $$0.t();
      $$1.b = $$0.q();
   }
}
