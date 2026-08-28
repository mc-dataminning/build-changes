public class gzw extends gye<cre, hfp, gjc> {
   private static final alg a = alg.b("textures/entity/wandering_trader.png");

   public gzw(gwy.a $$0) {
      super($$0, new gjc($$0.a(gjs.dO)), 0.5F);
      this.a(new har<>(this, $$0.f()));
      this.a(new haq<>(this));
   }

   public alg a(hfp $$0) {
      return a;
   }

   public hfp b() {
      return new hfp();
   }

   public void a(cre $$0, hfp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hdu.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
   }
}
