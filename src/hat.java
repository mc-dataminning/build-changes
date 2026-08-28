public class hat extends gzb<csa, hgp, gka> {
   private static final alr a = alr.b("textures/entity/wandering_trader.png");

   public hat(gxv.a $$0) {
      super($$0, new gka($$0.a(gkq.dO)), 0.5F);
      this.a(new hbo<>(this, $$0.f()));
      this.a(new hbn<>(this));
   }

   public alr a(hgp $$0) {
      return a;
   }

   public hgp b() {
      return new hgp();
   }

   public void a(csa $$0, hgp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      het.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
   }
}
