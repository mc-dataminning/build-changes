public class hbi extends gzq<crr, hhb, gkp> {
   private static final alk a = alk.b("textures/entity/wandering_trader.png");

   public hbi(gyk.a $$0) {
      super($$0, new gkp($$0.a(glf.dO)), 0.5F);
      this.a(new hcd<>(this, $$0.f()));
      this.a(new hcc<>(this));
   }

   public alk a(hhb $$0) {
      return a;
   }

   public hhb b() {
      return new hhb();
   }

   public void a(crr $$0, hhb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hfg.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
   }
}
