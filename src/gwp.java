public class gwp extends gxz<coa, hcy, ggi<hcy>> {
   private static final alg a = alg.b("textures/entity/enderman/enderman.png");
   private final azv j = azv.a();

   public gwp(gwt.a $$0) {
      super($$0, new ggi<>($$0.a(gjn.aR)), 0.5F);
      this.a(new haq(this));
      this.a(new hai(this, $$0.d()));
   }

   public fex a(hcy $$0) {
      fex $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.af;
         return $$1.b(this.j.k() * $$2, 0.0, this.j.k() * $$2);
      } else {
         return $$1;
      }
   }

   public alg b(hcy $$0) {
      return a;
   }

   public hcy a() {
      return new hcy();
   }

   public void a(coa $$0, hcy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gxk.a($$0, $$1, $$2, this.h);
      $$1.a = $$0.t();
      $$1.b = $$0.q();
   }
}
